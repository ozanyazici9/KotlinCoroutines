package com.ozanyazici.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() {

    //Job: Coroutine'lerde Job, bir coroutine'in çalışma sürecini temsil eden ve bu sürecin kontrolünü sağlayan bir yapıdır.
    //Job, bir coroutine başlatıldığında dönen bir referanstır ve bu referans üzerinden coroutine'in durumunu takip etmek, iptal etmek
    //ve diğer kontrol işlemlerini gerçekleştirmek mümkündür.

    runBlocking {

        val myJob = launch {
            delay(2000)
            println("job")
            val secondJob = launch {
                println("job 2")
            }
        }

        //job yani coroutine tamamlandığında çağrılır.
        myJob.invokeOnCompletion {
            println("my job end")
        }

        myJob.cancel()
    }
}