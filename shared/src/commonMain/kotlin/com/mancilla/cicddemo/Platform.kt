package com.mancilla.cicddemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform