import java.math.BigDecimal

class Analyst(name: String, cpf: String, wage: BigDecimal) :Employee(name, cpf, wage) {
    override fun calculateBonus(): BigDecimal = wage * BigDecimal.valueOf(0.1)
}