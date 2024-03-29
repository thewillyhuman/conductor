package io.github.thewilly.conductor.server.repositories.experimental

import io.github.thewilly.conductor.server.types.User
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface UsersRepository : MongoRepository<User, ObjectId> {

    fun findByEmail(email: String): User?

}
