/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Remove_employee_model;

import java.sql.ResultSet;

public class Remove_employee_controller {

    public static ResultSet searchController (String e_id) {
        ResultSet rs = Remove_employee_model.remove_employee_search(e_id);
        return rs;

    }

    public static ResultSet removeController (String e_id) {
        ResultSet rs = Remove_employee_model.remove_employee(e_id);
        return rs;

    }


}
