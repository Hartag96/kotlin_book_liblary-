class Print {
    fun getPrint(author: String): Genre? {
        return when (author) {
            "Adam Mickiewicz", "Henryk Sienkiewicz" -> HistoryNovel("Novel", author)
            "Stefan Zeromski"          -> MedicalThriller("Thriller", author)
            "Jan Kochanowski", "Wojciech Baran"          -> Poem("Poem", author)
            else                          -> null
        }
    }
}
