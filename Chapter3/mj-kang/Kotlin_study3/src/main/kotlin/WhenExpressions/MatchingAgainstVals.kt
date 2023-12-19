package WhenExpressions

import atomictest.trace


fun main() {
    val yes = "A"
    val no = "B"

    for (choice in listOf(yes, no, yes)) {
        when (choice) {
            yes -> trace("Hooray!")
            no -> trace("Too bad!")
        }

        if (choice == yes) trace("Hooray!")
        else if (choice == no) trace("Too bad!")
    }

    trace eq """
        Hooray!
        Hooray!
        Too bad!
        Too bad!
        Hooray!
        Hooray!
    """.trimIndent()
}