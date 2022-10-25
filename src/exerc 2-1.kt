fun main() {
    val groups = arrayListOf<String>("Group One", "Group Two", "Group Three")

    println( groups[0])
    println( groups.get(1) )
    println("")

    groups [0] = "Group One"
    groups.set(1,"Group Two")

    println( groups[0])
    println( groups.get(1))
    println( groups.get(2))
}