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

// Data class - store data that once has been created, it can be modified
// Data class can be an abstract class
// Data class can implement interface
// Data class has all the primary constructors has to be initialized
// Data class is passed by copying instead of reference