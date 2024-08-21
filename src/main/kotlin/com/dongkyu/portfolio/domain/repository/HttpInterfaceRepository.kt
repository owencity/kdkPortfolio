package com.dongkyu.portfolio.domain.repository

import com.dongkyu.portfolio.domain.entity.Achievement
import com.dongkyu.portfolio.domain.entity.Experience
import com.dongkyu.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository:JpaRepository<HttpInterface, Long> {

}