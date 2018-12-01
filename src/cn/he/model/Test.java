package cn.he.model;

public class Test {
 
	private int filmId;
	private String filmName;
	private int roomNuber;
	private String totalCound;
	private String roomName;
	private String Ptime;
	private String time;
	/**
	 * 电影语言
	 */
	private String filmLanguage; 
	/**
	 * 2D/3D
	 */
   private String playType;

	
	private double price;
	public Test() {
		super();
		
	}
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public int getRoomNuber() {
		return roomNuber;
	}
	public void setRoomNuber(int roomNuber) {
		this.roomNuber = roomNuber;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public String getTotalCound() {
		return totalCound;
	}
	public void setTotalCound(String totalCound) {
		this.totalCound = totalCound;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getPtime() {
		return Ptime;
	}
	public void setPtime(String ptime) {
		Ptime = ptime;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPlayType() {
		return playType;
	}
	public void setPlayType(String playType) {
		this.playType = playType;
	}
	public String getFilmLanguage() {
		return filmLanguage;
	}
	public void setFilmLanguage(String filmLanguage) {
		this.filmLanguage = filmLanguage;
	}
}
