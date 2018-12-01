package cn.he.dao;

import java.util.List;




import cn.he.model.User;

public interface UserDao{
 /**
  * 根据登录名和密码查询用户
  * @param String username
  * @param String password
  * @return 找到返回User对象，找不到返回null
  */
	
	public abstract User findByLoginName(String loginname);
     
	public abstract List<User> listAll(); // 获得全部的用户
	public abstract User findById(Long userid); // 通过用户的id来获得该用户的实体类 
	
	public abstract boolean addUser(User model); // 新增用户
	public abstract boolean updateUser(User model); // 修改用户的信息
	public abstract boolean deleteUser(long id); // 删除用户

	
}
