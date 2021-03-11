package tests

import ClientType

fun main() {
    ClientType.values().forEach {clienteType ->
        println("${clienteType.name} - ${clienteType.description.toString()}")
    }
}