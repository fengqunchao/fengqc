package com.szgx.cn;

import com.szgx.cn.entity.Permission;
import com.szgx.cn.entity.User;
import com.szgx.cn.entity.SecurityUser;
import com.szgx.cn.service.PermissionService;
import com.szgx.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by fengqc on 17/4/24.
 */
@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
        User user = userService.findUserByLoginName(loginName);
        if (user == null) {
            throw new NullPointerException("Illegal user information to logon, please check it");
        }

        List<Permission> permissions = permissionService.findByUserId(user.getId());
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();

        for (Permission p : permissions) {
            if (p != null && p.getName() != null) {
                GrantedAuthority g = new SimpleGrantedAuthority(p.getName());
                authorities.add(g);
            }
        }

        SecurityUser securityUser = new SecurityUser(user);
        return securityUser;
    }
}
