package cn.he.service;

import cn.he.model.Test;

public interface testService {

	
	public abstract Test queryFilmId(String filmName);
	public abstract Test querySeats(String filmName,String Ptime);
	public abstract Test querytime(String filmName,String time);
	
}
