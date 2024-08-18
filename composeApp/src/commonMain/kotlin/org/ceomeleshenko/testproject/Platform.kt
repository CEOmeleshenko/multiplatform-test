package org.ceomeleshenko.testproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform