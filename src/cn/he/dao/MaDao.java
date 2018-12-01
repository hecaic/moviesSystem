package cn.he.dao;




import cn.he.model.Ma;

public interface MaDao {
	 /**
	  * 根据登录名和密码查询用户
	  * @param String username
	  * @param String password
	  * @return 找到返回User对象，找不到返回null
	  */
		
		public abstract Ma findByLoginName(String loginname);
	     
		
		public abstract Ma findById(Long id); // 通过用户的id来获得该用户的实体类 
		
		public abstract boolean addMa(Ma model); // 新增用户
		public abstract boolean updateMa(Ma model); // 修改用户的信息
		public abstract boolean deleteMa(long id); // 删除用户

}
