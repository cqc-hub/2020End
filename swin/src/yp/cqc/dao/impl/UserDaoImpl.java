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
import yp.cqc.pojo.banners;

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
			//MySQL���������ݿ��ַ������ò����� �޸�����-->  ?useUnicode=true&characterEncoding=utf8
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
		//����jdbc����
			Connection conn=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
		//��������
			List<SwUser> lu=null;
		
			try {
				//��������
				Class.forName("com.mysql.jdbc.Driver");
				//��ȡ����
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
				//����sql����
				String sql="select* from table_user ";
				//����sql�������
				ps=conn.prepareStatement(sql);
				//�����ϸ�ֵ
				lu=new ArrayList<SwUser>();
				
				//ִ��sql
				rs=ps.executeQuery();
				//�������
				while(rs.next()){
					//��������ֵ
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
					//������洢��������
					lu.add(u);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				//�ر���Դ
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
		
		
		
		//���ؽ��
		return lu;
	}

	@Override
	public List<banners> ShowBannersDao() {
		// TODO Auto-generated method stub
				//����jdbc����
					Connection conn=null;
					PreparedStatement ps=null;
					ResultSet rs=null;
				//��������
					List<banners> bs=null;
				
					try {
						Class.forName("com.mysql.jdbc.Driver");
						conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
						String sql="select* from banners ";
						ps=conn.prepareStatement(sql);
						bs=new ArrayList<banners>();
						
						rs=ps.executeQuery();
						while(rs.next()){
							banners u=new banners();
							u.setId(rs.getInt("id"));
							u.setImage(rs.getString("image"));
							u.setLink(rs.getString("link"));
							bs.add(u);
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						//�ر���Դ
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
				
				
				
				return bs;
	}


	

	

}
