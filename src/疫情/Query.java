package ����;
//Scan_stu���õ�Query���Һ���


import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class Query {
	 Object a[][]=null;  
	    String b[]=null;  
	    String tableName="";  
	    int �ֶθ���;  
	    public Query(){  
	        try{  
	            Class.forName("com.mysql.jdbc.Driver");  
	        }  
	        catch(ClassNotFoundException e){  
	            System.out.println(e);  
	        }  
	    }  
	    public Object[][] getRecord(){//���������  
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
	            int �ֶθ���=getZiDuan();  
	            int n=getAmount();  
	            a=new Object[n][�ֶθ���];  
	            sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);  
	            rs=sql.executeQuery("select * from "+tableName);  
	            int m=0;  
	            while(rs.next()){  
	                for(int k=1;k<=�ֶθ���;k++){  
	                    a[m][k-1]=rs.getString(k);  
	                }  
	                System.out.println();  
	                m++;  
	            }  
	            con.close();  
	        }  
	        catch(SQLException e){  
	            System.out.println("��������ȷ�ı���"+e);  
	        }  
	        return a;  
	    }  
	    public int getAmount(){//��������ж�����  
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
	    public String[] getField(){//���ֶ�����  
	        Connection con;  
	        try{  
	            String url,userName,userPwd;  
	            url="jdbc:mysql://localhost:3306/studentinfo?useUnicode=true&amp;characterEncoding=utf-8";  
	            userName="root";  
	            userPwd="root";  
	            con=DriverManager.getConnection(url,userName,userPwd);  
	            DatabaseMetaData metadata=con.getMetaData();  
	            ResultSet rs1=metadata.getColumns(null, null, tableName, null);  
	            int �ֶθ���=getZiDuan();  
	            b=new String[�ֶθ���];  
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
	    public void setTableName(String s){//���Ա���  
	        tableName=s.trim();  
	    }  
	    public int getZiDuan(){//���ֶθ���  
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
	            �ֶθ���=0;  
	            while(rs1.next())  
	                �ֶθ���++;  
	        }  
	        catch(SQLException e){  
	            System.out.println(e);  
	        }  
	        return �ֶθ���;  
	    }  
	    
	    
	    public static List<Integer> getAllInfo() throws SQLException, ParseException {
	    	Connection conn = null;  
	    	PreparedStatement pst =null;  
	        ResultSet rs = null;  
	    	
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
//			��ѯ�������
			List<Integer> list = new ArrayList<>(); 
			Student stu = new Student();
			try {
				// 1��ע������
				Class.forName("com.mysql.jdbc.Driver");
				// 2���������Ӷ���
//						String url = "jdbc:mysql://localhost:3306/studentinfo?useUnicode=true&amp;characterEncoding=utf-8";
				String url = "jdbc:mysql://localhost:3306/studentinfo?serverTimezone=GMT%2B8";
				conn = DriverManager.getConnection(url, "root", "root");
			} catch (Exception e) {
				e.printStackTrace();
			}
//			�Ƿ����нӴ�
			String sql = "select count(�Ƿ�Ӵ�) as te from message WHERE �Ƿ�Ӵ� = ? ";
			
			 pst = conn.prepareStatement(sql);
			pst.setString(1, "��");
			 rs = pst.executeQuery();
			while(rs.next()) {
				list.add(Integer.parseInt(rs.getString("te")));
			}
			
			
//			ͳ���Ƿ��人
			String sql1 = "select count(�Ƿ����人) as te1 from message WHERE �Ƿ����人 = ? ";
			
			PreparedStatement pst1 = conn.prepareStatement(sql1);
			pst1.setString(1, "��");
			ResultSet rs1 = pst1.executeQuery();
			while(rs1.next()) {
				list.add(Integer.parseInt(rs1.getString("te1")));
			}
			
//			ͳ���Ƿ����
			String sql2 = "select count(�Ƿ��ں���) as te2 from message WHERE �Ƿ��ں��� = ? ";
			
			PreparedStatement pst2 = conn.prepareStatement(sql2);
			pst2.setString(1, "��");
			ResultSet rs2 = pst2.executeQuery();
			while(rs2.next()) {
				list.add(Integer.parseInt(rs2.getString("te2")));
			}
			
			
//			ͳ���Ƿ�����
			String sql3 = "select count(�Ƿ�����) as te3 from message WHERE �Ƿ����� = ? ";
			
			PreparedStatement pst3 = conn.prepareStatement(sql3);
			pst3.setString(1, "��");
			ResultSet rs3 = pst3.executeQuery();
			while(rs3.next()) {
				list.add(Integer.parseInt(rs3.getString("te3")));
			}
			
			
//			ͳ���Ƿ�ȷ��
			String sql4 = "select count(�Ƿ�ȷ��) as te4 from message WHERE �Ƿ�ȷ�� = ? ";
			
			PreparedStatement pst4 = conn.prepareStatement(sql4);
			pst4.setString(1, "��");
			ResultSet rs4 = pst4.executeQuery();
			while(rs4.next()) {
				list.add(Integer.parseInt(rs4.getString("te4")));
			}
			
			return list;
		}
	    

}
