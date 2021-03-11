open class Person(
    open var name: String = "Luiz",
    open var cpf: String = "123.123.123-00"
) {
    

    fun personInfo() = "$name e $cpf"
}

fun main() {
    val luiz = Person()
    println(luiz)
    println(luiz.name)
    println(luiz.cpf)

}