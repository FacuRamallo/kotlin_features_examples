package com.facuramallo.kotlin_features.variables_classes_properties

class Outer {

    inner class Inner { //with reference to outer
        fun getOuterReference()= this@Outer
        fun getInnerReference() = this
    }
    class Nested { // same as static nested class in Java
        fun getOuterReference() = this
    }
}