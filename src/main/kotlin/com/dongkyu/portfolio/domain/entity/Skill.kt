package com.dongkyu.portfolio.domain.entity

import com.dongkyu.portfolio.domain.constant.SkillType
import jakarta.persistence.*

@Entity
class Skill(
    name: String,
    type: String,
    isActive: Boolean
): BaseEntity() {


//   ID를 적어야 PK가 있어 인식
    // IDENTITY -> DB에 ID만드는것을 전가(MYSQL)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_detail_id")
    var id: Long? = null
    // 자료형에 ?붙이면 null을 허용한다.
    var name: String = name


    // type-> DB예약어 조심.
    // 다른DB전환 가능성 염두해두고 예악어 컬럼명 피해준다.
    @Column(name = "skill_type")
    @Enumerated(EnumType.STRING)
    var type: SkillType = SkillType.valueOf(type)
    //is_Actice 로 JPA가 자동으로 매핑.
    var isActive: Boolean = isActive
}