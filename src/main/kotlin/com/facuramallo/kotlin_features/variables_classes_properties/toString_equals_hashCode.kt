package com.facuramallo.kotlin_features.variables_classes_properties

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name = $name, postalcode= $postalCode)"

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client) return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int {
        return name.hashCode() * 31 + postalCode
    }
}