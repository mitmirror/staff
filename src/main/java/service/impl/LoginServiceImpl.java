package service.impl;

import dao.StaffDao;
import dao.impl.StaffDaoImpl;
import entity.StaffEntity;
import service.LoginService;

public class LoginServiceImpl implements LoginService {

	public boolean isLogin(int id, String password) {
		// TODO Auto-generated method stub
		StaffDao impl=new StaffDaoImpl();
		StaffEntity staffEntity =impl.findStaffById(id);
		if(staffEntity.getPassword().equals(password)){
			return true;
		}
		return false;
	}

}
