package com.dongkyu.portfolio.domain.repository

import com.dongkyu.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository:JpaRepository<Skill ,Long> {

}