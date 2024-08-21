package com.dongkyu.portfolio.domain.repository

import com.dongkyu.portfolio.domain.entity.Achievement
import com.dongkyu.portfolio.domain.entity.Experience
import com.dongkyu.portfolio.domain.entity.HttpInterface
import com.dongkyu.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository:JpaRepository<Introduction, Long> {

}