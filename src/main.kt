
fun main(args : Array<String>) {

    val noCurrencyCode = "No Currency Code Available"

    val greeceCode = CurrencyFactory().currencyForCountry(Country.Greece)?.code ?: noCurrencyCode
    println("Greece currency: $greeceCode")

    val usCode = CurrencyFactory().currencyForCountry(Country.UnitedStates)?.code ?: noCurrencyCode
    println("US currency: $usCode")

    val ukCode = CurrencyFactory().currencyForCountry(Country.Spain)?.code ?: noCurrencyCode
    println("UK currency: $ukCode")

//    val w = Wydawnictwo.getWydawnictwo("Adam Mickiewicz")
    /* W zależności od autora wybiera się odpowiednie wydawnictwo. Wpisać kilka wariantów dla różnych nazwisk. Tu powstanie wydawnictwo poematów */
//    val k = w.createBook("Dziady", 130)
    /* Tworzy książkę klasy Poemat z podanym tytułem i liczbą stron.  Autor przekazany będzie z wydawnictwa */
}

