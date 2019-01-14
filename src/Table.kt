class Table(var maxSize: Int){
    var stack: MutableList<Book> = mutableListOf<Book>()
    var size = 0
    fun getBook(): Book? {
        if(size == 0)
            throw TableException("Nie ma ksiazek na stosie")

        size--
        return stack.last()
    }


    fun putBook(book: Book){
        if(size + 1 > maxSize)
            throw TableException("Stos pelen, nie mozna polozyc kolejnej ksiazki")

        stack.add(book)
        size++
    }
}
class TableException(message:String): Exception(message)