package cn.he.service;

import java.util.List;

import cn.he.model.Film;


public interface FilmService {

	
	

	public abstract List<Film> listFilmAll(); // 获得全部的电影
	
	public abstract Film findByFilmId(Long filmId); // 通过电影的id来获得该电影的实体类 

	public abstract boolean add(Film model); // 新增电影
	public abstract boolean update(Film model); // 修改电影的信息
	public abstract boolean delete(long filmId); // 删除电影
	public abstract List<Film> findByMovieTime(String filmName);
	
	public List<Film> queryFilmByN(String filmName);
	public List<Film> queryFilmByT(String filmType);
	public List<Film> queryFilmByL(String filmLanguage);
	public List<Film> queryFilmByTypeAndL(String filmLanguage,String filmType);
	public List<Film> queryFilmByTypeN(String filmType,String filmName);
	public List<Film> queryFilmByLanguagN(String filmLanguage,String filmName);
	public List<Film> queryFilmByLanguagNameT(String filmType,String filmLanguage,String filmName);
}
