package yp.cqc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.StringUtils;

import yp.cqc.pojo.Evals;
import yp.cqc.service.SwService;
import yp.cqc.service.impl.SwServiceImpl;

/**
 * Servlet implementation class reviseEvals
 */
//¸üÐÂÆÀÂÛ
@WebServlet("/reviseEvals")
public class reviseEvals extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	String uname=req.getParameter("uname");
    	long create=Long.parseLong((req.getParameter("create")));
    	String eval=req.getParameter("eval");
    	int uid=Integer.parseInt((req.getParameter("uid")));
    	System.out.println(uname+":"+create+":"+eval+":"+uid);
    	Evals es=new Evals(0,uname,create,eval,uid); 
    	
    	SwService ss=new SwServiceImpl();
    	int index=ss.reviseEvalsService(es);
    	System.out.println(index);
		if(index>0){
			resp.getWriter().write("1");
		}else{
			resp.getWriter().write("-1");
		}
    }

}
