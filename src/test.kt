import java.io.File

// Let's assume that Dialog class is provided by external library.
// We have only access to Dialog public interface which cannot be changed.

class Dialog() {

    fun showTitle() = println("showing title")

    fun setTitle(text: String) = println("setting title text $text")

    fun setTitleColor(color: String) = println("setting title color $color")

    fun showMessage() = println("showing message")

    fun setMessage(text: String) = println("setting message $text")

    fun setMessageColor(color: String) = println("setting message color $color")

    fun showImage(bitmapBytes: ByteArray) = println("showing image with size ${bitmapBytes.size}")

    fun show() = println("showing dialog $this")

    override fun toString() = "${showTitle()}"
}

//Builder:
class DialogBuilder() {
    constructor(init: DialogBuilder.() -> Unit) : this() {
        init()
    }

    private var titleHolder: TextView? = null
    private var messageHolder: TextView? = null
    private var imageHolder: File? = null

    fun title(init: TextView.() -> Unit) {
        titleHolder = TextView().apply { init() }
    }

    fun message(init: TextView.() -> Unit) {
        messageHolder = TextView().apply { init() }
    }

    fun image(init: () -> File) {
        imageHolder = init()
    }

    fun build(): Dialog {
        val dialog = Dialog()

        titleHolder?.apply {
            dialog.setTitle(text)
            dialog.setTitleColor(color)
            dialog.showTitle()
        }

        messageHolder?.apply {
            dialog.setMessage(text)
            dialog.setMessageColor(color)
            dialog.showMessage()
        }

        imageHolder?.apply {
            dialog.showImage(readBytes())
        }

        return dialog
    }

    class TextView {
        var text: String = ""
        var color: String = "#00000"
    }
}


class Person(var name: String, var lastName: String, var age: Int)

val nameTable = mutableMapOf<String, Person>()
val example = Person("Josh", "Cohen", 24)

fun main (args: Array<String>) {
    nameTable["person1"] = example

    for((key, value) in nameTable){
        println(value.age)
    }
}