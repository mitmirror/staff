package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.dom4j.tree.BackedList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import dao.StaffDao;
import entity.StaffEntity;

@Repository
public class StaffDaoImpl implements StaffDao {
	@Resource
	private SessionFactory sessionFactory;

	public void addStaff(StaffEntity staffEntity) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(staffEntity);
		
	}

	public void deleteStaffById(Integer id) {
		// TODO Auto-generated method stub
		String hql="delete staff where staffId=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0, id);
		query.executeUpdate();
		
		
	}

	public void updateStaffById(StaffEntity staffEntity) {
		// TODO Auto-generated method stub
		String hql="update staff set password=?,staffName=?,staffAddress=? where id=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0, staffEntity.getPassword());
		query.setParameter(1, staffEntity.getStaffName());
		query.setParameter(2, staffEntity.getStaffAddress());
		query.setParameter(3, staffEntity.getStaffId());
		query.executeUpdate();
	}

	public StaffEntity findStaffById(Integer id) {
		// TODO Auto-generated method stub
		String hql="form staff where staffId=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0, id);
		return (StaffEntity)query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<StaffEntity> findAll() {
		// TODO Auto-generated method stub
		String hql="from staff";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}

	
}
