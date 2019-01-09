fun main(args : Array<String>) {
    println(Liblary.table);
    println(Liblary.bookstand);
}

object Liblary { // Singleton
    val table = Table();
    val bookstand = Bookstand();
}

