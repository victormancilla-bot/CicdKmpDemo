package com.mancilla.cicddemo

import kotlin.test.Test
import kotlin.test.assertEquals

class SharedCommonTest {

    @Test
    fun example() {
        assertEquals(3, 1 + 2)
    }

    @Test
    fun saludoDebeIncluirNombre() {
        val resultado = sayHello("Victor")
        assertEquals("Hello, Victor!", resultado)
    }

    @Test
    fun saludoConCadenaVacia() {
        val resultado = sayHello("")
        assertEquals("Hello, !", resultado)
    }

    @Test
    fun saludoConTextoConEspacios() {
        val resultado = sayHello("Juan Carlos")
        assertEquals("Hello, Juan Carlos!", resultado)
    }
}
