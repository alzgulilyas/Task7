package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void save(User user);

    void delete(int id);

    User showUserById(int id);

    void update(int id, User updatedUser);
}
