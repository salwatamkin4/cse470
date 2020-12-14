
package hotel.management.system.View;
import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class NewCustomer extends JFrame implements ActionListener{
    JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5;
        JComboBox c1;
        JRadioButton r1,r2;
        
        public NewCustomer(){
            getContentPane().setForeground(Color.BLACK);
            getContentPane().setBackground(Color.WHITE);
            setTitle("New Customer Form");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
            
            JLabel Passportno = new JLabel("NAME");
            Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Passportno.setBounds(60, 30, 150, 27);
            add(Passportno);
            
            textField = new JTextField();
            textField.setBounds(200, 30, 150, 27);
            add(textField);
			
            JButton Next = new JButton("SAVE");
            Next.setBounds(200, 420, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            Next.addActionListener(this);
            add(Next);
            
            JLabel Pnrno = new JLabel("ID/PASSPORT");
            Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Pnrno.setBounds(60, 80, 150, 27);
            add(Pnrno);
			
            textField_1 = new JTextField();
            textField_1.setBounds(200, 80, 150, 27);
            add(textField_1);
            
            JLabel Gender = new JLabel("GENDER");
            Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Gender.setBounds(60, 170, 150, 27);
            add(Gender);
		
            r1 = new JRadioButton("MALE");
            r1.setBackground(Color.WHITE);
            r1.setBounds(200, 170, 70, 27);
            add(r1);
	
            r2 = new JRadioButton("FEMALE");
            r2.setBackground(Color.WHITE);
            r2.setBounds(280, 170, 70, 27);
            add(r2);
            
            
            JLabel Address = new JLabel("GUEST TYPE");
            Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Address.setBounds(60, 120, 150, 27);
            add(Address);
            
            String course[] = {"LOCAL","INTERNATIONAL"};
            c1 = new JComboBox(course);
            c1.setBackground(Color.WHITE);
            c1.setBounds(200,120,150,30);
            add(c1);
            
            JLabel Nationality = new JLabel("PHONE");
            Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Nationality.setBounds(60, 220, 150, 27);
            add(Nationality);
			
            textField_3 = new JTextField();
            textField_3.setBounds(200, 220, 150, 27);
            add(textField_3);
            
            JLabel Name = new JLabel("EMAIL");
            Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Name.setBounds(60, 270, 150, 27);
            add(Name);
	
            textField_4 = new JTextField();
            textField_4.setBounds(200, 270, 150, 27);
            add(textField_4);
	
            JLabel Phno = new JLabel("ROOM NO");
            Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Phno.setBounds(60, 320, 150, 27);
            add(Phno);
			
            textField_5 = new JTextField();
            textField_5.setBounds(200, 320, 150, 27);
            add(textField_5);
	
            setVisible(true);
            JLabel AddPassengers = new JLabel("New Customer Form");
            AddPassengers.setForeground(Color.BLACK);
            AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 35));
            AddPassengers.setBounds(450, 24, 442, 35);
            add(AddPassengers);
			
     
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fifth.jpg"));
            Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
            ImageIcon i2 = new ImageIcon(i3);
            JLabel image = new JLabel(i2);
            image.setBounds(480,60,300,500);
            add(image);
            
            setSize(900,600);
            setVisible(true);
            setLocation(330,200);
        }
        public void actionPerformed(ActionEvent ae){
                    String name = textField.getText();
                    String id_passport = textField_1.getText();
                    String phone = textField_3.getText();
                    String email = textField_4.getText();
                    String roomno = textField_5.getText();
                  
                   
                    String gender = null;
                    
                    if(r1.isSelected()){
                        gender = "male";
                    
                    }else if(r2.isSelected()){
                        gender = "female";
                    }
                    String s7 = (String)c1.getSelectedItem();
                     try {
                        conn c = new conn();
                        String st = "INSERT INTO customer values( '"+name+"', '"+id_passport+"', '"+s7+"','"+gender+"', '"+phone+"', '"+email+"', '"+roomno+"')";
                        
                        c.s.executeUpdate(st);
                        JOptionPane.showMessageDialog(null,"Customer Added");
                        setVisible(false);
                    
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        
       public static void main(String[] args){
        new NewCustomer();
    }  
        
        
}