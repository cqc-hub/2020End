package yp.cqc.service;

import java.util.List;

import javax.xml.registry.infomodel.User;

import yp.cqc.pojo.SwUser;

public interface SwService {

	SwUser LoginService(String uname, String pwd);

	List<SwUser> UserShowService();


}