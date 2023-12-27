package Visibility

class Cookie(
    private var isReady: Boolean
) {
    private fun crumble() =
        println("crumble")

    public fun bite() =
        println("bite")

    fun eat() {
        isReady = true
        crumble()
        bite()
    }
}

fun main() {
    val x = Cookie(false)
    x.bite()
    // private 멤버에 접근 불가
    // x.isReady
    // x.crumble()
    x.eat()
}