package com.ozanyazici.kotlincoroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

public class ScopeCoroutines {

    fun main() {
        runBlocking {
            launch {
                delay(5000)
                println("run blocking")
            }

            //Coroutine scope bir suspend metod içerisinde yada başka bir scope içerinde yazılabilir. Runblocking coroutinescope u blocklamaz. Bu örnekte delaylerden dolayı önce coroutine scope çalışır.
        coroutineScope {
            launch {
                delay(3000)
                println("coroutine scope")
            }
        }
        }
    }
}