interface Genre {
    val genre: String
    val author: String
    fun createBook(title: String, number: Number): Book
}

open class Book(): Genre{
    override val author: String
        get() {
            return author
        }
    override val genre: String
        get() {
            return genre
        }
    override fun createBook(title: String, pages: Number): Book {
        this.title = title
        this.pages = pages
        return this
    }

    var title: String = "Zeszyt"
    var pages: Number? = 64

    override fun toString(): String {
        return "| $author | $title | $genre | $pages |"
    }
}

class HistoryNovel(override val genre: String, override val author: String) : Book()
class MedicalThriller(override val genre: String, override val author: String) : Book()
class Poem(override val genre: String = "Poem", override val author: String) : Book()
