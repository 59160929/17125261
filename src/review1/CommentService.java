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
public class CommentService {

    private static CommentDao commentDao;
    private static UserDao userDao;

    public static ArrayList<Comment> getComment() {
        commentDao = new CommentDaoImpl();

        return commentDao.getAll();
    }

//    public static String getUserById(int idUser) throws SQLException {
//
//        String keepIDUser = "" + idUser;
//        String name;
//        name = userADo.getById(keepIDUser);
//        return name;
//
//    }
    public static String getUserName(int idUser) {
        userDao = new UserDaoImpl();
        ArrayList<User> listUser = userDao.getAll();

        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getIdUser() == idUser) {
                return listUser.get(i).getName();
            }
        }
        return "";
    }

    public void addComment(Comment comment) {
        commentDao = new CommentDaoImpl();
        commentDao.insert(comment);
    }

    public void updateComment(Comment comment, int idcomment) {
        commentDao = new CommentDaoImpl();
        commentDao.update(comment, idcomment);
    }

    public void deleteComment(int idcomment) {
        commentDao = new CommentDaoImpl();
        commentDao.delete(idcomment);

    }

    public boolean checkFieldCommentNull(String text) {
        if (text.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean checkIdUserMatchWithRow(String User, int idUser) {
        if (User.equals(getUserName(idUser))) {
            return true;
        } else {
            return false;
        }
    }

}
