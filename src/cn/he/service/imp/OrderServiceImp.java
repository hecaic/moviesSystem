package cn.he.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.he.dao.OrderDao;
import cn.he.model.Order;
import cn.he.model.Sum;
import cn.he.service.OrderService;


@Service("orderService")
public class OrderServiceImp implements OrderService {

	
	@Autowired
	private OrderDao orderDao;
	@Override
	public List<Order> listOrderAll() {
		
		return orderDao.listOrderAll();
	}

	@Override
	public List<Order> findOrderByUserName(String userName) {
		
		return orderDao.findOrderByUserName(userName);
	}

	@Override
	public Order findByfilmName(String filmName) {
	
		return orderDao.findByfilmName(filmName);
	}

	@Override
	public boolean add(Order model) throws Exception {
	
		return orderDao.addOrder(model);
	}

	@Override
	public boolean delete(long id) throws Exception {
	
		return orderDao.deleteOrder(id);
	}

	@Override
	public Order findById(long id) {
		
		return orderDao.findById(id);
	}

	@Override
	public Order findBySeats(String filmName,String Ptime) {
		
		return orderDao.findBySeats(filmName,Ptime);
	}

	@Override
	public boolean Sumupdate(Order model) {
		
		return orderDao.Sumupdate(model);
	}

	@Override
	public boolean Sumdelete(Order model) {
		
		return orderDao.Sumdelete(model);
	}

	@Override
	public List<Order> FindUserList(String userName) {
		
		return orderDao.FindUserList(userName);
	}

}
