package 疫情;

import java.awt.*;  

 
  
import java.awt.event.*;  
  
import javax.swing.*;  
import javax.swing.table.*;

import 疫情.Query; 

public class Scan_stu extends JPanel implements ActionListener{
	 DefaultTableModel update_table;  
	    JTable table;  
	    Query query;  
	    JButton button;  
	    Object a[][];  
	    String b[];  
	    Scan_stu(){  
	        setLayout(new FlowLayout());  
	        setBackground(Color.white);  
	        query=new Query();  
	        query.setTableName("stu");  
	        a=query.getRecord();  
	        b=query.getField();  
	        update_table=new DefaultTableModel(a, b);  
	        table=new JTable(update_table);  
	        JScrollPane scrollPane = new JScrollPane(table);  
	        scrollPane.setBounds(0,0,550,380);  
	        table.setPreferredSize(new Dimension(scrollPane.getWidth() - 50, scrollPane.getHeight()*2));//使表格出现滑动条  
	        add(scrollPane);  
	    }  
	    public void actionPerformed(ActionEvent e){  
	        a=null;b=null;  
	        query=new Query();  
	        query.setTableName("stu");  
	        a=query.getRecord();  
	        b=query.getField();  
	        update_table.setDataVector(a, b);  
	    }  
}
