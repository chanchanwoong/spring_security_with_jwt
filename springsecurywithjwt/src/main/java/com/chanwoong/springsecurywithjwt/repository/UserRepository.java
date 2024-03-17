package com.chanwoong.springsecurywithjwt.repository;

import com.chanwoong.springsecurywithjwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Boolean existsByUsername(String username);

    // 로그인 필터에서 사용되는 회원검증
    UserEntity findByUsername(String username);
}
