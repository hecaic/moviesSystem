package cn.he.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.he.dao.FilmDao;
import cn.he.model.Film;
import cn.he.service.FilmService;

@Service("filmService")
public class FilmServiceImp implements FilmService {

	
	@Autowired
	private FilmDao filmDao;
	@Override
	public List<Film> listFilmAll() {
	
		return filmDao.listFilmAll();
	}

	@Override
	public Film findByFilmId(Long filmId) {
		
		return filmDao.findByFilmId(filmId);
	}

	@Override
	public boolean add(Film model) {
		
		return filmDao.addFilm(model);
	}

	@Override
	public boolean update(Film model) {
	
		return filmDao.updateFilm(model);
	}

	@Override
	public boolean delete(long filmId) {
		
		return filmDao.deleteFilm(filmId);
	}

	@Override
	public List<Film> queryFilmByN(String filmName) {
	
		return filmDao.queryFilmByName(filmName);
	}

	@Override
	public List<Film> queryFilmByT(String filmType) {
	
		return filmDao.queryFilmByType(filmType);
	}

	@Override
	public List<Film> queryFilmByL(String filmLanguage) {
		
		return filmDao.queryFilmByLanguag(filmLanguage);
	}

	@Override
	public List<Film> queryFilmByTypeAndL(String filmLanguage, String filmType) {

		return filmDao.queryFilmByTypeAndLanguag(filmLanguage, filmType);
	}

	@Override
	public List<Film> queryFilmByTypeN(String filmType, String filmName) {
	
		return filmDao.queryFilmByTypeName(filmType, filmName);
	}

	@Override
	public List<Film> queryFilmByLanguagN(String filmLanguage, String filmName) {
	
		return filmDao.queryFilmByLanguagName(filmLanguage, filmName);
	}

	@Override
	public List<Film> queryFilmByLanguagNameT(String filmType, String filmLanguage, String filmName) {
	
		return filmDao.queryFilmByLanguagNameType(filmType, filmLanguage, filmName);
	}

	@Override
	public List<Film> findByMovieTime(String filmName) {
		
		return filmDao.findByMovieTime(filmName);
	}

	


	
	
}
