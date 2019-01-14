object Liblary { // Singleton
    val table = Table(3);
    val bookstand = Bookstand();
}

fun main(args : Array<String>) {


    try {
//        Liblary.table.getBook()
        Liblary.table.putBook(Book("Juliusz Słowacki", "Kordian", 180))
        Liblary.table.putBook(Book("Juliusz Słowacki", "Kordian", 180))
        Liblary.table.putBook(Book("Juliusz Słowacki", "Kordian", 180))
//        Liblary.table.putBook(Book("Juliusz Słowacki", "Kordian", 180))
    }
    catch (e: TableException) {
        println(e)
    }


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

    val p = Shelf(6000)
    try {
//        p.getBook()  // PolkaException: Półka jest pusta!
        p.putBook(Book("Juliusz Słowacki", "Kordian", 180))
        p.putBook(Book("Robin Cook", "Śpiączka", 3000))
        p.putBook(4, Book("Jan Pawel II", "Modlitwa", 300))
//        p.getBook(-1) //PolkaException: niedozwolony indeks książki
//        p.getBook(3)  //PolkaException: Niedozwolony indeks książki (są tylko dwie)
        for(i in 0..6) // i == 4 --> PolkaException: Półka jest pełna!
        {
            val k = Book("Henryk Sienkiewicz", "Potop", 1200)
            p.putBook(k)
        }
    }
    catch(pe: ShelfException) {
        println(pe)
    }
    println(p)


            // Testowanie porzadkowania regalu
//    val s = Shelf(6000)
//    try {
//        s.putBook(Book("Juliusz Słowacki", "Kordian", 180))
//        s.putBook(Book("Robin Cook", "Śpiączka", 3000))
//        s.putBook(4, Book("Jan Pawel II", "Modlitwa", 300))
//        s.putBook(6, Book("Juri Ofsienko", "Uran", 431))
//        s.getBook(1)
//    }
//    catch(pe: ShelfException) {
//        println(pe)
//    }
//    print(s)
}



