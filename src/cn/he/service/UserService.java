package cn.he.service;


import java.util.List;

import cn.he.model.User;

public interface UserService {
/**
 * 判断用户登陆
 * @Parma String uaername
 * @Parma String password
 * @return 找到User对象 没有找到返回null
 */
	
	    public abstract User findByLoginName(String loginname);

		public abstract List<User> listAll();
		public abstract User findById(Long userid);
		
		public abstract boolean add(User model) throws Exception;
		public abstract boolean delete(Long userid) throws Exception;
		public abstract boolean update(User model) throws Exception;

		
	
		
}
