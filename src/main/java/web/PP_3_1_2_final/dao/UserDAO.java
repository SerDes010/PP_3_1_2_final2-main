package web.PP_3_1_2_final.dao;


import web.PP_3_1_2_final.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers ();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
}