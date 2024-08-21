package com.dongkyu.portfolio.domain.repository

import com.dongkyu.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository:JpaRepository<Achievement, Long> {

}