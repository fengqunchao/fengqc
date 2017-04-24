package com.szgx.cn.repositories;

import com.szgx.cn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by fengqc on 17/4/24.
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query("select u from User u where u.email = ?1 and u.loginPasswd = ?2")
    User login(String loginName, String loginPasswd);

    User findByLoginNameAndLoginPasswd(String loginName, String loginPasswd);

    User findUserByLoginName(String loginName);
}
