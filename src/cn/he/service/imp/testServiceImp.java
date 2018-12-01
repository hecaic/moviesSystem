package cn.he.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.he.dao.testDao;

import cn.he.model.Test;
import cn.he.service.testService;
@Service("testService")
public class testServiceImp implements testService {

	@Autowired
	private testDao testDao;
	@Override
	public Test queryFilmId(String filmName) {
		
		return testDao.queryFilmId(filmName);
	}
	@Override
	public Test querySeats(String filmName,String Ptime) {
		
		return  testDao.querySeats(filmName,Ptime);
	}
	@Override
	public Test querytime(String filmName, String time) {
		
		return testDao.querytime(filmName, time);
	}
	
	
}
