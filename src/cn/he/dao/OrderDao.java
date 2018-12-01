package cn.he.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.he.model.Order;
import cn.he.model.Sum;



public interface OrderDao {

	public abstract List<Order> listOrderAll(); // 获得全部订单信息
	public abstract List<Order> findOrderByUserName(String userName);
	public abstract Order findByfilmName(String orderId); // 通过电影名找到订单信息
	public abstract boolean addOrder(Order model); // 新增订单信息
    public abstract List<Order> FindUserList(String userName);//获取某用户的订单信息
	public abstract boolean deleteOrder(long id); // 用户退票删除该订单信息
	public abstract Order findById(long id);//根据delete获得的id获取该记录的座位号
	public abstract Order findBySeats(@Param("filmName") String filmName,@Param("Ptime") String Ptime);
	public abstract boolean Sumupdate(Order model );
	public abstract boolean Sumdelete(Order model);
	
	
	
	
	
	
}
