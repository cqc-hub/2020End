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

	int userChangeAgeDao(int newAge, int uid);

	int userChangeBirDao(String newBir, int uid);

	int userDelDao(int uid);

	int changeScore1Dao(int uid, int score1);

	int changeScore2Dao(int uid, int score2);

	int changeScore3Dao(int uid, int score3);

	int changeBodyhelDao(int uid, String newbodyhel);


	

}
