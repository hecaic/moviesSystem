package cn.he.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.he.model.Time;

public  interface TimeDao {

	public abstract List<Time> listTimeAll();
	public abstract List<Time> listFilmname();
	public abstract boolean addTime(Time model) throws Exception;
	public abstract boolean deleteTime(Long id) throws Exception;
	public abstract boolean addvalue(Time model);
	public abstract Time findByStarTime(Long id);
	public abstract List<Time> listFindStarTime(@Param("filmName")String filmName,@Param("time") String time);
	public abstract boolean deleteTimePoint(Long id)throws Exception;

	
}
