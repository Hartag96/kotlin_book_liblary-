class Book() : Text{
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

interface Text {
    override fun toString(): String
}