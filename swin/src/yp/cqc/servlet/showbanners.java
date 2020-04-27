package yp.cqc.servlet;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import yp.cqc.pojo.banners;
import yp.cqc.service.SwService;
import yp.cqc.service.impl.SwServiceImpl;

/**
 * Servlet implementation class showbanners
 */
@WebServlet("/showbanners")
public class showbanners extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SwService ss=new SwServiceImpl();
		List<banners> banners=ss.ShowBannerService();
    	System.out.println(banners);
    	if(banners!=null){
    		resp.getWriter().write(new Gson().toJson(banners));
//    		resp.sendRedirect("/swin/swin1.jsp");
    	}
	}


}
