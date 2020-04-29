package yp.cqc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import yp.cqc.pojo.SwUser;
import yp.cqc.service.SwService;
import yp.cqc.service.impl.SwServiceImpl;
/**
 * Servlet implementation class reg
 */
@WebServlet("/reg")
public class reg extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		String sex=req.getParameter("sex");
		int age=req.getParameter("age")!=""?Integer.parseInt(req.getParameter("age")):0;
		String birth=req.getParameter("birth");
		
		System.out.println(uname+":"+pwd+":"+sex+":"+age+":"+birth);
		SwUser u=new SwUser(0,uname, pwd, sex, age, birth,"未测定",0,0,0,0);
	//处理请求
		//调用业务层
			SwService ss=new SwServiceImpl();
			int index=ss.userRegService(u);
			System.out.println(index);
			if(index>0){
				resp.getWriter().write("1");
			}else{
				resp.getWriter().write("-1");
			}
	}

}
