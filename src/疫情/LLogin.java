package 疫情;

import java.sql.*;  
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.awt.Color; 

public class LLogin {
	
	 public static void main(String[] args) {  
	        new loginFrame();   
	    }  	  
	} 
 	
	class loginFrame extends JFrame implements ActionListener{  
	    Box box1,box2,baseBox;  
	    JLabel userName,userPwd,tubiao;  
	    JTextField nameField;  
	    JPasswordField pwdField;  
	    JButton button;  
	    JTabbedPane choose;  
	    JPanel panel1,panel2;  
	    loginFrame(){  
	        setBackground(Color.white);  
	        userName=new JLabel("账号",JLabel.CENTER);  
	        userPwd=new JLabel("密码",JLabel.CENTER);  
	        nameField=new JTextField(8);  
	        pwdField=new JPasswordField(8);  
	        panel1=new JPanel();  
	        panel2=new JPanel();  
	        choose=new JTabbedPane();  
	        choose.add("登录界面",panel1);  
	        panel1.setLayout(new GridLayout(2,2));  
	        panel1.add(userName);panel1.add(nameField);  
	        panel1.add(userPwd);panel1.add(pwdField);  
	        add(choose,BorderLayout.CENTER);  
	        button=new JButton("登陆");  
	        add(button,BorderLayout.SOUTH);  
	        button.addActionListener(this);  
	        //小图标
	        ImageIcon tubiao=new ImageIcon("H:/Java：学生信息成绩管理系统/StudentSystem/src/疫情/层云.jpeg"); 
	        setIconImage(tubiao.getImage());  
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        setVisible(true);  
	        setBounds(200,100,500,200);  
	        setTitle("疫情信息管理系统");  
	        validate();  
	    }  


	    public void actionPerformed(ActionEvent e){  
	        String name,pwd;  
	        name=nameField.getText();  
	        pwd=pwdField.getText();  
	        try{  
	          Class.forName("com.mysql.jdbc.Driver"); //加载数据库驱动 
	           
	        }  
	        catch(ClassNotFoundException ex){  
	        System.out.println(ex);  
	        }  
	        try{  
	            Connection con;  
	            Statement sql;  
	            ResultSet rs;  
	            String url,userName,userPwd;  
	             // 连接数据库的语句
	          url =  "jdbc:mysql://localhost:3306/studentinfo?useUnicode=true&amp;characterEncoding=utf-8";
	        
	            userName="root";  
	            userPwd="root";  
	            con=DriverManager.getConnection(url,userName,userPwd);  
	            sql=con.createStatement();  
	            rs=sql.executeQuery("select * from login where name ='"+name+"' and pwd='"+pwd+"'");  
	            int q=0;  
	            
	            while(rs.next()){  
	                q++;  
	              
	            }  
	            if(q>0){  
	                JOptionPane.showMessageDialog(this, "登陆成功！","消息对话框",JOptionPane.WARNING_MESSAGE);  
	                this.dispose();  
	                new CommFrame();    
	                  
	            }  
	            else  
	                JOptionPane.showMessageDialog(this, "账号或者密码错误!","消息对话框",JOptionPane.WARNING_MESSAGE);  
	        }  
	        catch(SQLException exp){  
	            System.out.println(exp);  
	        } 
	        
	    }  
}