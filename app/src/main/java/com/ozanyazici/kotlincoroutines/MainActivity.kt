package com.ozanyazici.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness

        /* Eğer bunu normal thread ile yapsaydım 100000 thread uygulamayı çökertirdi ama coroutines çok hafif olduğu için uygulama çökmeden çalışabiliyor.
       GlobalScope.launch {
           repeat(100000) {
               launch {
                   println("android")
               }
           }
       }
         */

        //Scope: Coroutine in nerede çalışacağını belirten yapı
        //GlobalScope: Uygulamanın yaşam döngüsü boyunca mevcut olan genel bir coroutine scope'dur. Coroutine ni bütün uygulama kapsamında kullanılabilecek şekilde açar. Çok kullanılmaz.
        //runBlocking: İçerisindeki coroutinler çalışırken daha sonraki kodların çalışmasını bloklar. Coroutinelerin işi bitince diğer kodlar çalışır. Çok kullanılmaz amaç tek bir coroutine çalıştırmaksa kullanılabilir.
        //CoroutineScope: CoroutineScope genellikle bir sınıfa veya işlevsel bir kapsama aittir. Örneğin, ViewModel, Activity veya Fragment gibi. En çok tercih edilendir çünkü kontrol kolaylığı sağlar.

        /*
        println("run blocking start")
        runBlocking {
            launch {
                delay(5000)
                println("run Blocking")
            }
        }
        println("run blocking end")
        */

        /*
        println("global scope start")
            GlobalScope.launch {
                delay(5000)
                println("global scope")
            }
        println("global scope end")
         */

        /*
        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine scope end")
         */

        /*
       val a = ScopeCoroutines()
        a.main()
         */

        //Dispatchers: kelime anlamı sevkiyat görevlisi. Burada çalışma ortamı anlamında kullanılıyor. Bu arkadaş coroutine i hangi thread de kullanacağımızı belirtmemize yarıyor.
        //Dispatchers.Default -> CPU yu yoğun olarak kullanacak işlemlerde tercih edilir örneğin görsel işleme.
        //Dispatchers.IO -> Input / Output, Networking(Retrofit vb.) işlemlerde kullanılır.
        //Dispatchers.Main -> UI ile ilgili işlemlerde kullanılır. Kullanıcıya gösterilecek işlemlerde.
        //Dispatchers.Unconfined -> içerisinde çalıştırıldığı yere göre değişir kendi ayarlar. Başlatıldığında o anki thread üzerinde çalışır ama esnek bir yapısı vardır.
        //Bunların arasında geçiş yapılabilir. Örneğin internetten çekilen veriyi kullanıcıya gösterme gibi.
        /*
        runBlocking {

            launch(Dispatchers.Main) {
                println("Main Thread: ${Thread.currentThread().name} ")
            }

            launch(Dispatchers.IO) {
                println("IO Thread: ${Thread.currentThread().name} ")
            }

            launch(Dispatchers.Default) {
                println("Default Thread: ${Thread.currentThread().name} ")
            }

            launch(Dispatchers.Unconfined) {
                println("Uncofined Thread: ${Thread.currentThread().name} ")
            }

        }
         */



    }


}