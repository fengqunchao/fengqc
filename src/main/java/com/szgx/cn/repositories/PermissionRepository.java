package com.szgx.cn.repositories;

import com.szgx.cn.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by fengqc on 17/4/24.
 */
public interface PermissionRepository extends JpaRepository<Permission, String> {
    public List<Permission> findAll();

    public List<Permission> findById(String id);
}
