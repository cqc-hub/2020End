package yp.cqc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import yp.cqc.service.SwService;
import yp.cqc.service.impl.SwServiceImpl;

/**
 * Servlet implementation class changeScore1
 */
@WebServlet("/changeScore1")
public class changeScore1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int score1=Integer.parseInt(req.getParameter("score1"));
		int uid=Integer.parseInt(req.getParameter("uid"));
		SwService sw=new SwServiceImpl();
		int index=sw.changeScore1Service(uid,score1);
    	System.out.println(index);
		if(index>0){
			resp.getWriter().write("true");
		}else{
			resp.getWriter().write("false");
		}
		
	}
}
