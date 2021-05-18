package Model;

import Controller.conn;
import java.sql.*;

public class Print_data_model {

    public static ResultSet print_data_model (String e_id) {

        try {
            conn con = new conn();//SELECT * FROM `employee` WHERE `emp_id`=012
            String str = "SELECT * FROM employee Where emp_id = " + e_id + "";
            ResultSet rs = con.s.executeQuery(str);
            return rs;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
