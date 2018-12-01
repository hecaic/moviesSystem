package cn.he.service;

import java.util.List;

import cn.he.model.Time;

public interface TimeService {

	
	public abstract List<Time> listTimeAll();
	public abstract List<Time> listFilmname();
	public abstract boolean add(Time model) throws Exception;
	public abstract boolean delete(Long id) throws Exception;
	public abstract boolean deleteTimePoint(Long id)throws Exception;
	public abstract boolean addvalue(Time model);
	public abstract Time findByStarTime(Long id);
	public abstract List<Time> listFindStarTime(String filmName,String time);
}
