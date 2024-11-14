package com.oneToOne.demoProject.repository;

import com.oneToOne.demoProject.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

