package cn.he.model;

public class Sum {
    /**
     * 统计信息的编号
     */
	private int id;
	 /**
     * 电影名字
     */
	private String filmName;
	 /**
     * 电影总票房
     */
	private String totalCound;
	 /**
     * 电影播放影厅
     */
	private String roomName;
	/**
     * 票房
     */
	private String ticketOffice;
	/**
	 * 开始时间
	 */
	private String Ptime;
	
	
	public Sum() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
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
	
	public String getTicketOffice() {
		return ticketOffice;
	}
	public void setTicketOffice(String ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	public String getPtime() {
		return Ptime;
	}
	public void setPtime(String ptime) {
		Ptime = ptime;
	}
	
}
