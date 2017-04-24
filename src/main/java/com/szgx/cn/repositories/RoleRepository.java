package com.szgx.cn.repositories;

import com.szgx.cn.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fengqc on 17/4/24.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}
