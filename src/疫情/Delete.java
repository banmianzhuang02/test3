//���õ�ɾ��������Delete
package ����;

import javax.swing.*;  

import java.sql.*;  


public class Delete extends JFrame{
	 String tableName;  
	    JTextField field[]=null;  
	    String a[]=null;  
	    public void setTableName(String s){  
	        tableName=s.trim();  
	    }  
	    public void setField(JTextField s[]){  
	        field=s;  
	    }  
	    public void setA(String e[]){  
	        a=e;  
	    }  
	    public Delete(){  
	          
	    }  
	    public void  Execute_Delete(int n){  
	        String SQL="";  
	        Connection con;  
	        Statement sql;  
	        SQL="delete from "+tableName+" where "+a[n]+" ='"+field[n].getText().toString()+"'";  
	        try{  
	            Class.forName("com.mysql.jdbc.Driver");  
	        }  
	        catch(ClassNotFoundException exp){  
	            System.out.println(exp);  
	        }  
	        try{  
	            String url,userName,userPwd;  
	            url="jdbc:mysql://localhost:3306/studentinfo?useUnicode=true&amp;characterEncoding=utf-8";  
	            userName="root";  
	            userPwd="root";  
	            con=DriverManager.getConnection(url,userName,userPwd);  
	            sql=con.createStatement();  
	            sql.executeUpdate(SQL);  
	            con.close();  
	            JOptionPane.showMessageDialog(this, "ɾ���ɹ�","��Ϣ�Ի���",JOptionPane.WARNING_MESSAGE);  
	            for(int i=0;i<field.length;i++)  
	                field[i].setText(null);;  
	        }  
	        catch(SQLException ex){  
	            System.out.println(ex);  
	        }  
	    }  
}
