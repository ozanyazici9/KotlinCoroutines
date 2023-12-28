package com.ozanyazici.kotlincoroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {

    //Suspend: Kelime anlamı askıya almak.
    //Suspend fonksiyonlar içerinde coroutin çalıştırılabilen fonksiyonlardır. Bu fonksiyonlar durdurup devam edilebilir. Yani suspend edilebilir.
    //İçerisinde coroutine çalışrılacak fonksiyon suspend olmalıdır.
    //suspend metodlar sadece başka bir suspend metod içerisinden veya başka bir coroutine içerisinden çağrılabilir.

    runBlocking {
        delay(2000)
        println("run blocking")
        myFunction()
    }
}

suspend fun myFunction() {
    coroutineScope {
        delay(4000)
        println("suspend function")
    }
}

