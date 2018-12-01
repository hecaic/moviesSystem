package cn.he.dao;

import java.util.List;

import cn.he.model.Room;



public interface RoomDao {

	
	
	
	
	public abstract Room findByRoomName(String roomName);
	public abstract Room findByRoomNuber(Long roomNuber);
	public abstract List<Room> listRoomAll(); // 获得全部的用户
	public abstract Room findById(Long id); // 通过用户的id来获得该用户的实体类 
	
	public abstract boolean addRoom(Room model); // 新增用户
	public abstract boolean updateRoom(Room model); // 修改用户的信息
	public abstract boolean deleteRoom(long id); // 删除用户

}
