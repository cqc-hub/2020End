package yp.cqc.service.impl;

import java.util.List;

import javax.xml.registry.infomodel.User;

import yp.cqc.dao.UserDao;
import yp.cqc.dao.impl.UserDaoImpl;
import yp.cqc.pojo.SwUser;
import yp.cqc.pojo.banners;
import yp.cqc.service.SwService;

public class SwServiceImpl implements SwService{
	UserDao ud=new UserDaoImpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public SwUser LoginService(String uname, String pwd) {
		// TODO Auto-generated method stub
		return ud.LoginDao(uname, pwd);
	}

	@Override
	public List<SwUser> UserShowService() {
		// TODO Auto-generated method stub
		return ud.ShowUserDao();
	}

	@Override
	public List<banners> ShowBannerService() {
		// TODO Auto-generated method stub
		return ud.ShowBannersDao();
	}

	

	

}
