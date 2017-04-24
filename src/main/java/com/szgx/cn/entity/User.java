package com.szgx.cn.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "t_user")
public class User implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "login_name")
    private String loginName;

    @Column(name = "login_password")
    private String loginPasswd;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "account_status")
    private Integer accountStatus;

    @Column(name = "locked_time")
    private Long lockedTime;

    @Column(name = "login_failed_time")
    private Integer loginFailedTime;

    @Column(name = "unit_id")
    private String unitId;

    @Column(name = "creator_id")
    private String creatorId;

    @OneToMany
    private Set<Role> roles;

    @ManyToOne
    private Organization organization;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Long getLockedTime() {
        return lockedTime;
    }

    public void setLockedTime(Long lockedTime) {
        this.lockedTime = lockedTime;
    }

    public Integer getLoginFailedTime() {
        return loginFailedTime;
    }

    public void setLoginFailedTime(Integer loginFailedTime) {
        this.loginFailedTime = loginFailedTime;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
