fun main() {
    print("Enter positive integer number: ")
    var number = readLine()!!.toInt()
    var resultArray = fibonacci(number)

    for(item in resultArray){
        print("$item ")
    }
}

fun fibonacci(N: Int): IntArray {
    var f1: Int = 0
    var f2: Int = 1
    var fibonacciArray = ArrayList<Int>()

    for(i in 0..N){
        if(N >= f1) {
            fibonacciArray.add(f1)
            var next: Int = f1 + f2
            f1 = f2
            f2 = next
        }
    }

    var size = fibonacciArray.size
    var resultArray = IntArray(size)

    for(i in 0..size-1){
        resultArray[i] = fibonacciArray[i]
    }

    return resultArray
}

