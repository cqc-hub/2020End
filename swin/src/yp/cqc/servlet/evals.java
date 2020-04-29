package yp.cqc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import yp.cqc.pojo.Evals;
import yp.cqc.pojo.SwUser;
import yp.cqc.service.SwService;
import yp.cqc.service.impl.SwServiceImpl;

/**
 * Servlet implementation class evals
 */
@WebServlet("/evals")
public class evals extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	SwService ss=new SwServiceImpl();
  	   List<Evals> es=ss.EvalShowService();
     	System.out.println(es);
     	if(es!=null){
    		resp.getWriter().write(new Gson().toJson(es));
//    		resp.sendRedirect("/swin/swin1.jsp");
    	}
    }

}
