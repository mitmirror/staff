package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.StaffDao;
import entity.StaffEntity;
import service.StaffService;

@Service("staffService")
public class StaffServiceImpl implements StaffService {
	
	@Resource(name="staffDao")
	private StaffDao staffDao;

	@Transactional
	public int addStaff(StaffEntity staffEntity) {
		// TODO Auto-generated method stub
		staffDao.addStaff(staffEntity);
		return 0;
	}

	public int deleteStaff(Integer id) {
		// TODO Auto-generated method stub
		staffDao.deleteStaffById(id);
		return 0;
	}

	public int updateStaff(StaffEntity staffEntity) {
		// TODO Auto-generated method stub
		staffDao.updateStaffById(staffEntity);
		return 0;
	}

	public List<StaffEntity> findAll() {
		// TODO Auto-generated method stub
		return staffDao.findAll();
	}


	public StaffEntity findById(int id) {
		// TODO Auto-generated method stub
		return staffDao.findStaffById(id);
	}

	

}
