package service;

import java.util.List;

import entity.StaffEntity;

public interface StaffService {
	/*
	 * 新增员工
	 */
	public int addStaff(StaffEntity staffEntity);
	
	/*
	 * 删除员工
	 */
	public int deleteStaff(Integer id);
	
	/*
	 * 修改员工信息
	 */
	public int updateStaff(StaffEntity staffEntity);
	
	/*
	 * 查询所有员工
	 */
	public List<StaffEntity> findAll();
	
	public StaffEntity findById(int id);
}
