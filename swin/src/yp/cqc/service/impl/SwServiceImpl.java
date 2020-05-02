package yp.cqc.service.impl;

import java.util.List;

import javax.xml.registry.infomodel.User;

import yp.cqc.dao.UserDao;
import yp.cqc.dao.impl.UserDaoImpl;
import yp.cqc.pojo.Evals;
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

	@Override
	public List<Evals> EvalShowService() {
		// TODO Auto-generated method stub
		return ud.ShowEvalDao();
	}

	@Override
	public int userRegService(SwUser u) {
		// TODO Auto-generated method stub
		return ud.RegUser(u);
	}

	@Override
	public int reviseEvalsService(Evals es) {
		// TODO Auto-generated method stub
		return ud.reviseEvals(es);
	}

	@Override
	public SwUser LookUserService(String uname) {
		// TODO Auto-generated method stub
		return ud.LookUserDao(uname);
	}

	@Override
	public int userChangePwdServlce(String newPwd, int uid) {
		// TODO Auto-generated method stub
		return ud.userChangePwdDao(newPwd,uid);
	}

	@Override
	public int userChangeAgeServlce(int newAge, int uid) {
		// TODO Auto-generated method stub
		return ud.userChangeAgeDao(newAge,uid);
	}

	@Override
	public int userChangeBirServlce(String newBir, int uid) {
		// TODO Auto-generated method stub
		return ud.userChangeBirDao(newBir,uid);
	}

	@Override
	public int userDelServlce(int uid) {
		// TODO Auto-generated method stub
		return ud.userDelDao(uid);
	}

	

	

}
