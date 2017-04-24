package com.szgx.cn.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "t_role")
public class Role implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "description")
    private String description;

    @Column(name = "parent_id")
    private String parentId;

    @Column(name = "creator_id")
    private String creatorId;

    @Column(name = "create_time")
    private long createTime;

    private User user;

    public Role() {
    }

    public Role(String roleName, String description, String parentId, String creatorId, long createTime, User user) {
        this.roleName = roleName;
        this.description = description;
        this.parentId = parentId;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}