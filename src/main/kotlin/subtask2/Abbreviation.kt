package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        return if (a.toUpperCase().toSet()
                .intersect(b.asIterable()).toCharArray()
                .contentEquals(b.toCharArray())) "YES" else "NO"
    }
}
