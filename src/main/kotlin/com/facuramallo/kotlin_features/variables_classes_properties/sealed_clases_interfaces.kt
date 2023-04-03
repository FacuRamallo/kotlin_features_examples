package com.facuramallo.kotlin_features.variables_classes_properties


interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval (e: Expr) : Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknown expression") //need of providing al else branch
    }

sealed class SealedExpr{
    class Num(val value: Int) : SealedExpr()
    class Sum(val left: Expr, val right: Expr) : SealedExpr()
}

fun eval (e: SealedExpr) : Int =
    when (e) {
        is SealedExpr.Num -> e.value
        is SealedExpr.Sum -> eval(e.right) + eval(e.left) //NO need of providing al else branch
    }

sealed interface SealedIExpr {
    class Num(val value: Int) : SealedIExpr
    class Sum(val left: Expr, val right: Expr) : SealedIExpr
}

fun eval (e: SealedIExpr) : Int =
    when (e) {
        is SealedIExpr.Num -> e.value
        is SealedIExpr.Sum -> eval(e.right) + eval(e.left) //NO need of providing al else branch
    }