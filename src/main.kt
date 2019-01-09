import java.io.File

object Liblary { // Singleton
    val table = Table();
    val bookstand = Bookstand();
}

fun main(args : Array<String>) {
//    println(Liblary.table);
//    println(Liblary.bookstand);

    val rb = BookstandBuilder()
    rb.add(Shelf(10000))
    rb.add(Shelf(5000))
    val r = rb.toBookstand() //Wlasciwy proces tworzenia obiektu Regal.

    try {
        println(r.getShelf(1))
        println(r.getShelf(2))
        println(r.getShelf(3))
    }
    catch (e: BookstandException) {
        println(e)
    }

// TODO
//    val p = Shelf(6000)
//    try {
//        // p.wezKsiazke()  // PolkaException: Półka jest pusta!
//        p.putBook(Obwoluta(Book("Juliusz Słowacki", "Kordian", 180)))
//        p.putBook(Book("Robin Cook", "Śpiączka", 300))
//        p.getBook(-1) //PolkaException: niedozwolony indeks książki
//        p.getBook(3)  //PolkaException: Niedozwolony indeks książki (są tylko dwie)
//        for(i in 0..6) // i == 4 --> PolkaException: Półka jest pełna!
//        {
//            val k = Book("Henryk Sienkiewicz", "Potop", 1200)
//            p.putBook(k)
//        }
//    }
//    catch(pe: PolkaException) {
//
//    }
//    println(p)
//
}

