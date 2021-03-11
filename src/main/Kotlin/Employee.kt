import java.math.BigDecimal

abstract class Employee(
    override var name: String,
    override var cpf: String,
    var wage: BigDecimal
): Person(name, cpf){
    abstract fun calculateDescont()
}

