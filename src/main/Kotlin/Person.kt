class Person {
    var name: String = "Luiz"
    var cpf: String = "123.123.123-00"
    private set

}

fun main() {
    val luiz = Person()
    println(luiz)
    println(luiz.name)
    println(luiz.cpf)

}