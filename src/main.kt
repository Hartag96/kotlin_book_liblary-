fun main(args : Array<String>) {

    val w1 = Print().getPrint("Adam Mickiewicz")
    /* W zależności od autora wybiera się odpowiednie wydawnictwo. Wpisać kilka wariantów dla różnych nazwisk. Tu powstanie wydawnictwo poematów */
    val k1 = w1?.createBook("Dziady", 130)
    /* Tworzy książkę klasy Poemat z podanym tytułem i liczbą stron.  Autor przekazany będzie z wydawnictwa */
    println(k1)

    val w2 = Print().getPrint("Jan Kochanowski")
    /* W zależności od autora wybiera się odpowiednie wydawnictwo. Wpisać kilka wariantów dla różnych nazwisk. Tu powstanie wydawnictwo poematów */
    val k2 = w2?.createBook("Tren XI", 33)
    /* Tworzy książkę klasy Poemat z podanym tytułem i liczbą stron.  Autor przekazany będzie z wydawnictwa */
    println(k2)
}

