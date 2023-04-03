package com.facuramallo.kotlin_features.variables_classes_properties

interface UserWithProperty {
    val nickname: String
}
//The classes that implement the UserWithPropertie interface must provide an implementation por nickname

class PrivateUser(override val nickname: String) : UserWithProperty{
    var address: String = "unespecifide"
        set(value: String) {
            println("""
                Address was changed for $value:
                "$field" -> "$value"
            """.trimIndent())
            field = value
        }

} //primary contructor property

class SubcribingUser(val email: String ) : UserWithProperty {
    override val nickname: String
        get() = email.substringBefore('@') // custom getter
}

class FacebookUser ( val accountId: Int ) : UserWithProperty {
    override val nickname: String = getFacebookName(accountId) // property initializer

    private fun getFacebookName(accountId: Int): String {
        TODO("Not yet implemented")
    }
}

