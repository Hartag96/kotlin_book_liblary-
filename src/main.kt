
fun main(args : Array<String>) {

    val b = Book("Adam Mickiewicz", "Pan Tadeusz", 830)
    val b2 = Book("Adam Mickiewicz", "Dziady", 130)
    val bb = NormalCover(b)
    val bb2 = SolidCover(b2)
    val bbb2 = DecorativeCover(bb2) // możliwe jest wielokrotne obkładanie
    println(bb)
    println(bb2)
    println(bbb2)

}

