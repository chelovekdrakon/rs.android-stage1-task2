package subtask2

class TimeConverter {
    val mapNumberToWord = arrayOf(
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twenty one",
        "twenty two",
        "twenty three",
        "twenty four",
        "twenty five",
        "twenty six",
        "twenty seven",
        "twenty eight",
        "twenty nine",
        "thirty")

    fun toTextFormat(hour: String, minute: String): String {
        return when (minute.toInt()) {
            0 -> "${mapNumberToWord[hour.toInt()]} o' clock"
            1 -> "one minute past ${mapNumberToWord[hour.toInt()]}"
            15 -> "quarter past ${mapNumberToWord[hour.toInt()]}"
            30 -> "half past ${mapNumberToWord[hour.toInt()]}"
            45 -> "quarter to ${mapNumberToWord[hour.toInt() + 1]}"
            in 1..30 -> "${mapNumberToWord[minute.toInt()]} minutes past ${mapNumberToWord[hour.toInt()]}"
            in 31..60 -> "${mapNumberToWord[60 - minute.toInt()]} minutes to ${mapNumberToWord[hour.toInt() + 1]}"
            else -> ""
        }
    }
}
