package cn.he.service.imp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.he.dao.MaDao;
import cn.he.model.Ma;

import cn.he.service.MaService;

@Service("maService")
public  class MaServiceImp implements MaService{

	
	  /**
	   * 自动注入User
	   */
		
		@Autowired
		private MaDao MaDao;
		@Override
		public Ma findByLoginName(String loginname) {
		
			return MaDao.findByLoginName(loginname);
		}
		

		@Override
		public Ma findById(Long userid) {
			return MaDao.findById(userid);
		}

		@Override
		public boolean add(Ma model) throws Exception {
			return MaDao.addMa(model);
		}

		@Override
		public boolean delete(Long userid) throws Exception {
			return MaDao.deleteMa(userid);
		}

		@Override
		public boolean update(Ma model) throws Exception {
			return MaDao.updateMa(model);
		}
		

}
