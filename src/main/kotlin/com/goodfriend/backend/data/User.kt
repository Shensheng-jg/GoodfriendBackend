package com.goodfriend.backend.data

import jakarta.persistence.*
import jakarta.validation.constraints.*
import java.time.LocalDateTime

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(unique = true, nullable = false)
    @field:NotBlank(message = "手机号不能为空")
    @field:Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    val phone: String,

    @field:NotBlank(message = "密码不能为空")
    var password: String,

    @field:NotBlank(message = "姓名不能为空")
    var name: String,

    @field:Min(value = 1, message = "年龄必须大于0")
    @field:Max(value = 150, message = "年龄不能超过150")
    var age: Int,

    @Enumerated(EnumType.STRING)
    var gender: Gender,

    @field:NotBlank(message = "地域不能为空")
    var region: String,

    @Column(name = "avatar_url")
    var avatarUrl: String? = null,  // 新增头像URL

    @Column(name = "created_at", updatable = false)
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    var updatedAt: LocalDateTime = LocalDateTime.now()
)

@Entity
@Table(name = "consultants")
data class Consultant(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(unique = true, nullable = false)
    @field:NotBlank(message = "手机号不能为空")
    @field:Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    val phone: String,

    @field:NotBlank(message = "密码不能为空")
    var password: String,

    @field:NotBlank(message = "姓名不能为空")
    var name: String,

    @field:Min(value = 1, message = "年龄必须大于0")
    @field:Max(value = 150, message = "年龄不能超过150")
    var age: Int,

    @Enumerated(EnumType.STRING)
    var gender: Gender,

    @field:NotBlank(message = "资历不能为空")
    var qualifications: String,  // 新增资历

    @Column(name = "available_time")
    var availableTime: String,  // 新增可预约时间

    @field:NotBlank(message = "领域不能为空")
    var field: String,  // 新增领域

    @Column(name = "avatar_url")
    var avatarUrl: String? = null,  // 头像URL

    @Column(name = "created_at", updatable = false)
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    var updatedAt: LocalDateTime = LocalDateTime.now()
)

@Entity
@Table(name = "admins")
data class Admin(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @field:NotBlank(message = "密码不能为空")
    var password: String,

    @Column(name = "created_at", updatable = false)
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    var updatedAt: LocalDateTime = LocalDateTime.now()
)


enum class Gender {
    MALE, FEMALE, UNKNOWN
}