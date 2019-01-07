abstract class Book(): Genre{
    override fun createBook(title: String, pages: Number): Book {
        this.title = title
        this.pages = pages
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override var author: String = ""
    var title: String = "Zeszyt"
    var pages: Number? = 64

    override fun toString(): String {
        return "| $author | $title | $pages |"
    }
}

interface Genre {
    val genre: String
    val author: String
    fun createBook(title: String, number: Number): Book
}
class HistoryNovel(override val genre: String = "Novel") : Genre, Book()
class MedicatThriller(override val genre: String = "Thriller") : Genre, Book()
class Poem(override val genre: String = "Poem") : Genre, Book()

enum class Author(val author: String) {
    ADAM("Adam Mickiewicz"),
    HENRYK("Henryk Sienkiewicz"),
    STEFAN("Stefan Zeromski"),
    JAN("Jan Kochanowski"),
    WOJCIECH("Wojciech Baran")
}

class Print {
    fun getPrint(author: String): Genre? {
        return when (author) {
            "Adam Mickiewicz", "Henryk Sienkiewicz" -> HistoryNovel()
            "Stefan Zeromski"          -> MedicatThriller()
            "Jan Kochanowski", "Wojciech Baran"          -> Poem()
            else                          -> null
        }
    }
}