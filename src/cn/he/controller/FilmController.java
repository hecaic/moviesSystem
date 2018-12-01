package cn.he.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.he.model.Film;
import cn.he.service.FilmService;

@Controller
public class FilmController {

	@Autowired
	@Resource(name = "filmService")
	private FilmService filmService;

	/**
	 * 从数据库中获取全部的用户列表
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping("/Filmlist")
	public ModelAndView Filmlist() {
		ModelAndView mv = new ModelAndView();

		List<Film> Filmlist = filmService.listFilmAll();

		mv.addObject("Filmlist", Filmlist);

		mv.setViewName("FilmList");
		return mv;
	}

	/**
	 * 从数据库中获取全部的用户列表
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping("/listFilm")
	public ModelAndView listFilm(String filmType, String filmLanguage, String filmName) {
		ModelAndView mv = new ModelAndView();
		if (filmLanguage != null && filmType.equals("") && filmName.equals("")) {
			List<Film> listFilm = filmService.queryFilmByL(filmLanguage);

			mv.addObject("Filmlist", listFilm);

			mv.setViewName("FilmList");
			return mv;
		}
		if (filmName != null && filmLanguage.equals("") && filmType.equals("")) {
			List<Film> listFilm = filmService.queryFilmByN(filmName);

			mv.addObject("Filmlist", listFilm);

			mv.setViewName("FilmList");
			return mv;
		}
		if (filmType != null && filmName.equals("") && filmLanguage.equals("")) {
			List<Film> listFilm = filmService.queryFilmByT(filmType);

			mv.addObject("Filmlist", listFilm);

			mv.setViewName("FilmList");
			return mv;
		}
		if (filmType != null && filmLanguage != null && filmName.equals("")) {
			List<Film> listFilm = filmService.queryFilmByTypeAndL(filmLanguage, filmType);

			mv.addObject("Filmlist", listFilm);

			mv.setViewName("FilmList");
			return mv;
		}
		if (filmType != null && filmLanguage.equals("") && filmName != null) {
			List<Film> listFilm = filmService.queryFilmByTypeN(filmType, filmName);

			mv.addObject("Filmlist", listFilm);

			mv.setViewName("FilmList");
			return mv;
		}
		if (filmLanguage != null && filmName != null && filmType.equals("")) {
			List<Film> listFilm = filmService.queryFilmByLanguagN(filmLanguage, filmName);

			mv.addObject("Filmlist", listFilm);

			mv.setViewName("FilmList");
			return mv;
		}
		if (filmType != null && filmLanguage != null && filmName != null) {
			List<Film> listFilm = filmService.queryFilmByLanguagNameT(filmType, filmLanguage, filmName);

			mv.addObject("Filmlist", listFilm);

			mv.setViewName("FilmList");
			return mv;
		}

		return mv;
	}

	/**
	 * 从数据库中获取全部的用户列表
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping("/Movielist")
	public ModelAndView Movielist() {
		ModelAndView mv = new ModelAndView();

		List<Film> Movielist = filmService.listFilmAll();

		mv.addObject("Movielist", Movielist);

		mv.setViewName("MovieList");
		return mv;
	}

	/**
	 * 获得一个电影并将其展示
	 * 
	 * @param id
	 * @return ModelAndView
	 */
	@RequestMapping("/FindByFilmId")
	public ModelAndView FindByFilmId(Long filmId) {
		ModelAndView mv = new ModelAndView();
		Film film = filmService.findByFilmId(filmId);
		mv.addObject("film", film);
		mv.setViewName("updateFilm");
		return mv;
	}

	/**
	 * 获得一个电影并将其展示
	 * 
	 * @param id
	 * @return ModelAndView
	 */
	@RequestMapping("/FindBuyFilmId")
	public ModelAndView FindBuyFilmId(Long filmId, String filmName,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		Film FindBuyFilmId = filmService.findByFilmId(filmId);
		session.setAttribute("currentFilmName",FindBuyFilmId);
		mv.addObject("FindBuyFilmId", FindBuyFilmId);
		filmName = FindBuyFilmId.getFilmName();
		
		List<Film> findByMovieTime = filmService.findByMovieTime(filmName);
		java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd ");
		java.util.Date currentTime = new java.util.Date();
		String nowtime = simpleDateFormat.format(currentTime).toString();
		List<String> list = new ArrayList<String>();
		
		for (Film aaList : findByMovieTime) {

			String mtime = aaList.getTime();
			int i = mtime.compareTo(nowtime);
			System.out.println(mtime);
			System.out.println(nowtime);
			System.out.println(i);
			if (i > 0) {
				list.add(mtime);
				
			}
		}
		
		
		mv.addObject("list", list);
		mv.setViewName("BuyFilm");
		return mv;
	}

	/**
	 * 修改电影信息并将电影信息存入数据库
	 * 
	 * @param model
	 * @return ModelAndView
	 * @throws Exception
	 */
	@RequestMapping("/Filmupdate")
	public ModelAndView updaterFilm(Film model) throws Exception {
		ModelAndView mv = new ModelAndView();
		filmService.update(model);
		mv.setViewName("redirect:Movielist");
		return mv;
	}

	/**
	 * 删除电影信息
	 * 
	 * @param filmId
	 * @return ModelAndView
	 * @throws Exception
	 */
	@RequestMapping("/Filmdelete")
	public ModelAndView deleteFilm(Long filmId) throws Exception {
		ModelAndView mv = new ModelAndView();
		filmService.delete(filmId);
		mv.setViewName("redirect:Movielist");
		return mv;
	}

	/**
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/Filmadd", method = RequestMethod.POST)
	public ModelAndView add(

			@ModelAttribute Film model, ModelAndView mv, HttpSession session) throws Exception {

		mv.setViewName("AddFilm");
		if (model.getFilmImg() == null) {
			String path = session.getServletContext().getRealPath("/filmimg/");
			System.out.println("=============" + path);
			String fileName = model.getFile().getOriginalFilename();
			System.out.println("-----------------" + fileName);
			model.getFile().transferTo(new File(path + File.separator + fileName));
			model.setFileName(fileName);
			model.setFilmImg(fileName);
			System.out.println("++++++++++++++" + model.getFilmImg());
			filmService.add(model);
			mv.setViewName("redirect:Movielist");
		}

		return mv;
	}

}
