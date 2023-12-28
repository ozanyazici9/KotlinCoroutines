package com.ozanyazici.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    var userName = ""
    var userAge = 0

    runBlocking {

        //async in launch dan farkı bir return beklemesidir.
        val downloadedName = async {
            downloadName()
        }

        val downloadedAge = async {
            downloadAge()
        }

        userAge = downloadedAge.await() //Await thread i bloklamadan atama işlemeinin gerçekleşmesini bekler.
        userName = downloadedName.await()

        println("${userName} ${userAge}")
    }

}

suspend fun downloadName() : String {
    delay(2000)
    val userName = "ozan"
    println("username download")
    return userName
}

suspend fun downloadAge() : Int {
    delay(1000)
    val userAge = 23
    println("userage download")
    return userAge
}