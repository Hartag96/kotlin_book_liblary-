abstract class Book(): Wydawnictwo{

    var author: String = ""
        get() = field
        set(value) {
            field = value
        }
    var title: String = "Zeszyt"
        get() = field
        set(value) {
            field = value
        }
    var pages: Number? = 64
        get() = field
        set(value) {
            field = value
        }

    constructor(author: String, title: String, pages: Number) : this() {
        this.author = author
        this.title = title
        this.pages = pages
    }

    override fun toString(): String {
        return "| $author | $title | $pages |"
    }
}

interface Genre {
    val genre: String
}
class HistoryNovel(override val genre: String = "Novel") : Genre
class MedicatThriller(override val genre: String = "Thriller") : Genre
class Poem(override val genre: String = "Poem") : Genre

enum class Author(val author: String) {
    ADAM("Adam Mickiewicz"),
    HENRYK("Henryk Sienkiewicz"),
    STEFAN("Stefan Zeromski"),
    JAN("Jan Kochanowski"),
    WOJCIECH("Wojciech Baran")
}

class Wydawnictwo {
    fun getWydawnictwo(author: Author): Author? {
        return when (author) {
            Author.ADAM.author, Author.HENRYK-> HistoryNovel()
            Country.UnitedStates          -> UnitedStatesDollar()
            else                          -> null
        }
    }
}