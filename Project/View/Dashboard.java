
package hotel.management.system.View;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8;
    
    Dashboard(){
        mb= new JMenuBar();
        add(mb);
        
        m1= new JMenu ("Hotel Management");
        m1.setForeground(Color.RED);
        mb.add(m1);
        
        m2= new JMenu ("Reception");
        m2.setForeground(Color.BLUE);
        mb.add(m2);
        
        i1= new JMenuItem ("Add Employee");
        i1.addActionListener(this);
        m1.add(i1);
        
        i2= new JMenuItem ("Add Room");
        i2.addActionListener(this);
        m1.add(i2);
        
        i3= new JMenuItem ("New Customer Form");
        i3.addActionListener(this);
        m2.add(i3);
        
        i4= new JMenuItem ("All Employeers Info");
        i4.addActionListener(this);
        m2.add(i4);
        
        i5= new JMenuItem ("Room Info");
        i5.addActionListener(this);
        m2.add(i5);
        
        i6= new JMenuItem ("Customer Info");
        i6.addActionListener(this);
        m2.add(i6);
        
        i7= new JMenuItem ("Check-IN_Details");
        i7.addActionListener(this);
        m2.add(i7);
        
        i8= new JMenuItem ("Check Out");
        i8.addActionListener(this);
        m2.add(i8);
        
        mb.setBounds(0,0,1950,30);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950,1000); 
        add(NewLabel);
        
        JLabel l2 = new JLabel("WELCOME to Hotel TAJ");
	l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 46));
	l2.setBounds(600, 60, 1000, 85);
	NewLabel.add(l2);
        
        setLayout(null);
        setBounds(0,0,1950,1000);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Add Employee")){
            new AddEmployee().setVisible(true);
        }
        else if(ae.getActionCommand().equals("Add Room")){
            new AddRoom().setVisible(true);
        }
        
        else if(ae.getActionCommand().equals("New Customer Form")){
            new NewCustomer().setVisible(true);
        }
        else if(ae.getActionCommand().equals("All Employeers Info")){
            new Employeeinfo().setVisible(true);
        }
        
        else if(ae.getActionCommand().equals("Room Info")){
            new Roominfo().setVisible(true);
        }
        else if(ae.getActionCommand().equals("Customer Info")){
            new Customerinfo().setVisible(true);
        }
        else if(ae.getActionCommand().equals("Check-IN_Details")){
            new Checkin().setVisible(true);
        }
        else if(ae.getActionCommand().equals("Check Out")){
            new Checkout().setVisible(true);
    }
    }
    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
}   
  
    

