import java.math.BigDecimal

class Account(val agency: String,
              val number: String,
              private var balance: BigDecimal) {

    fun deposit(value: BigDecimal){
        balance += value
    }

    fun withdraw(value: BigDecimal){
        balance -= value
    }
}