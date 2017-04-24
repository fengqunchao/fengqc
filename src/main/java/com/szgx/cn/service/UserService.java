package com.szgx.cn.service;

import com.szgx.cn.entity.User;
import com.szgx.cn.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fengqc on 17/4/24.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User findUserById(String id) {
        return userRepository.findOne(id);
    }

    public User login(String loginName, String loginPasswd) {
        return userRepository.findByLoginNameAndLoginPasswd(loginName, loginPasswd);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.delete(id);
    }

    public User findUserByLoginName(String loginName) {
        return userRepository.findUserByLoginName(loginName);
    }

}
