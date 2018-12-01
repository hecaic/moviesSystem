package cn.he.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cn.he.model.Ma;
import cn.he.model.User;
import cn.he.service.MaService;
@SessionAttributes(value = { "manage"})
@Controller
public class MaController{
	
	
	@Autowired
	@Resource(name="maService")
	private MaService maService;
	@RequestMapping(value="/manag")

	public ModelAndView Login(String loginname, String password, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
	response.setContentType("text/html;charset=utf-8");
		Ma manage = maService.findByLoginName(loginname);

		if (manage != null && manage.getPassword().equals(password)) {
			mv.addObject("manage",manage);
			mv.setView(new RedirectView("main1"));
			return mv;
		} else {
			try {
				response.getWriter().write("<script>alert('用户名或密码密码错误！！！');history.go(-1);</script>");
				//response.getWriter().write("<a href='manage.jsp'>請重新登陆</a>");
				return null;
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		return null;
	
	}

	
	/**
	 * 从数据库中获取全部的用户列表
	 * @return ModelAndView
	 */
	
	
	/**
	 * 获得一个用户并将其展示
	 * @param id
	 * @return ModelAndView
	 */
	@RequestMapping("/view1")
	public ModelAndView viewUser(Long userid) {
		ModelAndView mv = new ModelAndView();
		Ma user = maService.findById(userid);
		mv.addObject("user", user);
		mv.setViewName("demo2");
		return mv;
	}
	/**
	 * 修改用户的个人信息并将用户信息存入数据库
	 * @param model
	 * @return ModelAndView
	 * @throws Exception 
	 */
	@RequestMapping("/Maupdate")
	public ModelAndView updaterUser(cn.he.model.Ma model) throws Exception{
		ModelAndView mv = new ModelAndView();
		boolean update = maService.update(model);
		if (update == true) {
			Ma newUser = maService.findById((long) model.getUserid());
			mv.addObject("manage",newUser);
			mv.setViewName("redirect:demo2");
		}
		return mv;
	}
	
}
	
	
	
	


