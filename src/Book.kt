class Book() : Text{
    var author: String = ""
    var title: String = "Zeszyt"
    var pages: Int = 64

    constructor(author: String, title: String, pages: Int) : this() {
        this.author = author
        this.title = title
        this.pages = pages
    }

    override fun toString(): String {
        return "|$author \t | $title | $pages |"
    }
}

interface Text {
    override fun toString(): String
}