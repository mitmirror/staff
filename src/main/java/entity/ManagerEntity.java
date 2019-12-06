package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class ManagerEntity {
	/*
	 * 管理员ID
	 */
	@Id
	@Column(name="manager_id")
	private Integer managerID;
	
	/*
	 * 管理员密码
	 */
	@Column(name="password")
	private String password;
	
	/*
	 * 权限
	 */
	@Column(name="limit")
	private Integer limit;

	public Integer getManagerID() {
		return managerID;
	}

	public void setManagerID(Integer managerID) {
		this.managerID = managerID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
	
	

}
