open class Book() {
    open var author: String = ""
    open var genre: String = ""
    open var title: String = "Zeszyt"
    open var pages: Int? = 64

    override fun toString(): String {
        return "| $author | $title | $genre | $pages |"
    }
}

class HistoryNovel(override var genre: String, override var author: String, override var title: String, override var pages: Int?) : Book()
class MedicalThriller(override var genre: String, override var author: String, override var title: String, override var pages: Int?) : Book()
class Poem(override var genre: String, override var author: String, override var title: String, override var pages: Int?) : Book()
