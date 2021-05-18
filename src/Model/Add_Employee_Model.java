/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.conn;

public class Add_Employee_Model {

    public static int add_employee (String a,String bb,String c,String d,String e,String ff,String g,String h,String i,String j,String k){
        try{
            Controller.conn cc = new conn();
            String q = "insert into employee values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
            cc.s.executeUpdate(q);
            return 1;

        }

        catch (Exception ee) {
            ee.printStackTrace();
        }
        return 0;


    }
}