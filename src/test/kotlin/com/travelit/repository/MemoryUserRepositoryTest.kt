package com.travelit.repository

import com.travelit.domain.User
import org.junit.jupiter.api.Test

fun main() {

}

class MemoryUserRepositoryTest {

    private val repo = MemoryUserRepository()

    @Test
    private fun join() {
        repo.save(User(1, "test1", "1234", "홍길동"))
    }

    @Test
    private fun findByUID() {
        val user = repo.findByUID(1)
        println(user)
    }

}