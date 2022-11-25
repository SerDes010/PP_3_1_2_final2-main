package web.PP_3_1_2_final.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.PP_3_1_2_final.dao.UserDAO;
import web.PP_3_1_2_final.model.User;


import javax.validation.Valid;
import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;


    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }


    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }
    @Transactional
    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }
    @Transactional
    @Override
    public void removeUser(long id) {
        userDAO.removeUser(id);
    }
    @Transactional
    @Override
    public void updateUser(@Valid User user) {
        userDAO.updateUser(user);
    }
}