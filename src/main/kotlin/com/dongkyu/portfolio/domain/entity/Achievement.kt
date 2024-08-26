package com.dongkyu.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class Achievement(
    title: String,
    description: String,
    achivedDate: LocalDate?,
    host: String,
    isActive: Boolean
): BaseEntity() {


//   ID를 적어야 PK가 있어 인식
    // IDENTITY -> DB에 ID만드는것을 전가(MYSQL)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    var id: Long? = null
    // 자료형에 ?붙이면 null을 허용한다.

    var title: String = title
    var description: String = title
    var achievedDate: LocalDate? = achivedDate
    var host: String = host
    var isActive: Boolean = isActive
}