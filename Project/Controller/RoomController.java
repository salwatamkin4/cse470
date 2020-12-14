/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system.Controller;

import hotel.management.system.Model.RoomModel;

import java.sql.ResultSet;

public class RoomController {
    RoomModel r=new RoomModel();
    ResultSet rs;
    public void add(String room, String available, String status, String price, String type) {
        String str = "INSERT INTO room values( '"+room+"', '"+available+"', '"+status+"','"+price+"', '"+type+"')";
        r.addRoom(str);
    }

    public void setAvailable(String a, String s1) {
        String q2 = "update room set available = "+a+ "where room = "+s1;
        r.setAvailability(q2);
    }

    public ResultSet get() {
        String str="select * from room";
        rs=r.getRoom(str);
        return rs;
    }

    public ResultSet getByBed(String bed) {
        String SQL = "select * from Room where type = '"+bed+"'";
        rs=r.getRoom(SQL);
        return rs;
    }

    public ResultSet getByAvailableBed(String bed) {
        String SQL2 = "select * from Room where available = 'Available' AND type = '"+bed+"'";
        rs=r.getRoom(SQL2);
        return rs;
    }

    public void update(String status, String roomNo) {
        String str = "update room set status = '"+status+"' where room = "+roomNo;
        r.updateRoom(str);
    }

 
}
