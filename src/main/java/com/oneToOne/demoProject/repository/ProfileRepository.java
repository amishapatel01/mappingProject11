package com.oneToOne.demoProject.repository;

import com.oneToOne.demoProject.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {
}
