package cn.he.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.he.model.Film;



public interface FilmDao {

	
	
    
	public abstract List<Film> listFilmAll(); // 获得全部的电影
	
	public abstract Film findByFilmId(Long filmId); // 通过电影的id来获得该电影的实体类 
	
	public abstract boolean addFilm(Film model); // 新增电影
	public abstract boolean updateFilm(Film model); // 修改电影的信息
	public abstract boolean deleteFilm(long filmId); // 删除电影

	public abstract List<Film> findByMovieTime(String filmName);
	public List<Film> queryFilmByName(String filmName);
	public List<Film> queryFilmByType(String filmType);
	public List<Film> queryFilmByLanguag(String filmLanguage);
	public List<Film> queryFilmByTypeAndLanguag(@Param("filmLanguage") String filmLanguage,@Param("filmType") String filmType);
	public List<Film> queryFilmByTypeName(@Param("filmType") String filmType,@Param("filmName") String filmName);
	public List<Film> queryFilmByLanguagName(@Param("filmLanguage") String filmLanguage,@Param("filmName") String filmName);
	public List<Film> queryFilmByLanguagNameType(@Param("filmType") String filmType,@Param("filmLanguage") String filmLanguage,@Param("filmName") String filmName);
	
}
