package com.facuramallo.kotlin_features.variables_classes_properties

/*public by default*/
class Variable(val inmutableVariable: Any, var mutableVariable: Any) {
    val customGetSet: String
        get() = "i don´t have a backing field"

    var counter = 0 // the initializer assigns the backing field directly
        get() = field
        set(value) {
            if (value >= 0) field = value // backing field can be referenced in the accessors using the field identifier
        }

    lateinit var backingField : String
}