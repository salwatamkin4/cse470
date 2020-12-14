
package hotel.management.system.View;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;

public class Employeeinfo extends JFrame implements ActionListener {
      JTable t1;
      JButton b1,b2;
    Employeeinfo(){
        t1=new JTable();
        t1.setBounds(0,40,1000,500);
        add(t1);
        
        JLabel l1=new JLabel ("NAME");
        l1.setBounds(60,10,70,20);
        add(l1);
        
        JLabel l2=new JLabel ("AGE");
        l2.setBounds(190,10,70,20);
        add(l2);
        
        JLabel l3=new JLabel ("GENDER");
        l3.setBounds(330,10,70,20);
        add(l3);
        
        JLabel l4=new JLabel ("JOB");
        l4.setBounds(490,10,70,20);
        add(l4);
        
        JLabel l5=new JLabel ("SALARY");
        l5.setBounds(620,10,70,20);
        add(l5);
        
        JLabel l6=new JLabel ("PHONE");
        l6.setBounds(770,10,70,20);
        add(l6);
        
        JLabel l7=new JLabel ("EMAIL");
        l7.setBounds(900,10,70,20);
        add(l7);
        
        b1=new JButton ("LOAD DATA");
        b1.setBounds(350,560,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton ("BACK");
        b2.setBounds(530,560,120,30);
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
                String str="select * from employee";
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
        new Employeeinfo().setVisible(true);
    }
}

 
