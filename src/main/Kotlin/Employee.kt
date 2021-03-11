import java.math.BigDecimal

abstract class Employee(
    override var name: String,
    override var cpf: String,
    var wage: BigDecimal
): Person(name, cpf){
    protected abstract fun calculateBonus(): BigDecimal

    override fun toString(): String  = """
        name: $name
        cpf: $cpf
        wage: $wage
        bonus: ${calculateBonus()}
        """.trimIndent()
}

