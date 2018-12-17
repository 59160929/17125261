/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class RegisterService {

    private static UserDao userADo;

    public void insertUser(User user) {
        userADo = new UserDaoImpl();
        userADo.insert(user);
    }

    public static boolean checkUsernameExist(String username) {
        boolean usernameExists = false;
        userADo = new UserDaoImpl();
        ArrayList<User> listUser = getUser();
        for (int i = 0; i < listUser.size(); i++) {

            if (username.equals(listUser.get(i).getName())) {
                usernameExists = true;
            }

        }
        return usernameExists;
    }

    public boolean checkPasswordIsMatch(String password, String Repassword) {
        if (password.equals(Repassword)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkFieldNull(String text) {
        if (text.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static ArrayList<User> getUser() {
        userADo = new UserDaoImpl();
        return userADo.getAll();
    }

}
