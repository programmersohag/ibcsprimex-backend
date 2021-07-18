package com.example.ibcsprimex.repository;

import com.example.ibcsprimex.model.Role;
import com.example.ibcsprimex.model.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleType(RoleType roleType);
}
