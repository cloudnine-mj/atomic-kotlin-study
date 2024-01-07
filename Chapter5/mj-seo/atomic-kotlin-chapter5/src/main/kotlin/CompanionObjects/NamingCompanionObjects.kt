package companionobjects

import Test.eq


class WithNamed {
    companion object Named {
        fun s() = "from Named"
    }
}

class WithDefault {
    companion object {
        fun s() = "from Default"
    }
}

fun main() {
    WithNamed.s() eq "from Named"
    WithNamed.Named.s() eq "from Named"
    WithDefault.s() eq "from Default"

    // Companion이 Default 이름이다.
    WithDefault.Companion.s() eq "from Default"
}