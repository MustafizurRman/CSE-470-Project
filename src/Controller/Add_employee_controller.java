/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Add_Employee_Model;

/**
 *
 * @author User
 */
public class Add_employee_controller {
    public static boolean addController (String a,String bb,String c,String d,String e,String ff,String g,String h,String i,String j,String k) {
        boolean rs = Add_Employee_Model.add_employee(a,bb,c,d,e,ff,g,h,i,j,k);
        return rs;

    }
}
