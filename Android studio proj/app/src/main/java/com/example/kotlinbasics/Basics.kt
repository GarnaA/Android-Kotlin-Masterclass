package com.example.kotlinbasics

fun main(args: Array<String>){
    //immutable variable
    val myName = "Alina"

    //mutable variable
    var myAge = 9

    //integer number types

    //type Byte (8 bits of memory)
    //type Short (16 bits of memory)
    //type Int (32 bits of memory)
    //type Long (64 bits of memory)

    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    //floating point number types

    val myFloat: Float = 13.37F
    val myDouble: Double = 3.1234575458543

    //Boolean is used to represent logical value

    //type inference (finds out the type from context)
    var isSunny: Boolean = true
    isSunny = false


    //Character
    val letterChar = 'A'
    val digitChar = '1'

    //String
    val myString = "Hi, stranger!"
    var firstCharInStr = myString[0]

    //concatenating(adding strings together)
    //string template expression or string interpolation
    println("Last char: $firstCharInStr and the length of myString is ${myString.length}")

    //Arithmetic operators (+, -, /, *, %)
    var result = 5+3
    result /= 2
    result *= 3
    result += 2
    result -= 4
    result %= 4

    val a = 5.0
    val b = 3

    var resultDouble: Double = a/b

    println(resultDouble)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5!=3

    println("isEqual is $isEqual")
}