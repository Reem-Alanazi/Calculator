fun main (){
    var a = 6
    var b = 6

    var operation = '+'

    if (operation == '*' ){
        println(a*b) }
    else if (operation == '-' ){
        println(a-b) }
    else if (operation == '+' ){
        println(a+b) }
    else {
        var division = a / b
        var remainder = a % b
        println("The result $division and the remainder is $remainder ")
    } }