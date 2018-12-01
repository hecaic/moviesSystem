package cn.he.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.he.dao.RoomDao;
import cn.he.model.Room;
import cn.he.service.RoomService;

@Service("roomService")
public class RoomServiceImp implements RoomService {

	
	@Autowired
	private RoomDao roomDao;
	@Override
	public Room findByRoomName(String roomName) {
		
		return roomDao.findByRoomName(roomName);
	}

	@Override
	public Room findByRoomNuber(Long roomNuber) {
		
		return roomDao.findByRoomNuber(roomNuber);
	}

	@Override
	public List<Room> listRoomAll() {

		return roomDao.listRoomAll();
	}

	@Override
	public Room findById(Long id) {

		return roomDao.findById(id);
	}

	@Override
	public boolean add(Room model) throws Exception {
	
		return roomDao.addRoom(model);
	}

	@Override
	public boolean delete(Long id) throws Exception {
	
		return roomDao.deleteRoom(id);
	}

	@Override
	public boolean update(Room model) throws Exception {

		return roomDao.updateRoom(model);
	}

	
	
	
}
