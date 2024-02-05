class Cuenta(numeroCuenta: Int, var saldoDisponible: Double) {

    var numeroCuenta: Int = numeroCuenta
        set(value) {
            require(((numeroCuenta.toString().length)) == 9) { "El número de cuenta debe constar de 9 dígitos." }
            field = value
        }

    fun consultarSaldo(): String {
        return "Saldo disponible: $saldoDisponible"
    }

    fun recibirAbono(cantidad: Double): Double {
        return saldoDisponible + cantidad
    }

    fun realizarPago(pago: Double): Double {
        return if (saldoDisponible - pago <= 0.0) {
            0.0
        } else {
            saldoDisponible - pago
        }
    }

}