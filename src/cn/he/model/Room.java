package cn.he.model;

public class Room {
    /**
     * 影厅ID
     */
	private int id;
	/**
     * 影厅名字
     */
	private String roomName;
	/**
     * 影厅座位数量
     */
	private int roomNuber;
	public Room() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getRoomNuber() {
		return roomNuber;
	}
	public void setRoomNuber(int roomNuber) {
		this.roomNuber = roomNuber;
	}
	
	
	
	
}
