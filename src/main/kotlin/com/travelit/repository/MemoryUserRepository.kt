package com.travelit.repository

import com.travelit.domain.User
import java.util.concurrent.ConcurrentHashMap

class MemoryUserRepository: UserRepository {

    val store = ConcurrentHashMap<Int, User>()

    override fun save(user: User) {
        user.uid = store.size
        store[user.uid] = user
    }

    override fun findByUID(uid: Int): User? = store[uid]

    override fun findById(userId: String): User? = store.filter { user -> user.value.userId == userId }[0]

    override fun findAll(): List<User> = store.values.toList()

}