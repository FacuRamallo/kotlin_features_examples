package com.facuramallo.kotlin_features.variables_classes_properties

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class object_keyword_test {

    @Test
    fun `object SingleInstance reference should be unique`() {
        val object1 = Object("object1")
        val object2 = Object("object2")
        println(object1.singleInstanceReference)
        assertThat(object1.singleInstanceReference == object2.singleInstanceReference)
    }
}