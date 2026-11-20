package com.mancilla.cicddemo

import kotlin.test.Test
import kotlin.test.assertEquals

class SharedCommonTest {

    @Test
    fun example() {
        assertEquals(99, 1 + 2)
    }

    @Test
    fun saludoDebeIncluirNombre() {
        val resultado = sayHello("Victor")
        assertEquals("Hello, Victor!", resultado)
    }
}

