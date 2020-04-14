package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var prev = 0
        var curr = 1
        var temp: Int
        var multiplied = prev * curr

        while (multiplied < n) {
            temp = curr;
            curr += prev;
            prev = temp;
            multiplied = prev * curr
        }

        return intArrayOf(prev, curr, if (multiplied === n) 1 else 0)
    }
}
