package cn.he.dao;

import org.apache.ibatis.annotations.Param;

import cn.he.model.Test;

public interface testDao {
	
	
	public abstract Test queryFilmId(String filmName); // 通过电影的id来获得该电影的实体类 
	public abstract Test querySeats(@Param("filmName") String filmName,@Param("Ptime") String Ptime);
	public abstract Test querytime(@Param("filmName") String filmName,@Param("time") String time);
}
