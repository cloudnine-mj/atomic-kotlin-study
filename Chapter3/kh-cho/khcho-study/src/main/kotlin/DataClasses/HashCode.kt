package Chapter3.`kh-cho`.`khcho-study`.src.main.kotlin.DataClasses

import atomictest.eq

data class Key(val name: String, val id: Int)
fun main() {
    val korvo: Key = Key("Korvo", 19)
    korvo.hashCode() eq -2041757108
    val map = HashMap<Key, String>()
    map[korvo] = "Alien"
    map[korvo] eq "Alien"
    val set = HashSet<Key>()
    set.add(korvo)
    set.contains(korvo) eq true
}