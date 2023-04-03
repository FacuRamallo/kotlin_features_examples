package com.facuramallo.kotlin_features.variables_classes_properties

data class Person(val name: String, val surname: String)

data class PersonWithSorprice(val name: String, val surname: String) {
    var counter : Int = 0
        set(value) {
            field = counter + value
        }
}