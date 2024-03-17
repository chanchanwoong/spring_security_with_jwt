package com.chanwoong.springsecurywithjwt.repository;

import com.chanwoong.springsecurywithjwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Boolean existsByUsername(String username);
}
