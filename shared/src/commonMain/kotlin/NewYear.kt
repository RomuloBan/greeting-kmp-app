import kotlinx.datetime.*

fun daysUntilNewYear(): Int {
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
    val newYear = LocalDate(today.year + 1, 1, 1)
    return today.daysUntil(newYear)
}

fun daysPhrase(): String = "There are only ${daysUntilNewYear()} days left until the New Year! \uD83C\uDF86"