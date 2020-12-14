
package hotel.management.system.View;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;

public class Roominfo extends JFrame implements ActionListener {
    JTable t1;
    JButton b1,b2;
      public Roominfo(){
          
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/eight.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel image = new JLabel(i2);
        image.setBounds(440,10,650,500);
            add(image);
        t1=new JTable();
        t1.setBounds(0,40,500,400);
        add(t1);
        
        JLabel l1=new JLabel ("Room N0");
        l1.setBounds(20,10,70,20);
        add(l1);
        
        JLabel l2=new JLabel ("Status");
        l2.setBounds(130,10,70,20);
        add(l2);
        
        JLabel l3=new JLabel ("Cln/drt");
        l3.setBounds(230,10,70,20);
        add(l3);
        
        JLabel l4=new JLabel ("Price");
        l4.setBounds(330,10,70,20);
        add(l4);
        
        JLabel l5=new JLabel ("Bed Type");
        l5.setBounds(420,10,70,20);
        add(l5);
        
        
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
        setBounds(350,100,1000,650);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b1){
            try{
                conn c=new conn();
                String str="select * from room";
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
        new Roominfo().setVisible(true);
    }
    
}
