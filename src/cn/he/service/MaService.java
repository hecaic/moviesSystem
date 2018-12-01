package cn.he.service;

import java.util.List;

import cn.he.model.Ma;
import cn.he.model.User;

public interface MaService {
	/**
	 * 判断用户登陆
	 * 
	 * @Parma String username
	 * @Parma String password
	 * @return 找到User对象 没有找到返回null
	 */

	public abstract Ma findByLoginName(String loginname);

	public abstract Ma findById(Long userid);

	public abstract boolean add(Ma model) throws Exception;

	public abstract boolean delete(Long userid) throws Exception;

	public abstract boolean update(Ma model) throws Exception;

	



}
