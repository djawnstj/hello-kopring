package com.travelit.repository

import com.travelit.domain.User

interface UserRepository {
    fun save(user: User)
    fun findByUID(uid: Int): User?
    fun findById(userId: String): User?
    fun findAll(): List<User>
}