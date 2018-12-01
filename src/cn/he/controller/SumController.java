package cn.he.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import cn.he.model.Sum;
import cn.he.service.SumService;

@Controller
public class SumController {

	@Autowired
	@Resource(name="sumService")
	private SumService sumService;
	
	/**
	 * 从数据库中获取全部的用户列表
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping("/Sumlist")
	public ModelAndView Sumlist() {
		ModelAndView mv = new ModelAndView();

		List<Sum> Sumlist = sumService.listSumAll();

		mv.addObject("Sumlist", Sumlist);

		mv.setViewName("SumList");
		return mv;
	}
	
	@RequestMapping("/addSum")
	public ModelAndView addSum(Sum model ,String filmName,String Ptime,String orderid) {
		ModelAndView mv = new ModelAndView();
		filmName=model.getFilmName();
		long id=1;
		Sum queryFilmName=sumService.queryFilmName(filmName,Ptime);
		Sum queryinfor=sumService.queryinfor(id);
		mv.addObject("queryFilmName",queryFilmName);
		mv.addObject("queryinfor",queryinfor);
		queryinfor.setFilmName(filmName);
		queryinfor.setTicketOffice(model.getTicketOffice());
		queryinfor.setPtime(orderid);
		String string=model.getTotalCound();
		String s=string.replace("排", "_");
		String ss=s.replace("座,", ",");
		String str = ss.substring(0, ss.length()-1);
		model.setTotalCound(","+str);
		if(queryFilmName==null){
			sumService.add(model);
			mv.setViewName("Pay_Film");
			
		}else{
			String string2=queryFilmName.getTicketOffice();
			Double d = Double.parseDouble(string2); 
			String string3 =model.getTicketOffice();
			Double dd = Double.parseDouble(string3);
			Double ddd=d+dd;
			String sss = String.valueOf(ddd);
			model.setTicketOffice(sss);
			model.setTotalCound(queryFilmName.getTotalCound()+","+str);
			sumService.update(model);
			mv.setViewName("Pay_Film");
		}
		
		
		
		
		return mv;
		
		
	}
	@RequestMapping("/pay_film")
	public ModelAndView pay_film(String pay,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		response.setContentType("text/html;charset=utf-8");
      if(pay==""||pay==null)
      {
    	  try {
				
				response.getWriter().write("<script>alert('未选择支付方式，请重新选择！');history.go(-1);</script>");
			
				return null;
			} catch (IOException e) {

				e.printStackTrace();
			}
      }else{
    	  try {
				
				response.getWriter().write("<script>alert('支付成功');;</script>");
				response.getWriter().write ("<script>window.location ='userOrderlist'</script>");
				return null;
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
      return null;
	}
	@RequestMapping("/Statistics")
	public ModelAndView Statistics() {
		ModelAndView mv = new ModelAndView();
        List<String> list=new ArrayList<String>();
        List<String> list1=new ArrayList<String>();
        List<String> list2=new ArrayList<String>();
		List<Sum> Statistics = sumService.listFilmName();
		int k=0;
	
        for(Sum name:Statistics)
        {
        	String filmname=name.getFilmName();
        	System.out.println(filmname);
        	k=k+1;
        	
        	list.add(String.valueOf(k));
        	list.add(filmname);
        	List<Sum> filmNameSum = sumService.listSum(filmname);
        	for(Sum sumPrice:filmNameSum){
        		String a=sumPrice.getTicketOffice();
        		list1.add(a);
        	}
        	Double sum=0.0;
        	for(int i=0;i<list1.size();i++){
        		
        		String aa=list1.get(i);
        		Double b = Double.parseDouble(aa);
        		sum=sum+b;
        	}
        	String aaa = String.valueOf(sum);
			list.add(aaa);
			  list1=new ArrayList<String>();
        }
        for(int j=0;j<list.size();j++){
        	System.out.println(list.get(j));
        }
		mv.addObject("list", list);
		mv.setViewName("SumList");
		return mv;
	}
	
}
