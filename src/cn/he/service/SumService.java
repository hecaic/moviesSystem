package cn.he.service;

import java.util.List;

import cn.he.model.Sum;

public interface SumService {
	public abstract List<Sum> listSumAll();
	public abstract boolean add(Sum model);
	public abstract Sum queryFilmName(String filmName,String Ptime);
	public abstract boolean update(Sum model);
	public abstract List<Sum> listFilmName();
	public abstract List<Sum> listSum(String filmName);
	public abstract Sum queryinfor(long id);
}
