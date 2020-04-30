package yp.cqc.dao;

import java.util.List;

import javax.xml.registry.infomodel.User;

import yp.cqc.pojo.Evals;
import yp.cqc.pojo.SwUser;
import yp.cqc.pojo.banners;

public interface UserDao {

	SwUser LoginDao(String uname, String pwd);

	List<SwUser> ShowUserDao();


	List<banners> ShowBannersDao();

	List<Evals> ShowEvalDao();

	int RegUser(SwUser u);

	int reviseEvals(Evals es);

	SwUser LookUserDao(String uname);

	int userChangePwdDao(String newPwd, int uid);


	

}
