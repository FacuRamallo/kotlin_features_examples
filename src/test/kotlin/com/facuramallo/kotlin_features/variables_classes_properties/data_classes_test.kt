package com.facuramallo.kotlin_features.variables_classes_properties

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class data_classes_test {

    @Test
    fun `should compare Persons ignoring properties outside of primary constructor`() {
        val person1 = Person("name1","surname1")
        val person2 = Person("name1","surname1")
        val person3 = PersonWithSorprice("name1","surname1")
        val person4 = PersonWithSorprice("name1","surname1").apply { counter = 2 }

        assertThat(person1 == person2)
        assertThat(person3 == person4)
    }

    @Test
    fun `copyed objects without changed vals should be structurally equals not referencially equals`() {
        val person1 = Person("name1","surname1")
        val copyOfPerson1 = person1.copy()

        assertThat(person1 == copyOfPerson1)  //structure equality
        assertThat(person1 !== copyOfPerson1) //referential equality
    }

    @Test
    fun `copyed objects with changed vals shouldn't be either structurally equals nor referencially equals`() {
        val person1 = Person("name1","surname1")
        val copyOfPerson1 = person1.copy("name2","surname2")

        assertThat(person1 != copyOfPerson1) //structure equality
        assertThat(person1 !== copyOfPerson1) //referential equality
    }
}