package cn.he.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import cn.he.model.Test;
import cn.he.service.testService;

@Controller
public class testController  {

	@Autowired
	@Resource(name = "testService")
	private testService testService;
	
	/**
	 * 获得一个电影并将其展示
	 * 
	 * @param id
	 * @return ModelAndView
	 */
	@RequestMapping("/queryFilmId")
	public ModelAndView queryFilmId( String filmName,String Ptime,String time,String ttime) {
		ModelAndView mv = new ModelAndView();
		time=Ptime;
		System.out.println(time);
		String stime=Ptime+" "+ttime;
		Ptime=Ptime+" "+ttime;
		Test queryFilmId = testService.queryFilmId(filmName);
		Test querySeats =testService.querySeats(filmName,Ptime);
		Test querytime=testService.querytime(filmName,time);
		mv.addObject("queryFilmId", queryFilmId);
		mv.addObject("querySeats",querySeats);
	    mv.addObject("querytime",querytime);
	    querytime.setTime(stime);
		String room=queryFilmId.getRoomName();
		if(room.equals("二号厅")||room.equals("四号厅")){
		mv.setViewName("SelectSeat1");
		//return mv;
		}else
		if(room.equals("一号厅")||room.equals("五号厅")){
			mv.setViewName("SelectSeat");
			//return mv;
		}else if(room.equals("三号厅")||room.equals("六号厅")){
			mv.setViewName("SelectSeat2");
		}else{
			mv.setViewName("SelectSeat3");
		}
		
		return mv;
	}
}
