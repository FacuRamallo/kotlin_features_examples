package com.facuramallo.kotlin_features.variables_classes_properties

import com.facuramallo.kotlin_features.variables_classes_properties.Color.BLUE
import com.facuramallo.kotlin_features.variables_classes_properties.Color.GREEN
import com.facuramallo.kotlin_features.variables_classes_properties.Color.PURPLE
import com.facuramallo.kotlin_features.variables_classes_properties.Color.RED
import com.facuramallo.kotlin_features.variables_classes_properties.Color.VIOLET
import com.facuramallo.kotlin_features.variables_classes_properties.Color.YELLOW


enum class Color(val r: Int, val g:Int, val b:Int) {
    RED(255,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    VIOLET(0,255,255),
    PURPLE(0,0,255),
    BLACK(0,0,0),
    WHITE(255,255,255);

    fun rgb() = (r + 256 + g) + 256 + b
}
fun getWhenWithrgumentOutput(color: Color) =
    when (color) {
        RED -> "1 output for 1 constants"
        YELLOW -> "york"
        GREEN -> "Battle"
        BLUE -> "Vain"
        VIOLET,PURPLE -> "1 output for N constants"
        else -> "I have no predefined output"
    }

fun getWhenWithrOutgumentOutput(color: Color) =
    when {
        color == RED -> "1 output for 1 constants"
        color == YELLOW -> "york"
        color == GREEN -> "Battle"
        color == BLUE -> "Vain"
        color == VIOLET || color == PURPLE -> "1 output for N constants"
        else -> "I have no predefined output"
    }