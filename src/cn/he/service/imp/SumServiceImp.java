package cn.he.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.he.dao.SumDao;
import cn.he.model.Sum;
import cn.he.service.SumService;
@Service("sumService")
public class SumServiceImp implements SumService{
	@Autowired
	private SumDao sumDao;
	@Override
	public List<Sum> listSumAll() {
		
		return sumDao.listSumAll();
	}
	@Override
	public boolean add(Sum model) {
		
		return sumDao.addSum(model);
	}
	@Override
	public Sum queryFilmName(String filmName,String Ptime) {
		
		return sumDao.queryFilmName(filmName,Ptime);
	}
	@Override
	public boolean update(Sum model) {
		
		return sumDao.updateSum(model);
	}
	@Override
	public List<Sum> listFilmName() {
		
		return sumDao.listFilmName();
	}
	@Override
	public List<Sum> listSum(String filmName) {
		
		return sumDao.listSum(filmName);
	}
	@Override
	public Sum queryinfor(long id) {
		
		return sumDao.queryinfor(id);
	}
	

}
