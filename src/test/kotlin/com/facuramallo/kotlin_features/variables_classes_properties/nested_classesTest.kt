package com.facuramallo.kotlin_features.variables_classes_properties

import com.facuramallo.kotlin_features.variables_classes_properties.Outer.Inner
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class nested_classesTest{

    val outer = Outer()
    val inner = outer.Inner()

    @Test
    fun `should return outer class reference`() {
        assertTrue(inner.getOuterReference() == outer)
    }
}