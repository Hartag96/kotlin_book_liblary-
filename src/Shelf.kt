class Shelf(var maxValue: Number?) {

//    TODO
//    fun getBook(): Book {
//
//    }
//
//    fun getBook(index: Number): Book {
//
//    }


    fun putBook(){

    }
    fun putBook(index: Number, book: Book){

    }

    override fun toString(): String {
        return "maxValue: $maxValue"
    }
}

class PolkaException(message:String): Exception(message)