package cn.he.service;

import java.util.List;

import cn.he.model.Room;



public interface RoomService {

	

    public abstract Room findByRoomName(String roomName);
    public abstract Room findByRoomNuber(Long roomNuber);
	public abstract List<Room> listRoomAll();
	public abstract Room findById(Long id);
	
	public abstract boolean add(Room model) throws Exception;
	public abstract boolean delete(Long id) throws Exception;
	public abstract boolean update(Room model) throws Exception;

	
	
	
}
