//一个集合所有窗口的卡片式布局，称为CommFrame
package 疫情;

import javax.swing.*;



import java.awt.*;  
import java.awt.event.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List; 

public class CommFrame extends JFrame implements ActionListener {

	    JMenuBar bar; 
	    JMenu menu,menu1,menu2;  
	    JMenuItem scanItem,deleteItem,updateItem,insertItem,searchItem;
	    JMenuItem scanItem1,deleteItem1,updateItem1,insertItem1,searchItem1,zhuTu; 
	    Scan_stu scan;    //查看所有学生信息  
	    Delete_stu delete;//删除学生信息  
	    Update_stu update;//更新学生信息  
	    Insert_stu insert;//插入学生信息  
	    Search_stu search;//查找学生信息  
	    
	    Scan_message scan_message;   //查看学生疫情申报信息
	    Delete_message delete_message;//删除学生疫情申报信息
	    Update_message update_message;//更新学生疫情申报信息  
	    Insert_message insert_message;//插入学生疫情申报信息
	    Search_message search_message;//查找学生疫情申报信息
	    
	    CardLayout card=null;  
	    
	    JPanel pCenter;  
	    CommFrame(){  
	        setLayout(new FlowLayout());  
	        scanItem=new JMenuItem("浏览");  
	        deleteItem=new JMenuItem("删除");  
	        updateItem=new JMenuItem("修改");  
	        insertItem=new JMenuItem("添加");  
	        searchItem=new JMenuItem("查找");  
	        
	        scanItem1=new JMenuItem("浏览");  
	        deleteItem1=new JMenuItem("删除");  
	        updateItem1=new JMenuItem("修改");  
	        insertItem1=new JMenuItem("添加");  
	        searchItem1=new JMenuItem("查找");  
//	        ---------------
	        zhuTu=new JMenuItem("疫情柱状图信息");
	        bar=new JMenuBar();  
	        menu=new JMenu("未填报学生信息");     
	        menu1=new JMenu("已填报学生疫情信息");
//	        图表生成
	        menu2=new JMenu("疫情柱状图生成");
	        menu.add(scanItem);  
	        menu.add(deleteItem);  
	        menu.add(updateItem);  
	        menu.add(insertItem);  
	        menu.add(searchItem);  
	        
	        menu1.add(scanItem1);  
	        menu1.add(deleteItem1);  
	        menu1.add(updateItem1);  
	        menu1.add(insertItem1);  
	        menu1.add(searchItem1);  
//	        -----------
	        menu2.add(zhuTu);
	        bar.add(menu);  
	        bar.add(menu1); 
//	        -------------------------------------------
	        bar.add(menu2);
	        setJMenuBar(bar);  
	        scanItem.addActionListener(this);  
	        deleteItem.addActionListener(this);  
	        updateItem.addActionListener(this);  
	        insertItem.addActionListener(this);  
	        searchItem.addActionListener(this);  
//	        --------------
	        zhuTu.addActionListener(this);
	        
	        scanItem1.addActionListener(this);  
	        deleteItem1.addActionListener(this);  
	        updateItem1.addActionListener(this);  
	        insertItem1.addActionListener(this);  
	        searchItem1.addActionListener(this);  
	        
	        scan=new Scan_stu();  
	        update=new Update_stu();  
	        delete=new Delete_stu();  
	        insert=new Insert_stu();  
	        search=new Search_stu();  
	        card=new CardLayout();  
	        
	        scan_message=new Scan_message();  
	        update_message=new Update_message();  
	        delete_message=new Delete_message();  
	        insert_message=new Insert_message();  
	        search_message=new Search_message();  
	        card=new CardLayout();  
	        
	        pCenter=new JPanel();  
	        pCenter.setLayout(card);  
	        pCenter.add("scanItem", scan);  
	        pCenter.add("deleteItem",delete);  
	        pCenter.add("updateItem",update);  
	        pCenter.add("insertItem",insert);  
	        pCenter.add("searchItem",search);  
	 
	        pCenter.add("scanItem1", scan_message);  
	        pCenter.add("deleteItem1",delete_message);  
	        pCenter.add("updateItem1",update_message);  
	        pCenter.add("insertItem1",insert_message);  
	        pCenter.add("searchItem1",search_message); 
	        
	        
	        add(pCenter,BorderLayout.SOUTH);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        setVisible(true);  
	        setBounds(400,150,550,400);  
	        setTitle("疫情信息管理系统");  
	        validate();  
	    }  
	    

	    
	    public void actionPerformed(ActionEvent e){  
	        if(e.getSource()==scanItem) { 
	        	scan=new Scan_stu(); 
	        	pCenter.add("scanItem", scan); 
	            card.show(pCenter, "scanItem");  
	          } else if(e.getSource()==deleteItem)  
	            card.show(pCenter, "deleteItem");     
	        else if(e.getSource()==updateItem)  
	            card.show(pCenter, "updateItem");  
	        else if(e.getSource()==insertItem)  
	            card.show(pCenter, "insertItem");  
	        else if(e.getSource()==searchItem)  
	            card.show(pCenter, "searchItem"); 
	        else if(e.getSource()==zhuTu) {
	        	List<Integer> list;
				try {
					list = Query.getAllInfo();
					JFreeChartTest2.picture(list.get(0),list.get(1),list.get(2),list.get(3),list.get(4));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
	        }
	        
	        if(e.getSource()==scanItem1)  
	            card.show(pCenter, "scanItem1");  
	        else if(e.getSource()==deleteItem1)  
	            card.show(pCenter, "deleteItem1");     
	        else if(e.getSource()==updateItem1)  
	            card.show(pCenter, "updateItem1");  
	        else if(e.getSource()==insertItem1)  
	            card.show(pCenter, "insertItem1");  
	        else if(e.getSource()==searchItem1)  
	            card.show(pCenter, "searchItem1"); 
	    }  
	  
}
