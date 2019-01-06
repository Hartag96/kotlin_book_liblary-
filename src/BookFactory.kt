interface Currency {
    val code: String
}

class Euro(override val code: String = "EUR") : Currency
class UnitedStatesDollar(override val code: String = "USD") : Currency

enum class Country {
    UnitedStates, Spain, UK, Greece
}

class CurrencyFactory {
    fun currencyForCountry(country: Country): Currency? {
        return when (country) {
            Country.Spain, Country.Greece -> Euro()
            Country.UnitedStates          -> UnitedStatesDollar()
            else                          -> null
        }
    }
}