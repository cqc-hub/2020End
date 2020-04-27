package yp.cqc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.registry.infomodel.User;

import yp.cqc.dao.UserDao;
import yp.cqc.pojo.SwUser;

public class UserDaoImpl implements UserDao{

	@Override
	public SwUser LoginDao(String uname, String pwd) {
		// TODO Auto-generated method stub
		SwUser u=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
			//MySQL驱动和数据库字符集设置不搭配 修改设置-->  ?useUnicode=true&characterEncoding=utf8
			String sql="select * from table_user where uname=? and pwd=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, uname);
			ps.setString(2, pwd);
			rs=ps.executeQuery();
			while(rs.next()){
				u=new SwUser();
				u.setUid(rs.getInt("uid"));
				u.setUname(rs.getString("uname"));
				u.setPwd(rs.getString("pwd"));
				u.setAge(rs.getInt("age"));
				u.setBirth(rs.getString("birth"));
				u.setSex(rs.getString("sex"));
				u.setBodyhel(rs.getString("bodyhel"));
				u.setScore1(rs.getInt("score1"));
				u.setScore2(rs.getInt("score2"));
				u.setScore3(rs.getInt("score3"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return u;
	}

	@Override
	public List<SwUser> ShowUserDao() {
		// TODO Auto-generated method stub
		//声明jdbc参数
			Connection conn=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
		//声明变量
			List<SwUser> lu=null;
		
			try {
				//加载驱动
				Class.forName("com.mysql.jdbc.Driver");
				//获取连接
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
				//创建sql命令
				String sql="select* from table_user ";
				//创建sql命令对象
				ps=conn.prepareStatement(sql);
				//给集合赋值
				lu=new ArrayList<SwUser>();
				
				//执行sql
				rs=ps.executeQuery();
				//遍历结果
				while(rs.next()){
					//给变量赋值
					SwUser u=new SwUser();
					u.setUid(rs.getInt("uid"));
					u.setUname(rs.getString("uname"));
					u.setPwd(rs.getString("pwd"));
					u.setAge(rs.getInt("age"));
					u.setBirth(rs.getString("birth"));
					u.setSex(rs.getString("sex"));
					u.setBodyhel(rs.getString("bodyhel"));
					u.setScore1(rs.getInt("score1"));
					u.setScore2(rs.getInt("score2"));
					u.setScore3(rs.getInt("score3"));
					//将对象存储到对象中
					lu.add(u);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				//关闭资源
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		
		
		//返回结果
		return lu;
	}

	

}
