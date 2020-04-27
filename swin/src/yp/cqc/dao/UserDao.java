package yp.cqc.dao;

import java.util.List;

import javax.xml.registry.infomodel.User;

import yp.cqc.pojo.SwUser;

public interface UserDao {

	SwUser LoginDao(String uname, String pwd);

	List<SwUser> ShowUserDao();

	

}
