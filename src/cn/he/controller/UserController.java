package cn.he.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cn.he.model.User;
import cn.he.service.UserService;
@SessionAttributes(value = { "user"})

@Controller

public class UserController {

	@Autowired
	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(value = "/Frontlogin")
	public ModelAndView login(String loginname, String password, HttpServletResponse response,HttpSession session) {
		ModelAndView mv = new ModelAndView();
	response.setContentType("text/html;charset=utf-8");
		User user = userService.findByLoginName(loginname);
		session.setAttribute("currentUser", user);
		if (user != null && user.getPassword().equals(password)) {
			mv.addObject("user",user);
			mv.setView(new RedirectView("main"));
			return mv;
		} else {
			try {
				
				response.getWriter().write("<script>alert('用户名或密码密码错误');history.go(-1);</script>");
				//response.getWriter().write("<a href='login.jsp'>請重新登陆</a>");
				return null;
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		return null;
	
	}

	/**
	 * 从数据库中获取全部的用户列表
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();

		List<User> list = userService.listAll();

		mv.addObject("list", list);

		mv.setViewName("demo1");
		return mv;
	}

	/**
	 * 获得一个用户并将其展示
	 * 
	 * @param id
	 * @return ModelAndView
	 */
	@RequestMapping("/view")
	public ModelAndView viewUser(Long userid) {
		ModelAndView mv = new ModelAndView();
		User user = userService.findById(userid);
		mv.addObject("user", user);
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
	@RequestMapping("/update")
	public ModelAndView updaterUser(cn.he.model.User model) throws Exception {
		ModelAndView mv = new ModelAndView();
		userService.update(model);
		mv.setViewName("demo");
		return mv;
	}

	/**
	 * 删除用户
	 * 
	 * @param userId
	 * @return ModelAndView
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public ModelAndView deleteUser(Long userId) throws Exception {
		ModelAndView mv = new ModelAndView();
		userService.delete(userId);
		mv.setViewName("redirect:list");
		return mv;
	}

	@RequestMapping("/add")
	public ModelAndView add(cn.he.model.User model,String loginname,HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		response.setContentType("text/html;charset=utf-8");
		
		loginname=model.getLoginname();
		String password=model.getPassword();
		int a=password.length();
		System.out.println("++++++++++++++"+a);
		String phone=model.getUserphone();
		int b=phone.length();
		User username=userService.findByLoginName(loginname);
		mv.addObject("username",username);
		if(username==null){
			if(a>5&&a<16&&b==11){
			userService.add(model);
			mv.setViewName("login");
			return mv;
			}else{
				try {
					
					response.getWriter().write("<script>alert('密码为6—15位,电话号码为11位数字！');history.go(-1);</script>");
				
					return null;
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
			
		}else{
              try {
				
				response.getWriter().write("<script>alert('用户名已有，请重新输入！');history.go(-1);</script>");
			
				return null;
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
		return null;
	}
}

