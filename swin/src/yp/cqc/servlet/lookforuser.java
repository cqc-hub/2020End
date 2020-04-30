package yp.cqc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import yp.cqc.pojo.SwUser;
import yp.cqc.service.SwService;
import yp.cqc.service.impl.SwServiceImpl;

/**
 * Servlet implementation class lookforuser
 */
@WebServlet("/lookforuser")
public class lookforuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	   String uname=req.getParameter("uname");
	   SwService ss=new SwServiceImpl();
	   SwUser u=ss.LookUserService(uname);
	   System.out.println(u);
	   if(u!=null){
		  resp.getWriter().write(new Gson().toJson(u));
   	   }
}

}
