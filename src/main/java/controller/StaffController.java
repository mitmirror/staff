package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.StaffEntity;
import service.LoginService;
import service.StaffService;
import service.impl.LoginServiceImpl;

@Controller
@RequestMapping
public class StaffController {
	
	@Resource(name="staffService")
	private StaffService staffService;
	
	@RequestMapping("/login")
	public String login(HttpRequest request,HttpSession session){
		LoginService loginService=new LoginServiceImpl();
		boolean isLogin=loginService.isLogin((Integer)session.getAttribute("id"), session.getAttribute("password").toString());
		if (isLogin) {
			return "staff/main";
		}
		return "staff/login";
	}
	
	@RequestMapping(name="/test")
	public String test(){
		StaffEntity staffEntity=new StaffEntity();
		staffEntity.setStaffId(321);
		staffEntity.setStaffName("test");
		staffEntity.setPassword("321");
		staffService.addStaff(staffEntity);
		return "test";
	}
	

}
