package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class StaffEntity {
	/*
	 * 员工ID
	 */
	@Id
	@Column(name="staff_ID")
	private Integer staffId;
	/*
	 * 密码
	 */
	@Column(name="password")
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * 员工姓名
	 */
	@Column(name="staff_name",length=50)
	private String staffName;
	
	/*
	 * 员工性别
	 */
	@Column(name="staff_sex",length=20)
	private String staffSex;
	
	/*
	 * 员工年龄
	 */
	@Column(name="staff_age")
	private Integer staffAge;
	
	/*
	 * 员工职位
	 */
	@Column(name="position",length=50)
	private String position;
	
	/*
	 * 员工住址
	 */
	@Column(name="staff_address",length=100)
	private String staffAddress;
	
	/*
	 * 员工电话
	 */
	@Column(name="staff_phoneE",length=20)
	private String staffPhone;
	
	/*
	 * 权限
	 */
	@Column(name="limit")
	private Integer limit;

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffSex() {
		return staffSex;
	}

	public void setStaffSex(String staffSex) {
		this.staffSex = staffSex;
	}

	public Integer getStaffAge() {
		return staffAge;
	}

	public void setStaffAge(Integer staffAge) {
		this.staffAge = staffAge;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getStaffAddress() {
		return staffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}

	public String getStaffPhone() {
		return staffPhone;
	}

	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}
	
	public String toString(){
		return "staffId:"+staffId+"\npassword:"+password+"\nname:"+staffName;
		
	}

}
