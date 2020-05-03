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
 * Servlet implementation class changeQX
 */
@WebServlet("/changeQX")
public class changeQX extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int uid=Integer.parseInt(req.getParameter("uid"));
		int newQX=Integer.parseInt(req.getParameter("newQX"));
		SwService sw=new SwServiceImpl();
    	int index=sw.userChangeQXServlce(newQX,uid);
		System.out.println(index);
		if(index>0){
			resp.getWriter().write("true");
		}else{
			resp.getWriter().write("false");
		}
	}

}
