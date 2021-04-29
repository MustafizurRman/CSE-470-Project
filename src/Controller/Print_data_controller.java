/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.ResultSet;
import Model.Print_data_model;

public class Print_data_controller {
    public static ResultSet print_data_controller (String e_id) {
        ResultSet rs = Print_data_model.print_data_model(e_id);
        return rs;

    }
}
