package com.facuramallo.kotlin_features.variables_classes_properties

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class class_delegation_test {

    @Test
    fun `Ceo secretary should make a call`() {
        val actual =  Ceo(HumanSecretary()).call()
        val expected = "message"
        assertEquals(expected,actual)
    }

    @Test
    fun `Ceo secretary should add event to agenda`() {
        val actual =  Ceo(HumanSecretary()).addToAgenda("meetUp", "01-01-23")
        val expected = "event meetUp with date 01-01-23"
        assertEquals(expected,actual)
    }
}