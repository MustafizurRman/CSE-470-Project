/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.loginModel;

public class loginController {
        public static boolean isValidLogin(String username, String password){
            loginModel loginmodel = new loginModel(username, password);
            return loginmodel.isValidUser();
        }
    }

