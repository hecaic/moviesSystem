package cn.he.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.he.model.Film;
import cn.he.model.Room;
import cn.he.service.FilmService;
import cn.he.service.RoomService;


@Controller
public class RoomController {

	
	
	@Autowired
	@Resource(name = "roomService")
	private RoomService roomService;
	
	/**
	 * 从数据库中获取全部的用户列表
	 * 
	 * @return ModelAndView
	 */
	
	
	@RequestMapping("/Roomlist")
	public ModelAndView Roomlist() {
		ModelAndView mv = new ModelAndView();
          
		List<Room> Roomlist = roomService.listRoomAll();

		mv.addObject("Roomlist", Roomlist);
		
      
        
		mv.setViewName("RoomList");
		return mv;
	}
	
	/**
	 * 从数据库中获取全部的用户列表
	 * 
	 * @return ModelAndView
	 */
	
	
	@RequestMapping("/listroomname")
	public ModelAndView listroomname() {
		ModelAndView mv = new ModelAndView();
          
		List<Room> listroomname = roomService.listRoomAll();

		mv.addObject("listroomname", listroomname);
		
      
        
		mv.setViewName("AddFilm");
		return mv;
	}
	/**
	 * 获得并将其展示
	 * 
	 * @param id
	 * @return ModelAndView
	 */
	@RequestMapping("/FindByRoomId")
	public ModelAndView FindByRoomId(Long id) {
		ModelAndView mv = new ModelAndView();
		Room room = roomService.findById(id);
		System.out.println(room);
		mv.addObject("room", room);
		mv.setViewName("test");
		return mv;
	}
	/**
	 * 获得并将其展示
	 * 
	 * @param roomNuber
	 * @return ModelAndView
	 */
	@RequestMapping("/FindByRoomNuber")
	public ModelAndView FindByRoomNuber(Long roomNuber) {
		ModelAndView mv = new ModelAndView();
		Room roomNumber = roomService.findByRoomNuber(roomNuber);
		mv.addObject("roomNumber", roomNumber);
		mv.setViewName("demo");
		return mv;
	}

	/**
	 * 修改用户的个人信息并将用户信息存入数据库
	 * 
	 * @param model
	 * @return ModelAndView
	 * @throws Exception
	 */
	@RequestMapping("/Roomupdate")
	public ModelAndView updaterRoom(Room model) throws Exception {
		ModelAndView mv = new ModelAndView();
		roomService.update(model);
		mv.setViewName("redirect:Roomlist");
		return mv;
	}

	/**
	 * 删除用户
	 * 
	 * @param id
	 * @return ModelAndView
	 * @throws Exception
	 */
	@RequestMapping("/Roomdelete")
	public ModelAndView deleteRoom(Long id) throws Exception {
		ModelAndView mv = new ModelAndView();
		roomService.delete(id);
		mv.setViewName("redirect:Roomlist");
		return mv;
	}

	@RequestMapping("/Roomadd")
	public ModelAndView add(Room model) throws Exception {
		ModelAndView mv = new ModelAndView();
		roomService.add(model);
		mv.setViewName("redirect:Roomlist");
		return mv;
	}
	
	
	
	
	
	
}
