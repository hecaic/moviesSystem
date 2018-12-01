package cn.he.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.he.model.Film;
import cn.he.service.TimeService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class TimeController {

	@Autowired
	@Resource(name ="timeService")
	private TimeService timeService;
	
	
	@RequestMapping("/listTimeAll")
	public ModelAndView listTime(){
		
		ModelAndView mv = new ModelAndView();
		List<cn.he.model.Time> listTimeAll=timeService.listTimeAll();
		List<cn.he.model.Time> listFilmname=timeService.listFilmname();
		mv.addObject("listFilmname",listFilmname);
		mv.addObject("listTimeAll",listTimeAll);
		mv.setViewName("TimeList");
		return mv;
		
	}
	@RequestMapping("/listFilmname")
	public ModelAndView listFilmname(){
		
		ModelAndView mv = new ModelAndView();
		List<cn.he.model.Time> listFilmname=timeService.listFilmname();
		mv.addObject("listFilmname",listFilmname);
		mv.setViewName("AddTime");
		return mv;
		
	}
	@RequestMapping("/listFindStarTime")
	public ModelAndView listFindStarTime(String filmName,String time){
		
		ModelAndView mv = new ModelAndView();
		List<cn.he.model.Time> listFindStarTime=timeService.listFindStarTime(filmName, time);
		mv.addObject("listFindStarTime",listFindStarTime);
		mv.setViewName("listTimePoint");
		return mv;
		
	}
	@RequestMapping(value = "/listFindStarTime", method=RequestMethod.POST)
	public void listFindStarTime(HttpSession session,String time, HttpServletResponse response){
		JSONObject result = new JSONObject();
		try {
			PrintWriter out = response.getWriter();
			JSONArray tempArr = new JSONArray();
			Film currentFilmName =  (Film) session.getAttribute("currentFilmName");
			List<cn.he.model.Time> listFindStarTime=timeService.listFindStarTime(currentFilmName.getFilmName(), time);
			tempArr = JSONArray.fromObject(listFindStarTime);
			result.put("data", tempArr);
			out.print(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping("/TimeAdd")
	public ModelAndView add(cn.he.model.Time model,HttpServletResponse response) throws Exception{
		ModelAndView mv = new ModelAndView();
		response.setContentType("text/html;charset=utf-8");
		java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(    
			     "yyyy-MM-dd ");    
			   java.util.Date currentTime = new java.util.Date();    
			   String nowtime = simpleDateFormat.format(currentTime).toString();
			   String time=model.getTime();
			   int i=time.compareTo(nowtime);
			   if(i>0){
				   timeService.add(model);
					mv.setViewName("redirect:listTimeAll");
					return mv;
			   }else{
				   {
						try{
						response.getWriter().write("<script>alert('该日期已过，请重新输入');history.go(-1);</script>");
						
						return null;
						} catch (IOException e) {

							e.printStackTrace();
						}
			           }
					
					
					return null;
			   }
		
		
	}
	@RequestMapping("/Timedelete")
	public ModelAndView delete(Long id) throws Exception{
		ModelAndView mv = new ModelAndView();
		timeService.delete(id);
		mv.setViewName("redirect:listTimeAll");
		return mv;
		
	}
	@RequestMapping("/deleteTimePoint")
	public ModelAndView deleteTimePoint(Long id) throws Exception{
		ModelAndView mv = new ModelAndView();
		timeService.deleteTimePoint(id);
		mv.setViewName("redirect:listTimeAll");
		return mv;
		
	}
	@RequestMapping("/findByStarTime")
	public ModelAndView findByStarTime(Long id) {
		ModelAndView mv = new ModelAndView();
		cn.he.model.Time findByStarTime=timeService.findByStarTime(id);
		mv.addObject("findByStarTime",findByStarTime);
		mv.setViewName("SpecificTime");
		return mv;
		
	}

	@RequestMapping("/AddStarTmine")
	public ModelAndView AddStarTmine(cn.he.model.Time model,String a,String b,String c,String d) {
		ModelAndView mv = new ModelAndView();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		/*String ss=a.replace(":", ".");
		String sss=b.replace(":", ".");
		Double dd = Double.parseDouble(ss);
		Double d1= Double.parseDouble(sss);
		System.out.println("=============="+dd);
		System.out.println("=============="+d1);
		Double aa=2.00;
		Double ddd=dd+aa;
		System.out.println("=============="+ddd);*/
		//timeService.addvalue(model);
		if(model.getStarTime().equals("00:00"))
		{
			
		}else{
			timeService.addvalue(model);
		}
	   if(a.equals("00:00")){
		   
	   }else{
		   model.setStarTime(a);
		   timeService.addvalue(model);
	   }
	   if(b.equals("00:00")){
		   
	   }else{
		   model.setStarTime(b);
		   timeService.addvalue(model);
	   }
       if(c.equals("00:00")){
		   
	   }else{
		   model.setStarTime(c);
		   timeService.addvalue(model);
	   }
       if(d.equals("00:00")){
	   
       }else{
	   model.setStarTime(d);
	   timeService.addvalue(model);
}
		mv.setViewName("redirect:listTimeAll");
		return mv;
		
	}
}
