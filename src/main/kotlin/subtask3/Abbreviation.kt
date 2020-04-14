package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val temp = StringBuilder(a.toUpperCase())
        var i = 0
        while (b.length != i && b.length <= temp.length){
            if (temp[i] != b[i]){
                temp.deleteCharAt(i)
                i--
            }
            i++
        }

        return if (i == b.length){
            "YES"
        } else {
            "NO"
        }
    }
}
