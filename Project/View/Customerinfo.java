
package hotel.management.system.View;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;

public class Customerinfo  extends JFrame implements ActionListener {
    JTable t1;
    JButton b1,b2;
      public Customerinfo(){
          
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/second.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel image = new JLabel(i2);
        image.setBounds(440,10,850,500);
        add(image);
        
        t1=new JTable();
        t1.setBounds(0,40,600,400);
        add(t1);
        
        JLabel l1=new JLabel ("Name");
        l1.setBounds(20,10,70,20);
        add(l1);
        
        JLabel l2=new JLabel ("ID");
        l2.setBounds(100,10,70,20);
        add(l2);
        
        JLabel l3=new JLabel ("G.Type");
        l3.setBounds(180,10,70,20);
        add(l3);
        
        JLabel l4=new JLabel ("Gender");
        l4.setBounds(270,10,70,20);
        add(l4);
        
        JLabel l5=new JLabel ("Phone");
        l5.setBounds(350,10,70,20);
        add(l5);
        
        JLabel l6=new JLabel ("Email");
        l6.setBounds(440,10,70,20);
        add(l6);
        
        JLabel l7=new JLabel ("Room No");
        l7.setBounds(540,10,70,20);
        add(l7);
        
        
        b1=new JButton ("LOAD DATA");
        b1.setBounds(100,460,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton ("BACK");
        b2.setBounds(250,460,120,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(180,100,1200,650);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b1){
            try{
                conn c=new conn();
                String str="select * from customer";
                ResultSet rs=c.s.executeQuery(str);
                
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                
            }
            catch(Exception e){
                
            }
        }
        else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }
    
    
    public static void main (String[]args){
        new Customerinfo().setVisible(true);
    }
    
}

