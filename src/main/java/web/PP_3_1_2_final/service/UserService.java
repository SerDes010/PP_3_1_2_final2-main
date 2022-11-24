package web.PP_3_1_2_final.service;


import web.PP_3_1_2_final.model.User;

import javax.validation.Valid;
import java.util.List;


public interface UserService {

    List<User> getAllUsers ();
    Object getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(@Valid User user);
}