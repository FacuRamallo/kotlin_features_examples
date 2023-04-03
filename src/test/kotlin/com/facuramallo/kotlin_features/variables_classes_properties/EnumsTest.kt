package com.facuramallo.kotlin_features.variables_classes_properties

import com.facuramallo.kotlin_features.variables_classes_properties.Color.BLACK
import com.facuramallo.kotlin_features.variables_classes_properties.Color.GREEN
import com.facuramallo.kotlin_features.variables_classes_properties.Color.PURPLE
import com.facuramallo.kotlin_features.variables_classes_properties.Color.VIOLET
import com.facuramallo.kotlin_features.variables_classes_properties.Color.WHITE
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnumsTest {
    @Test
    fun `when with argument should return correspondent string for each color`() {
        assertThat( getWhenWithrgumentOutput(GREEN) == "Battle" )
        assertThat (getWhenWithrgumentOutput(VIOLET) == "1 output for N constants" && getWhenWithrgumentOutput(PURPLE) == "1 output for N constants")
        assertThat (getWhenWithrgumentOutput(BLACK) == "I have no predefined output" && getWhenWithrgumentOutput(WHITE) == "I have no predefined output")
    }
    @Test
    
    fun `when without argument should return correspondent string for each color`() {
        assertThat( getWhenWithrOutgumentOutput(GREEN) == "Battle" )
        assertThat (getWhenWithrOutgumentOutput(VIOLET) == "1 output for N constants" && getWhenWithrOutgumentOutput(PURPLE) == "1 output for N constants")
        assertThat (getWhenWithrOutgumentOutput(BLACK) == "I have no predefined output" && getWhenWithrOutgumentOutput(WHITE) == "I have no predefined output")
    }
}