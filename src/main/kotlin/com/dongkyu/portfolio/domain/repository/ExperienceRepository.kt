package com.dongkyu.portfolio.domain.repository

import com.dongkyu.portfolio.domain.entity.Achievement
import com.dongkyu.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository:JpaRepository<Experience, Long> {

}