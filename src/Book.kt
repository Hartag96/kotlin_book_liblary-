class Book() : Text{
    var author: String = ""
    var title: String = "Zeszyt"
    var pages: Number? = 64

    constructor(author: String, title: String, pages: Number) : this() {
        this.author = author
        this.title = title
        this.pages = pages
    }

    override fun toString(): String {
        return "| $author | $title | $pages |"
    }
}

interface Text {
    override fun toString(): String
}