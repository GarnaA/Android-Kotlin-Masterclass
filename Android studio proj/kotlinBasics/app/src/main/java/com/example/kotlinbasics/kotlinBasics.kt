package com.example.kotlinbasics

fun main() {
    // val is used for immutable variables
    val myName = "Heidi"
    val age = 25
    println("Hello $myName")

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.141592653589793

    // Booleans the type Boolean is used to represent logical values
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    //Arithmetic operators (+, -, *, /, %)
    var result = 5 + 3
    result /= 2
    result *= 5
    result -= 1
    val moduloResult = 5 % 2
    println(moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5 == 3
    val isNotEqual = 5 != 5

    // Following are examples of String interpolation
    println("isNotEqual is $isNotEqual")
    println("is 5 Greater 3 ${5 > 3}")
    println("is 5 LowerEqual 3 ${5 >= 3}")
    println("is 5 LowerEqual 5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")

    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")

    // increments after use
    println("myNum is ${myNum++}")

    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

    val myAge = 16
    val drinkingAge = 21
    val votingAge = 18
    val drivingAge = 16

    val currentAge = if (myAge >= drinkingAge) {
        println("Now you may drink in the US")
        drinkingAge
    } else if (myAge >= votingAge) {
        println("You may vote now")
        votingAge
    } else if (myAge >= drivingAge) {
        println("You may drive now")
        drivingAge
    } else {
        println("You are too young")
        myAge
    }
    println("current age is $currentAge")

    // Kotlin’s "when" expression
    val season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Fall")
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    val month = 3
    when(month) {
        1,2,3 -> println("Spring")
        in 4..6 -> println("Summer")
        in 7..9 -> println("Fall")
        in 10..12 -> println("Winter")
        else -> println("Invalid Season")
    }

    // challenge - translate the if statement with the age to a when expression
    when(myAge){
        // with the !in it's the same as saying not in ...
        !in 0..21  -> println("now you may drink in the US")
        in 18..20  -> println("now you may vote")
        16,17 -> println("you now may drive")
        else -> println("you're too young")
    }
    val x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    val y : Any = 13.37

    //assign when to a variable
    val result2 =  when(y) {
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    println("$x $result2")

    // Loops
    // While Loop
    var q = 1

    while (q <= 10) {
        print("$q ")
        q++
    }
    println("\nDone with the loop")

    // Do while loop
    var z = 1
    do {
        print("$z ")
        z++
    }
    while(z <= 10)
    println("\nDone with the loop")

    var feltTemp = "cold"
    var roomTemp = 10

    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    // For Loop
    for(num in 1..10) {
        print("$num ")
    }
    println("\nDone with the loop")

    // infix notation
    for(i in 1 until 10) { // Same as - for(i in 1.until(10))
        print("$i ")
    }
    println("\nDone with the loop")

    for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
        print("$i ")
    }
    println("\nDone with the loop")

    for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
        print("$i ")
    }
    println("\nDone with the loop")

    myFunction()
    println(addUp(5,3))

    val avg = avg(5.0,6.0)
    println("The result is: $avg")

    // NULLABLES/OPTIONALS in Kotlin

    val name: String = "Denis"
    // name = null // Compilation Error

    var nullableName: String? = "Denis"
    nullableName = null // Works

    val nullableName2: String? = "Adam"
    println(nullableName2?.lowercase())

    // It's possible to use methods on a nullable variable like this
    val nullableName3: String? = null

    println(nullableName3?.lowercase()) // prints null
    println(nullableName3?.length) // prints null

    // You can perform a chain safe calls:
    //val wifeAge: String? = user?.wife?.age


    // In order to perform an operation only if the
    // variable is not null, we can use the safe call
    // operator with let -

    val nullableName4: String? = null

    nullableName4?.let { println(it.lowercase()) }
    nullableName4?.let { println(it.length) }

    // Prints nothing because there nullableName is null
    // and we used let to prevent anything from being performed

    // The elvis operator ?:
    val name2 = nullableName4 ?: "Guest"

    //val wifeAge2: String? = user?.wife?.age ?: 0


    // Not null assertion : !! Operator
    // The !! operator converts a nullable type to a
    // non-null type, and throws a NullPointerException
    // if the nullable type holds a null value.

    val nullableName5: String? = null
    //nullableName5!!.lowercase()
    // Results in NullPointerException
}

// This function has two parameters and returns a value of type Int
fun addUp(a: Int, b: Int): Int{
    return (a+b)
}
fun myFunction(){
    // The body of a function
    println("myFunction was called")
}
fun avg (a: Double, b: Double): Double{
    val av = (a+b)/2
    return av
}