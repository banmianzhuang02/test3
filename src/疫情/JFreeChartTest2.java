package ����;
import java.awt.Font;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class JFreeChartTest2 extends ApplicationFrame
{
    public JFreeChartTest2(String title,int num1,int num2,int num3,int num4,int num5)
    {
        super(title);
        this.setContentPane(createPanel(num1,num2,num3,num4,num5)); //���캯�����Զ�����Java��panel���
    }
    
    public static CategoryDataset createDataset(int num1,int num2,int num3,int num4,int num5) {//������״ͼ���ݼ�
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        dataset.setValue(num1,"���нӴ�","���нӴ�");
        dataset.setValue(num2,"���人","���人");
        dataset.setValue(num3,"�ں���","�ں���");
        dataset.setValue(num4,"����","����");
        dataset.setValue(num5,"ȷ��","ȷ��");
        
        return dataset;
    }
    
    public static JFreeChart createChart(CategoryDataset dataset) //�����ݼ�����һ��ͼ��
    {
        JFreeChart chart=ChartFactory.createBarChart("hi", "��Ա�ֲ�", 
                "��Ա����", dataset, PlotOrientation.VERTICAL, true, true, false); //����һ��JFreeChart
        chart.setTitle(new TextTitle("����״��",new Font("����",Font.BOLD+Font.ITALIC,20)));//�����������ñ��⣬�滻��hi������
        CategoryPlot plot=(CategoryPlot)chart.getPlot();//���ͼ���м䲿�֣���plot
        CategoryAxis categoryAxis=plot.getDomainAxis();//��ú�����
        categoryAxis.setLabelFont(new Font("΢���ź�",Font.BOLD,12));//���ú���������
        return chart;
    }
    
    public static JPanel createPanel(int num1,int num2,int num3,int num4,int num5)
    {
        JFreeChart chart =createChart(createDataset(num1,num2,num3,num4,num5));
        return new ChartPanel(chart); //��chart�������Panel�����ȥ��ChartPanel���Ѽ̳�Jpanel
    }
    
    public static void picture(int num1,int num2,int num3,int num4,int num5)
    {
        JFreeChartTest2 chart=new JFreeChartTest2("������״ͼ",num1,num2,num3,num4,num5);
        chart.pack();//�Ժ��ʵĴ�С��ʾ
        chart.setVisible(true);
        
    }
}