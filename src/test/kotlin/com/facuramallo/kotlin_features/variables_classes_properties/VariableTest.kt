package com.facuramallo.kotlin_features.variables_classes_properties

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class VariableTest {

    private val variables = Variable(1,"A")

    @Test
    fun getInmutableVariable() {
        val sut = variables.inmutableVariable
        val expectedValue = 1
        assertThat(sut == expectedValue)
    }

    @Test
    fun getMutableVariable() {
        val sut = variables.mutableVariable
        val expectedValue = "A"
        assertThat(sut == expectedValue)
    }

    @Test
    fun setMutableVariable() {
        val sut = variables.apply { mutableVariable = "B" }.mutableVariable
        val expectedValue = "B"
        assertThat(sut == expectedValue)
    }

    @Test
    fun get_propertie_with_custom_getter() {
        val sut = variables.customGetSet
        assertFalse(sut.isNullOrBlank())
        assertThat(sut == "i don´t have a backing field")
    }

    @Test
    fun get_lateInit_var() {
        assertThrows < UninitializedPropertyAccessException > { variables.backingField }

        variables.backingField = "backing field initialized"

        assertThat(variables.backingField == "backing field initialized")
    }
}