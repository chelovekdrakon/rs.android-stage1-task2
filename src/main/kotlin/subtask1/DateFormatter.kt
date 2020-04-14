package subtask1

import java.lang.StringBuilder
import java.time.LocalDate
import java.time.format.DateTimeParseException

class DateFormatter {
    val monthArray = arrayOf("января","февраля","марта","апреля","мая","июня","июля","августа","сентября","октября","ноября","декабря")

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val m  = if (month.length == 1) "0$month" else month
            val date = LocalDate.parse("$year-$m-$day")

            val month = monthArray[month.toInt() - 1];

            when (date.dayOfWeek.toString()){
                "SUNDAY"->"$day $month, воскресенье"
                "MONDAY"->"$day $month, понедельник"
                "TUESDAY"->"$day $month, вторник"
                "WEDNESDAY"->"$day $month, среда"
                "THURSDAY"->"$day $month, четверг"
                "FRIDAY"->"$day $month, пятница"
                "SATURDAY"->"$day $month, суббота"
                else -> "Такого дня не существует"
            }
        } catch(e: DateTimeParseException) {
            "Такого дня не существует"
        }
    }
}
