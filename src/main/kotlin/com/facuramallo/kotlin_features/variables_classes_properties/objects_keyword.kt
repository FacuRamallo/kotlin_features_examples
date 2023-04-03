package com.facuramallo.kotlin_features.variables_classes_properties


class Object(val name: String){
    val singleInstanceReference = SingleInstance.reference
    object SingleInstance {
        val reference = this.toString()
    }
}
