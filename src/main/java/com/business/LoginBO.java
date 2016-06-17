package com.business;

import java.util.HashMap;

import com.Model.LoginModel;
import com.dao.LoginDao;

public class LoginBO {
	
	private LoginModel loginModel;
	private LoginDao loginDao;
	
	public HashMap<Long, String> getSchoolNames(){
		loginDao.getSchoolNames();
		return null;
		
	}

	public LoginModel getLoginModel() {
		return loginModel;
	}

	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

}
