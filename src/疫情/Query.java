package 疫情;
//Scan_stu调用的Query查找函数


import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class Query {
	 Object a[][]=null;  
	    String b[]=null;  
	    String tableName="";  
	    int 字段个数;  
	    public Query(){  
	        try{  
	            Class.forName("com.mysql.jdbc.Driver");  
	        }  
	        catch(ClassNotFoundException e){  
	            System.out.println(e);  
	        }  
	    }  
	    public Object[][] getRecord(){//求表格的内容  
	        a=null;  
	        b=null;  
	        Connection con;  
	        Statement sql;  
	        ResultSet rs;  
	        try{  
	            String url,userName,userPwd;  
	            url="jdbc:mysql://localhost:3306/studentinfo?useUnicode=true&amp;characterEncoding=utf-8";  
	            userName="root";  
	            userPwd="root";  
	            con=DriverManager.getConnection(url,userName,userPwd);  
	            int 字段个数=getZiDuan();  
	            int n=getAmount();  
	            a=new Object[n][字段个数];  
	            sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);  
	            rs=sql.executeQuery("select * from "+tableName);  
	            int m=0;  
	            while(rs.next()){  
	                for(int k=1;k<=字段个数;k++){  
	                    a[m][k-1]=rs.getString(k);  
	                }  
	                System.out.println();  
	                m++;  
	            }  
	            con.close();  
	        }  
	        catch(SQLException e){  
	            System.out.println("请输入正确的表名"+e);  
	        }  
	        return a;  
	    }  
	    public int getAmount(){//求表内容有多少行  
	        Connection con;  
	        Statement sql;  
	        ResultSet rs;  
	        try{  
	            String url,userName,userPwd;  
	            url="jdbc:mysql://localhost:3306/studentinfo?useUnicode=true&amp;characterEncoding=utf-8";  
	            userName="root";  
	            userPwd="root";  
	            con=DriverManager.getConnection(url,userName,userPwd);  
	            sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);  
	            rs=sql.executeQuery("select * from "+tableName);  
	            rs.last();  
	            int rows=rs.getRow();  
	            return rows;  
	        }  
	        catch(SQLException exp){  
	            System.out.println(""+exp);  
	            return 0;  
	        }  
	    }  
	    public String[] getField(){//求字段名称  
	        Connection con;  
	        try{  
	            String url,userName,userPwd;  
	            url="jdbc:mysql://localhost:3306/studentinfo?useUnicode=true&amp;characterEncoding=utf-8";  
	            userName="root";  
	            userPwd="root";  
	            con=DriverManager.getConnection(url,userName,userPwd);  
	            DatabaseMetaData metadata=con.getMetaData();  
	            ResultSet rs1=metadata.getColumns(null, null, tableName, null);  
	            int 字段个数=getZiDuan();  
	            b=new String[字段个数];  
	            int k=0;  
	            while(rs1.next()){  
	                b[k]=rs1.getString(4);  
	                k++;  
	            }  
	            con.close();          
	        }  
	        catch(SQLException e){  
	            System.out.println(e);  
	        }  
	        return b;  
	    }  
	    public void setTableName(String s){//初试表名  
	        tableName=s.trim();  
	    }  
	    public int getZiDuan(){//求字段个数  
	        Connection con;  
	        PreparedStatement sql;  
	        ResultSet rs;  
	        try{  
	            String url,userName,userPwd;  
	            url="jdbc:mysql://localhost:3306/studentinfo?useUnicode=true&amp;characterEncoding=utf-8";  
	            userName="root";  
	            userPwd="root";  
	            con=DriverManager.getConnection(url,userName,userPwd);  
	            DatabaseMetaData metadata=con.getMetaData();  
	            ResultSet rs1=metadata.getColumns(null, null, tableName, null);  
	            字段个数=0;  
	            while(rs1.next())  
	                字段个数++;  
	        }  
	        catch(SQLException e){  
	            System.out.println(e);  
	        }  
	        return 字段个数;  
	    }  
	    
	    
	    public static List<Integer> getAllInfo() throws SQLException, ParseException {
	    	Connection conn = null;  
	    	PreparedStatement pst =null;  
	        ResultSet rs = null;  
	    	
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
//			查询所有情况
			List<Integer> list = new ArrayList<>(); 
			Student stu = new Student();
			try {
				// 1）注册驱动
				Class.forName("com.mysql.jdbc.Driver");
				// 2）创建连接对象
//						String url = "jdbc:mysql://localhost:3306/studentinfo?useUnicode=true&amp;characterEncoding=utf-8";
				String url = "jdbc:mysql://localhost:3306/studentinfo?serverTimezone=GMT%2B8";
				conn = DriverManager.getConnection(url, "root", "root");
			} catch (Exception e) {
				e.printStackTrace();
			}
//			是否密切接触
			String sql = "select count(是否接触) as te from message WHERE 是否接触 = ? ";
			
			 pst = conn.prepareStatement(sql);
			pst.setString(1, "是");
			 rs = pst.executeQuery();
			while(rs.next()) {
				list.add(Integer.parseInt(rs.getString("te")));
			}
			
			
//			统计是否武汉
			String sql1 = "select count(是否在武汉) as te1 from message WHERE 是否在武汉 = ? ";
			
			PreparedStatement pst1 = conn.prepareStatement(sql1);
			pst1.setString(1, "是");
			ResultSet rs1 = pst1.executeQuery();
			while(rs1.next()) {
				list.add(Integer.parseInt(rs1.getString("te1")));
			}
			
//			统计是否湖北
			String sql2 = "select count(是否在湖北) as te2 from message WHERE 是否在湖北 = ? ";
			
			PreparedStatement pst2 = conn.prepareStatement(sql2);
			pst2.setString(1, "是");
			ResultSet rs2 = pst2.executeQuery();
			while(rs2.next()) {
				list.add(Integer.parseInt(rs2.getString("te2")));
			}
			
			
//			统计是否疑似
			String sql3 = "select count(是否疑似) as te3 from message WHERE 是否疑似 = ? ";
			
			PreparedStatement pst3 = conn.prepareStatement(sql3);
			pst3.setString(1, "是");
			ResultSet rs3 = pst3.executeQuery();
			while(rs3.next()) {
				list.add(Integer.parseInt(rs3.getString("te3")));
			}
			
			
//			统计是否确诊
			String sql4 = "select count(是否确诊) as te4 from message WHERE 是否确诊 = ? ";
			
			PreparedStatement pst4 = conn.prepareStatement(sql4);
			pst4.setString(1, "是");
			ResultSet rs4 = pst4.executeQuery();
			while(rs4.next()) {
				list.add(Integer.parseInt(rs4.getString("te4")));
			}
			
			return list;
		}
	    

}
