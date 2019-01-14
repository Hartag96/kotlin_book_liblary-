abstract class Print {
    abstract val author: String
    abstract val genre: String
    abstract fun createBook(title: String, pages: Int): Book

    companion object {
        inline fun getPrint(author: String): Print = when (author) {
            "Adam Mickiewicz", "Henryk Sienkiewicz" -> PrintHistoryNovel("Novel", author)
            "Stefan Zeromski"    -> PrintMedicalThriller("Thriller", author)
            "Jan Kochanowski"    -> PrintPoem("Poem", author)
            else                 -> throw IllegalArgumentException()
        }
    }
}

class PrintHistoryNovel(override val genre: String, override val author: String) : Print() {
    override fun createBook(title: String, pages: Int): Book {
        return HistoryNovel(this.genre, this.author, title, pages)
    }
}

class PrintMedicalThriller(override val genre: String, override val author: String): Print() {
    override fun createBook(title: String, pages: Int): Book {
        return MedicalThriller(this.genre, this.author, title, pages)
    }
}
class PrintPoem(override val genre: String, override val author: String): Print(){
    override fun createBook(title: String, pages: Int): Book {
        return Poem(this.genre, this.author, title, pages)
    }
}