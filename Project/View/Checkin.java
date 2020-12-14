
package hotel.management.system.View;
import java.awt.*;
import java.awt.Font;
import javax.swing.*;
import java .sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class Checkin extends JFrame implements ActionListener{
    JButton b1,b2;
    Choice c1;
    JTextField t1,t2,t3,t4,t5;
    Checkin(){
     
        JLabel l1=new JLabel("Check In Details");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setForeground(Color.BLUE);
        l1.setBounds(20,30,200,30);
        add(l1);
        
        JLabel l2=new JLabel("ID");
        l2.setBounds(30,80,100,20);
        add(l2);
        c1= new Choice();
        try{
            conn c=new conn();
            ResultSet rs= c.s.executeQuery("select * from  customer ");
            while(rs.next()){
                c1.add(rs.getString("id_passport"));
            }
        }catch(Exception e){}
            c1.setBounds(200,80,150,25);
            add(c1);
            
      
        
         JLabel l3=new JLabel("NAME");
        l3.setBounds(30,120,100,20);
        add(l3);
        
        t1= new JTextField();
        t1.setBounds(200,120,150,25);
        add(t1);
        
        
        /*t2= new JTextField();
        t2.setBounds(200,120,150,25);
        add(t2);*/
        
         JLabel l4=new JLabel("GENDER");
        l4.setBounds(30,160,100,20);
        add(l4);
        
        t3= new JTextField();
        t3.setBounds(200,160,150,25);
        add(t3);
        
         JLabel l5=new JLabel("ROOM NO");
        l5.setBounds(30,200,100,20);
        add(l5);
        
        t4= new JTextField();
        t4.setBounds(200,200,150,25);
        add(t4);
        
        JLabel l6=new JLabel("PHONE");
        l6.setBounds(30,240,100,20);
        add(l6);
        
        t5= new JTextField();
        t5.setBounds(200,240,150,25);
        add(t5);
        
        b1=new JButton ("Check");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(30,340,100,30);
        b1.addActionListener(this);
        add(b1);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/eleventh.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel image = new JLabel(i2);
        image.setBounds(400,25,500,450);
        add(image);
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(300,100,1000,500);
        setVisible(true);

    
    }
     public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b1){
            try{
                conn c=new conn();
                String id=c1.getSelectedItem();
                String str="select * from customer where id_passport='"+id+"'";
                ResultSet rs=c.s.executeQuery(str);
                
                while(rs.next()){
                    t1.setText(rs.getString("name"));
                    t3.setText(rs.getString("gender"));
                    t4.setText(rs.getString("room_no"));
                    t5.setText(rs.getString("phone"));
                    
                }
                
            }
            catch(Exception e){
                
            }
        }
        else if(ae.getSource()==b2){
            this.setVisible(false);
        }
     }
    public static void main (String[]args){
        new Checkin().setVisible(true);
    }
}
