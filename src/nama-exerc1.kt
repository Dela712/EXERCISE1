fun main() {
    val myProfile = setUser("Dela Fitriani Kurnia", 20)
    println(myProfile)
}

fun setUser(name: String, age: Int): String{
    return "Nama saya adalah $name dan umur saya adalah $age tahun"
}