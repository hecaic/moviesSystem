package cn.he.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.he.dao.UserDao;
import cn.he.model.User;
import cn.he.service.UserService;

/**
 * User服务层接口实现类
 * @Service("userService")用于当前类注释为另一个Spring的bean，名为userService
 * @author hecaicai
 *
 */
@Service("userService")
public class UserServiceImp implements UserService{

	
  /**
   * 自动注入User
   */
	
	@Autowired
	private UserDao userDao;
	@Override
	public User findByLoginName(String loginname) {
		
		return userDao.findByLoginName(loginname);
	}
	@Override
	public List<User> listAll() {
		
		return userDao.listAll();
	}

	@Override
	public User findById(Long userid) {
		return userDao.findById(userid);
	}

	@Override
	public boolean add(User model) throws Exception {
		return userDao.addUser(model);
	}

	@Override
	public boolean delete(Long userid) throws Exception {
		return userDao.deleteUser(userid);
	}

	@Override
	public boolean update(User model) throws Exception {
		return userDao.updateUser(model);
	}
	
}
