package cn.he.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.he.model.Sum;

public interface SumDao {

	public abstract List<Sum> listSumAll();
	public abstract boolean addSum(Sum model);
	public abstract Sum queryFilmName(@Param("filmName") String filmName,@Param("Ptime") String Ptime);
	public abstract boolean updateSum(Sum model);
	public abstract List<Sum> listFilmName();
	public abstract List<Sum> listSum(String filmName);
	public abstract Sum queryinfor(long id);
}
