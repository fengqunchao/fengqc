package com.szgx.cn.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Map;


@Entity
@Table(name = "t_orgnization")
public class Organization implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "parent_id")
    private String parentId;

    @Column(name = "creator")
    private String creator;

    @Column(name = "create_time")
    private Long createTime;
    
    @Column(name = "id_path")
    private String idPath;

    public Organization(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getIdPath() {
		return idPath;
	}

	public void setIdPath(String idPath) {
		this.idPath = idPath;
	}
    
}