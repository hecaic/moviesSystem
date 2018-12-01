package cn.he.service;

import java.util.List;

import cn.he.model.Order;
import cn.he.model.Sum;

public interface OrderService {

	
	
	public abstract List<Order> listOrderAll(); 
	public abstract List<Order> findOrderByUserName(String userName);
	public abstract Order findByfilmName(String orderId); 
	public abstract Order findById(long id);
	public abstract boolean add(Order model)throws Exception;
	public abstract List<Order> FindUserList(String userName);//获取某用户的订单信息
	public abstract boolean delete(long id)throws Exception;
	public abstract Order findBySeats(String filmName,String Ptime);
	public abstract boolean Sumupdate(Order model );
	public abstract boolean Sumdelete(Order model);
	
}
