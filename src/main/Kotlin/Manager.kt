import java.math.BigDecimal

class Manager(
    name: String,
    cpf: String,
    wage: BigDecimal)
    :Employee(name, cpf, wage) {
    override fun calculateBonus(): BigDecimal = wage * BigDecimal.valueOf(0.4)
}
