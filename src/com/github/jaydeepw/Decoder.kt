package com.github.jaydeepw

import java.io.File

fun main() {
    System.out.println("hello")
    val data = readFileAsBytes("files/file_1.wav")
    System.out.println("len: " + data.size)
}

fun readFileAsBytes(fileName: String)
        = File(fileName).inputStream().readBytes()
