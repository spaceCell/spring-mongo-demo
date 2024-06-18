package org.kirill.kozlov.spring_mongo_demo.repository

import org.kirill.kozlov.spring_mongo_demo.entity.Aircraft
import org.springframework.data.repository.CrudRepository

interface AircraftRepository: CrudRepository<Aircraft, String>
