/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system.Model;

import hotel.management.system.Controller.conn;

import java.sql.ResultSet;

public class EmployeeModel {
    conn c = new conn();
    ResultSet rs;
    public void addEmployee(String str) {
        try{
            c.s.executeUpdate(str);
        }catch (Exception e){

        }
    }

    public ResultSet getEmployee(String sql) {
        try{
            rs=	c.s.executeQuery(sql);
            return rs;
        }catch (Exception e){

        }
        return rs;
    }
}
