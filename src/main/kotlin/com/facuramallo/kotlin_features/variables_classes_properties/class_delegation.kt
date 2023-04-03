package com.facuramallo.kotlin_features.variables_classes_properties

import java.util.Date


interface CommonTasks {
    fun call() : String
    fun addToAgenda(event: String, date: String) : String
}

class HumanSecretary() : CommonTasks {
    override fun call() = "message"

    override fun addToAgenda(event: String, date: String) = "event $event with date $date"
}


class Ceo (private val secretary: HumanSecretary) : CommonTasks by secretary //no need to implement the interface CommonTask methods