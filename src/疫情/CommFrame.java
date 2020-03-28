//һ���������д��ڵĿ�Ƭʽ���֣���ΪCommFrame
package ����;

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
	    Scan_stu scan;    //�鿴����ѧ����Ϣ  
	    Delete_stu delete;//ɾ��ѧ����Ϣ  
	    Update_stu update;//����ѧ����Ϣ  
	    Insert_stu insert;//����ѧ����Ϣ  
	    Search_stu search;//����ѧ����Ϣ  
	    
	    Scan_message scan_message;   //�鿴ѧ�������걨��Ϣ
	    Delete_message delete_message;//ɾ��ѧ�������걨��Ϣ
	    Update_message update_message;//����ѧ�������걨��Ϣ  
	    Insert_message insert_message;//����ѧ�������걨��Ϣ
	    Search_message search_message;//����ѧ�������걨��Ϣ
	    
	    CardLayout card=null;  
	    
	    JPanel pCenter;  
	    CommFrame(){  
	        setLayout(new FlowLayout());  
	        scanItem=new JMenuItem("���");  
	        deleteItem=new JMenuItem("ɾ��");  
	        updateItem=new JMenuItem("�޸�");  
	        insertItem=new JMenuItem("���");  
	        searchItem=new JMenuItem("����");  
	        
	        scanItem1=new JMenuItem("���");  
	        deleteItem1=new JMenuItem("ɾ��");  
	        updateItem1=new JMenuItem("�޸�");  
	        insertItem1=new JMenuItem("���");  
	        searchItem1=new JMenuItem("����");  
//	        ---------------
	        zhuTu=new JMenuItem("������״ͼ��Ϣ");
	        bar=new JMenuBar();  
	        menu=new JMenu("δ�ѧ����Ϣ");     
	        menu1=new JMenu("���ѧ��������Ϣ");
//	        ͼ������
	        menu2=new JMenu("������״ͼ����");
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
	        setTitle("������Ϣ����ϵͳ");  
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
