class Bookstand(){
    var shelfMap =  mutableMapOf<Number, Shelf>()
    fun setMap(shelfMap: MutableMap<Number, Shelf>){
        this.shelfMap = shelfMap
    }

    fun getShelf(index: Number): Shelf? {
        if(!shelfMap.containsKey(index)) {
            throw BookstandException("Nie polki o indeksie $index")
        }

        return shelfMap.get(index)
    }

}

class BookstandBuilder() {
    constructor(init: BookstandBuilder.() -> Unit) : this() {
        init()
    }

    private var shelfMap =  mutableMapOf<Number, Shelf>()

    fun add(shelf: Shelf){
        shelfMap.put(shelfMap.size+1, shelf)

    }

    fun toBookstand(): Bookstand{
        Liblary.bookstand.setMap(shelfMap)

        return Liblary.bookstand

    }
}

class BookstandException(message:String): Exception(message)