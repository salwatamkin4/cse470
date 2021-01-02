/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system.Controller;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class EmployeeControllerTest {
     conn c= new conn();
    public EmployeeControllerTest() {
    }
    
    
    /**
     * Test of add method, of class EmployeeController.
     */
    @Test
    public void testAdd() {
        try{
            System.out.println("add");
            String name = "";
            String age = "";
            String gender = "";
            String s6 = "";
            String salary = "";
            String phone = "";
            String email = "";
            EmployeeController instance = new EmployeeController();
            instance.add(name, age, gender, s6, salary, phone, email);
        // TODO review the generated test code and remove the default call to fail.
        }catch(Exception e){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of get method, of class EmployeeController.
     */
    @Test
    public void testGet() {
        try{
            System.out.println("get");
        
        EmployeeController instance = new EmployeeController();
        String sql= "select * from Employee";          
        ResultSet expResult =c.s.executeQuery(sql);
        ResultSet result = instance.get();
        ResultSet temp=instance.get();
        boolean flag=true;
        while(temp.next()){
            if(result.next()==expResult.next()){

            }else{
              flag=false;
            }
        }
        if(flag){
        }else{
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
        }catch(Exception e){
        
        }
       
    }

    /**
     * Test of getSpecific method, of class EmployeeController.
     */
    @Test
    public void testGetSpecific() {
        try{
            System.out.println("getSpecific");
        String a = "";
        EmployeeController instance = new EmployeeController();
        String sql="select * from Employee where job = "+a;
        ResultSet expResult=c.s.executeQuery(sql);
        ResultSet result = instance.getSpecific(a);
        ResultSet temp = instance.getSpecific(a);
     boolean flag=true;
        while(temp.next()){
            if(result.next()==expResult.next()){

            }else{
              flag=false;
            }
        }
        if(flag){
        }else{
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
        }catch(Exception e){
        
        }
    }
}
