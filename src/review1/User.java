/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

/**
 *
 * @author ADMIN
 */
public class User {

    private int idUser;

    private String name;
    private String password;

    public User(int idUser, String name, String password) {
        this.idUser = idUser;
        this.name = name;
        this.password = password;
    }

    User() {

    }

    public int getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
