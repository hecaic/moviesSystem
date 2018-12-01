package cn.he.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.he.dao.TimeDao;
import cn.he.model.Time;
import cn.he.service.TimeService;

@Service("timeService")
public class TimeServiceImp implements TimeService {
     
	@Autowired
	private TimeDao timeDao;
	@Override
	public List<Time> listTimeAll() {
		
		return timeDao.listTimeAll();
	}

	@Override
	public List<Time> listFilmname() {
		// TODO Auto-generated method stub
		return timeDao.listFilmname();
	}

	@Override
	public boolean add(Time model) throws Exception{
		// TODO Auto-generated method stub
		return timeDao.addTime(model);
	}

	@Override
	public boolean delete(Long id) throws Exception{
		// TODO Auto-generated method stub
		return timeDao.deleteTime(id);
	}

	
	@Override
	public Time findByStarTime(Long id) {
		
		return timeDao.findByStarTime(id);
	}

	@Override
	public boolean addvalue(Time model) {
		
		return timeDao.addvalue(model);
	}

	

	@Override
	public List<Time> listFindStarTime(String filmName, String time) {
		
		return timeDao.listFindStarTime(filmName, time);
	}

	@Override
	public boolean deleteTimePoint(Long id) throws Exception {
		
		return timeDao.deleteTimePoint(id);
	}

}
