class ExtensionExample {
    fun name(str: String): String {
        return "Hello ${str}"
    }
}

fun main(args: Array<String>) {
    val ee = ExtensionExample()
    println("${ee.name("Sujatha")} ${ee.sayGoodMorning()}")
}

fun ExtensionExample.sayGoodMorning(): String {
    return "Good Morning"
}