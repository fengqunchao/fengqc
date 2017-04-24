package com.szgx.cn.service;

import com.szgx.cn.entity.Permission;
import com.szgx.cn.repositories.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fengqc on 17/4/24.
 */
@Service
public class PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    public List<Permission> findByUserId(String userId) {
        return null;
    }

    public List<Permission> findAll() {
        return this.permissionRepository.findAll();
    }

}
