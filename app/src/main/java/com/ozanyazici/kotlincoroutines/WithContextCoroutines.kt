package com.ozanyazici.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {
    //Dispatcher değiştirmeye örnek.

    //withContext fonksiyonu, coroutine içindeki işlemlerin belirtilen dispatcher üzerinde çalışmasını sağlar,
    //ancak kendisi coroutine'ın yeniden başlatılmasını tetiklemez.

    runBlocking {
        launch(Dispatchers.Default) {
            println("Context: ${coroutineContext}")
            withContext(Dispatchers.IO) {
                println("Context: ${coroutineContext}")
            }
        }
    }
}