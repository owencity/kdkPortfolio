package com.dongkyu.portfolio.domain.repository

import com.dongkyu.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository:JpaRepository<ProjectSkill ,Long> {

}