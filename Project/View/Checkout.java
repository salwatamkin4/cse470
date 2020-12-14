
package hotel.management.system.View;
import java.awt.*;
import java.awt.Font;
import javax.swing.*;
import java .sql.*;
import java.awt.event.*;



public class Checkout extends JFrame implements ActionListener {
    
    Choice c1;
    JTextField t1;
    JButton b1,b2;
   Checkout(){
       
       JLabel l1=new JLabel("Check Out");
       l1.setFont(new Font("Tahoma",Font.PLAIN,20));
       l1.setForeground(Color.BLUE);
       l1.setBounds(30,20,100,30);
       add(l1);
       
       JLabel l2=new JLabel("ID");
       l2.setFont(new Font("Tahoma",Font.PLAIN,20));
       l2.setForeground(Color.BLUE);
       l2.setBounds(30,80,100,30);
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
       
       JLabel l3=new JLabel("Room No");
       l3.setFont(new Font("Tahoma",Font.PLAIN,20));
       l3.setForeground(Color.BLUE);
       l3.setBounds(30,150,100,30);
       add(l3);
       t1= new JTextField();
       t1.setBounds(200,150,150,25);
       add(t1);
       
       b1=new JButton ("Checkout");
       b1.setBackground(Color.BLACK);
       b1.setForeground(Color.WHITE);
       b1.setBounds(30,200,120,30);
       b1.addActionListener(this);
       add(b1);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/tick.jpg"));
       Image i3 = i1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
       ImageIcon i2 = new ImageIcon(i3);
       b2=new JButton(i2);
       b2.setBounds(410,80,20,20);
       b2.addActionListener(this);
       add(b2);
       
       
       setLayout(null);
       setBounds(500,200,500,300);
       setVisible(true);
   } 
   public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b1){
            String id=c1.getSelectedItem();
            String room=t1.getText();
            String str="Delete from customer where id_passport="+id;
            String str1="Update room set availability='Available' where room_number='"+room+"'";
            conn c=new conn();
            try{
                c.s.executeUpdate(str);
                c.s.executeUpdate(str1);
                JOptionPane.showMessageDialog(null, "Check Out Successful");
                this.setVisible(false);
            }
        catch(Exception e){}
           
        }
        else if (ae.getSource()==b2){
                conn c=new conn();
                String id=c1.getSelectedItem();
                try{
                ResultSet rs=c.s.executeQuery("select * from customer where id_passport='"+id+"'");
                while(rs.next()){
                    t1.setText(rs.getString("room_no"));
                }
                } catch(Exception e){}
        }
   }
       
   public  static void main(String[]args){
       new Checkout().setVisible(true);
   }
}
