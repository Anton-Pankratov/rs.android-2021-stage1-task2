package subtask1

import java.time.DateTimeException
import java.time.LocalDateTime
import java.time.format.TextStyle
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        try {
            LocalDateTime
                .of(year.toInt(), month.toInt(), day.toInt(), 0, 0)
                .apply {
                    val monthOfYear =
                        this.month.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"))
                    val dayOfWeek =
                        dayOfWeek.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"))
                    return "$dayOfMonth $monthOfYear, $dayOfWeek"
                }
        } catch (e: DateTimeException) {
            return "Такого дня не существует"
        }
    }
}