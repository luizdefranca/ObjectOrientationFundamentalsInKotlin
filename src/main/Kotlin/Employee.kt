import java.math.BigDecimal

class Employee(
    override var name: String,
    override var cpf: String,
    var wage: BigDecimal
): Person(name, cpf){

}

