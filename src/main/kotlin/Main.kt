import kotlinx.coroutines.*

fun main() {
    val x: suspend CoroutineScope.()-> Unit = {
        launch {
            delay(1000L)
            println("World!")
        }
        println("Hello")
    }
    runBlocking(block=x)

//    runBlocking { // this: CoroutineScope
//        launch { // launch a new coroutine and continue
//            delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
//            println("World!") // print after delay
//        }
//        println("Hello") // main coroutine continues while a previous one is delayed
//    }
}

fun test(){

}