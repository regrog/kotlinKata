
fun productFib(prod:Long):LongArray {
    var a:Long = 0
    var b:Long = 0
    var found:Long = 0
    var res:Long = 0
    var i:Long = 0
    while(res < prod){
        i++
        a = fib(i)
        b = fib(i+1)
        res = a * b
        if(res == prod)
          found = 1
    }
    return longArrayOf(a, b, found)
}

fun fib(number:Long):Long {
    return fib(number, 1, 1)
}

fun fib(n:Long, n1:Long, n2:Long):Long {
    if(n <= 2)
        return n2
    else
        return fib(n-1, n2, n1 + n2)
}

// soluzione migliore
fun productFib2(prod:Long):LongArray {
    var (a, b, check) = longArrayOf(0, 1, 0)
    while (check < prod) {
        a = b.also { b += a }
        check = a * b
    }
    return longArrayOf(a, b, if (check == prod) 1L else 0L)
}