
class Shelf(var maxSize: Int) {
    var bookMap =  mutableMapOf<Int, Book>()
    var biggestIndex: Int = 1
    fun getBook(): Book? {
        if(bookMap.size == 0)
            throw ShelfException("Półka jest pusta!")


        val bookToReturn: Book? = bookMap.get(1)
        bookMap.remove(1)
        organizeShelf()
        return bookToReturn
    }

    fun getBook(index: Int): Book? {
        if(index < 1){
            throw ShelfException("Niedozwolony indeks książki")
        }
        if(!bookMap.containsKey(index))
            throw ShelfException("Podany indeks: $index nie istnieje!")

        val bookToReturn: Book? = bookMap.get(index)
        bookMap.remove(index)
        organizeShelf()
        return bookToReturn
    }


    fun putBook(book: Book){
        if((validPush(book.pages))){
            bookMap[biggestIndex] = book
            biggestIndex += 1
        }else{
            throw ShelfException("Półka jest pełna!")
        }
    }

    fun putBook(index: Int, book: Book){
        if((validPush(book.pages))){
            bookMap[index] = book
            biggestIndex = index
        }else{
            throw ShelfException("Półka jest pełna!")
        }
    }

    override fun toString(): String {
        var output = ""
        for ((key, value) in bookMap) {
            output += "| " + key.toString() + value.toString() + "\n"
        }
        return output
    }

    fun validPush(sizeToAdd: Int): Boolean{
        var summarySize = 0
        summarySize += sizeToAdd
        for ((key, value) in bookMap) {
            summarySize += value.pages
        }
        return (summarySize < this.maxSize)

    }

    fun organizeShelf() {
        var index = 1
        var tempBookMap = mutableMapOf<Int, Book>()
        for ((key, book) in bookMap) {

            if (key >= index) {
                tempBookMap[index] = book
                index++
            }
            bookMap = tempBookMap
        }
    }
}

class ShelfException(message:String): Exception(message)