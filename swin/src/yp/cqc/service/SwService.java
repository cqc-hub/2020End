package yp.cqc.service;

import java.util.List;

import javax.xml.registry.infomodel.User;

import yp.cqc.pojo.Evals;
import yp.cqc.pojo.SwUser;
import yp.cqc.pojo.banners;

public interface SwService {

	SwUser LoginService(String uname, String pwd);

	List<SwUser> UserShowService();

	List<banners> ShowBannerService();

	List<Evals> EvalShowService();

	int userRegService(SwUser u);

	int reviseEvalsService(Evals es);

	SwUser LookUserService(String uname);

	int userChangePwdServlce(String newPwd, int uid);

	int userChangeAgeServlce(int newAge, int uid);

	int userChangeBirServlce(String newBir, int uid);

	int userDelServlce(int uid);

	int changeScore1Service(int uid, int score1);

	int changeScore2Service(int uid, int score2);

	int changeScore3Service(int uid, int score3);

	int changeBodyhelService(int uid, String newbodyhel);




}
