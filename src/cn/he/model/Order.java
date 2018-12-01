package cn.he.model;

public class Order {
	/**
	 * 订单ID
	 */
	private int id;
	/**
	 * 订单单号
	 */
	private String orderId;
	/**
	 * 订单用户名
	 */
	private String userName;
	/**
	 * 订单电影名
	 */
	private String filmName;
	/**
	 * 订单购买票数
	 */
	private String number;
	/**
	 * 订单总价
	 */
	private String totalPrice;
	/**
	 * 订单电影票单价
	 */
	private double price;
	/**
	 * 订单生成时间
	 */
	private String orderTime;

	/**
	 * 座位
	 */
	private String seats;
	/**
	 * 房间
	 */
	private String roomName;

	
	 /**
    * 电影总票房
    */
	private String totalCound;
	
	/**
    * 票房
    */
	private String ticketOffice;
	private String stateTime;
	private String Ptime;

	public Order() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	
	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
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

	public String getTotalCound() {
		return totalCound;
	}

	public void setTotalCound(String totalCound) {
		this.totalCound = totalCound;
	}

	public String getStateTime() {
		return stateTime;
	}

	public void setStateTime(String stateTime) {
		this.stateTime = stateTime;
	}

	public String getPtime() {
		return Ptime;
	}

	public void setPtime(String ptime) {
		Ptime = ptime;
	}

	

	
	
}
