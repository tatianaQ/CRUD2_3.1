package org.example.CRUD.service;

import org.example.CRUD.models.User;
import java.util.List;

public interface UserService {

    List<User> index();

    User show(long id);

    void save(User user);

    void update(User personUpdated);

    void delete(long id);
}