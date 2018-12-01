package cn.he.model;

public class Time {
      private Long id;
	private String filmName;
	private String time;
	private String starTime;
	public Time() {
		super();
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}


	public String getStarTime() {
		return starTime;
	}


	public void setStarTime(String starTime) {
		this.starTime = starTime;
	}
	
	
	
	
}
