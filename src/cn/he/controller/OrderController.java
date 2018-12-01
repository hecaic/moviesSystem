package cn.he.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.he.model.User;
import cn.he.model.Order;
import cn.he.model.Sum;
import cn.he.service.OrderService;
import javafx.scene.control.Alert;


@Controller
public class OrderController {

	
	
	@Autowired

	@Resource(name="orderService")
	private OrderService orderService;
	
	/**
	 * 从数据库中获取全部的用户列表
	 * 
	 * @return ModelAndView
	 */
	
	
	@RequestMapping("/Orderlist")
	public ModelAndView Orderlist() {
		ModelAndView mv = new ModelAndView();
          
		List<Order> Orderlist = orderService.listOrderAll();

		mv.addObject("Orderlist", Orderlist);
		
      
        
		mv.setViewName("OrderList");
		return mv;
	}
	
	@RequestMapping("/FindUserList")
	public ModelAndView FindUserList(String userName) {
		ModelAndView mv = new ModelAndView();
          
		List<Order> FindUserList = orderService.FindUserList(userName);

		mv.addObject("FindUserList", FindUserList);
		
      
        
		mv.setViewName("userorderlist");
		return mv;
	}
	@RequestMapping("/userOrderlist")
	public ModelAndView UserOrderlist(HttpSession session) {
		User currentUser =  (User) session.getAttribute("currentUser");
		ModelAndView mv = new ModelAndView();  
		List<Order> userOrder = orderService.findOrderByUserName(currentUser.getLoginname());
		mv.addObject("userOrder", userOrder);
		mv.setViewName("userOrder");
		return mv;
	}
	
	@RequestMapping("/FindByOrserid")
	public ModelAndView FindByfilmName(HttpSession session) {
		String currentorderId = (String) session.getAttribute("currentorderId");
		ModelAndView mv = new ModelAndView();
		Order FindByfilmName = orderService.findByfilmName(currentorderId);
		mv.addObject("FindByfilmName", FindByfilmName);
		mv.setViewName("TicketSum");
		return mv;
	}
	@RequestMapping("/deleteOrder")
	public ModelAndView deleteOrder(Long id) throws Exception {
		ModelAndView mv = new ModelAndView();
		orderService.delete(id);
		mv.setViewName("redirect:Orderlist");
		return mv;
	}

	@RequestMapping("/deleteUserOrder")
	public ModelAndView deleteUserOrder(Long id,String filmName,String Ptime,Order model,HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		response.setContentType("text/html;charset=utf-8");
		java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(    
			     "yyyy-MM-dd HH:mm");    
			   java.util.Date currentTime = new java.util.Date();    
			   String nowtime = simpleDateFormat.format(currentTime).toString();
		Order findById=orderService.findById(id);
		mv.addObject("findById", findById);
		String statetime=findById.getStateTime();
		String string=findById.getSeats();
		String string3 =findById.getTotalPrice();
		String s=string.replace("排", "_");
		String ss=s.replace("座,", ",");
		String str = ss.substring(0, ss.length()-1);
		String strs=(","+str);
		filmName=findById.getFilmName();
		Ptime=findById.getStateTime();
		Order findBySeats=orderService.findBySeats(filmName,Ptime);
		mv.addObject("findBySeats", findBySeats);
		String price=findBySeats.getTicketOffice();
		Double d = Double.parseDouble(string3);
		Double dd = Double.parseDouble(price);
		Double result=dd-d;
		String ssss = String.valueOf(result);
		String sss=findBySeats.getTotalCound();
		String string2=sss.replaceAll(strs,"");
		model.setFilmName(filmName);
		model.setRoomName(findBySeats.getRoomName());
		model.setPtime(findBySeats.getStateTime());
		model.setTotalCound(string2);
		model.setTicketOffice(ssss);
		
		int i=statetime.compareTo(nowtime);
		System.out.println("++++++++++++++++++++++"+i);
		if(i>0){
		orderService.Sumupdate(model);
		orderService.delete(id);
		try {
			
			response.getWriter().write("<script>alert('退票成功！');;</script>");
			response.getWriter().write ("<script>window.location ='userOrderlist'</script>");
		
			return null;
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		}else{
			try{
			response.getWriter().write("<script>alert('退票失败，请注意日期');history.go(-1);</script>");
			
			return null;
			} catch (IOException e) {

				e.printStackTrace();
			}
           }
		
		
		return null;
	}
	

	

	

	

	@RequestMapping("/addOrder")
	public ModelAndView add(Order model,HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView();
		String idorder=model.getOrderId();
		session.setAttribute("currentorderId", idorder);
		 orderService.add(model);
		
		mv.setViewName("redirect:FindByOrserid");
		return mv;
	}
	@RequestMapping("/testOrder")
	public ModelAndView testOrder(Object o) {
		ModelAndView mv = new ModelAndView();
		System.out.println(o);
		return mv;
	}
}
