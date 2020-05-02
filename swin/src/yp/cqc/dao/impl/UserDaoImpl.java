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
import yp.cqc.pojo.Evals;
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
				u.setQx(rs.getInt("qx"));
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
					u.setQx(rs.getInt("qx"));
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

	@Override
	public List<banners> ShowBannersDao() {
		// TODO Auto-generated method stub
				//声明jdbc参数
					Connection conn=null;
					PreparedStatement ps=null;
					ResultSet rs=null;
				//声明变量
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
				
				
				
				return bs;
	}

	@Override
	public List<Evals> ShowEvalDao() {
		// TODO Auto-generated method stub
		//声明jdbc参数
			Connection conn=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
		//声明变量
			List<Evals> es=null;
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
				String sql="select* from table_eval ";
				ps=conn.prepareStatement(sql);
				es=new ArrayList<Evals>();
				
				rs=ps.executeQuery();
				while(rs.next()){
					Evals e=new Evals();
					e.setId(rs.getInt("id"));
					e.setUname(rs.getString("uname"));
					e.setCreate(rs.getLong("create"));
					e.setEval(rs.getString("eval"));
					e.setUid(rs.getInt("uid"));
					es.add(e);
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
		
		
		
		return es;
	}

	@Override
	public int RegUser(SwUser u) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		//声明变量
		int index=-1;
		
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
			//创建sql语句
			String sql="insert into table_user values(default,?,?,?,?,?,?,?,?,?,?)";
			//创建sql命令对象 
			ps=conn.prepareStatement(sql);
			//给占位符赋值
			ps.setString(1, u.getUname());
			ps.setString(2, u.getPwd());
			ps.setString(3, u.getSex());
			ps.setInt(4, u.getAge());
			ps.setString(5, u.getBirth());
			ps.setString(6, u.getBodyhel());
			ps.setInt(7, u.getScore1());
			ps.setInt(8, u.getScore2());
			ps.setInt(9, u.getScore3());
			ps.setInt(10, u.getQx());
			//执行
			index=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭资源
		
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
		
		
		return index;
	}

	@Override
	public int reviseEvals(Evals es) {
		// TODO Auto-generated method stub
				Connection conn=null;
				PreparedStatement ps=null;
				ResultSet rs=null;
				//声明变量
				int index=-1;
				
				try {
					//加载驱动
					Class.forName("com.mysql.jdbc.Driver");
					//获取连接
					conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
					//创建sql语句
					String sql="insert into table_eval values(default,?,?,?,?)";
					//创建sql命令对象 
					ps=conn.prepareStatement(sql);
					//给占位符赋值
					ps.setString(1, es.getUname());
					ps.setLong(2, es.getCreate());
					ps.setString(3, es.getEval());
					ps.setInt(4, es.getUid());
					
					//执行
					index=ps.executeUpdate();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					//关闭资源
				
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
				
				
				return index;
	}

	@Override
	public SwUser LookUserDao(String uname) {
		// TODO Auto-generated method stub
				SwUser u=null;
				Connection conn=null;
				PreparedStatement ps=null;
				ResultSet rs=null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
					//MySQL驱动和数据库字符集设置不搭配 修改设置-->  ?useUnicode=true&characterEncoding=utf8
					String sql="select * from table_user where uname=?";
					ps=conn.prepareStatement(sql);
					ps.setString(1, uname);
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
						u.setQx(rs.getInt("qx"));
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
	public int userChangePwdDao(String newPwd, int uid) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		//创建变量
		int index=-1;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
			String sql="update table_user set pwd=? where uid=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, newPwd);
			ps.setInt(2, uid);
			index=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭资源
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
		
		return index;
	}

	@Override
	public int userChangeAgeDao(int newAge, int uid) {
		// TODO Auto-generated method stub
				Connection conn=null;
				PreparedStatement ps=null;
				ResultSet rs=null;
				//创建变量
				int index=-1;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
					String sql="update table_user set age=? where uid=?";
					ps=conn.prepareStatement(sql);
					ps.setInt(1, newAge);
					ps.setInt(2, uid);
					index=ps.executeUpdate();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					//关闭资源
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
				
				return index;
	}

	@Override
	public int userChangeBirDao(String newBir, int uid) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		//创建变量
		int index=-1;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
			String sql="update table_user set birth=? where uid=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, newBir);
			ps.setInt(2, uid);
			index=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭资源
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
		
		return index;
	}

	@Override
	public int userDelDao(int uid) {
		// TODO Auto-generated method stub
				Connection conn=null;
				PreparedStatement ps=null;
				ResultSet rs=null;
				//创建变量
				int index=-1;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8","root","root");
					String sql="delete from table_user where uid = ?";
					ps=conn.prepareStatement(sql);
					ps.setInt(1, uid);
					index=ps.executeUpdate();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					//关闭资源
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
				
				return index;
	}


	

	

}
