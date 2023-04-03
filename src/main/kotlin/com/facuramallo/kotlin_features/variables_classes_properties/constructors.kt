package com.facuramallo.kotlin_features.variables_classes_properties

open class User(val nickname: String)

class UserWithConstructorAndInit constructor(nickname: String) {
    val nickname: String

    init {
        this.nickname = nickname
    }
}

class UserWithConstructor constructor(_nickname: String) {
    val nickname = _nickname
}

/*clas User, UserWithConstructor and UserWithConstructorAndInit are exactly the same. PRIMARY CONSTRUCTOR*/

class TwitterUser(nickname: String) : User(nickname) //subclasses need to initialize the superclass

open class View { //class without Primary contructor
    constructor(ctx: String) {
        TODO()
    }
    constructor(ctx: String, attr: Int) {
        TODO()
    }
}

class MyButton: View { //class inherit from View has to call the constructor of the superclass
    constructor(ctx: String) : super(ctx) {
        TODO()
    }
    constructor(ctx: String, attr: Int) : super(ctx,attr) {
        TODO()
    }
}

class MyMenu: View {
    constructor(ctx: String) : this(ctx, 4) { // delegates to another constructor of the same class
        TODO()
    }
    constructor(ctx: String, attr: Int) : super(ctx,attr) {
        TODO()
    }
}

