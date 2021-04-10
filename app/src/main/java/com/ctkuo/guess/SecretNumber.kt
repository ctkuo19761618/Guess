package com.ctkuo.guess

import java.util.*

class SecretNumber {
    val secretNumber : Int = Random().nextInt(10) + 1

    var count : Int =0

    fun validate(number:Int) : Int{
        count ++
        return number - secretNumber
    }

}

fun main() {
    val secretNumber = SecretNumber()
    print("${secretNumber.secretNumber}")
    println("${secretNumber.validate(6)},count:${secretNumber.count}")
}
