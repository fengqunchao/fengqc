package com.szgx.cn.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

public class SecurityUser extends User implements UserDetails {
    private static final long serialVersionUID = 1L;

    public SecurityUser(User suser) {
        if (suser != null) {
            this.setId(suser.getId());
            this.setLoginName(suser.getLoginName());
            this.setEmail(suser.getEmail());
            this.setLoginPasswd(suser.getLoginPasswd());
            this.setRoles(suser.getRoles());
        }
    }

    @Override
    public Set<GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        Set<Role> userRoles = this.getRoles();
        if (userRoles != null) {
            for (Role role : userRoles) {
                SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
                authorities.add(authority);
            }
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return super.getLoginPasswd();
    }

    @Override
    public String getUsername() {
        return super.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}