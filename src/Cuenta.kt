/**
 * Clase que representa una cuenta bancaria.
 * @property numeroCuenta El número de la cuenta bancaria, debe constar de 9 dígitos.
 * @property saldoDisponible El saldo disponible en la cuenta.
 */
class Cuenta(numeroCuenta: Int, var saldoDisponible: Double) {

    var numeroCuenta: Int = numeroCuenta
        set(value) {
            require(((numeroCuenta.toString().length)) == 9) { "El número de cuenta debe constar de 9 dígitos." }
            field = value
        }

    /**
     * Consulta el saldo disponible en la cuenta.
     * @return Un string representando el saldo disponible.
     */
    fun consultarSaldo(): String {
        return "Saldo disponible: $saldoDisponible"
    }

    /**
     * Recibe un abono en la cuenta.
     * @param cantidad El monto del abono.
     * @return El nuevo saldo disponible después del abono.
     */
    fun recibirAbono(cantidad: Double): Double {

        return saldoDisponible + cantidad
    }

    /**
     * Realiza un pago desde la cuenta.
     * @param pago El monto a pagar.
     * @return El nuevo saldo disponible después del pago.
     */
    fun realizarPago(pago: Double): Double {
        return if (saldoDisponible - pago <= 0.0) {
            0.0
        } else {
            saldoDisponible - pago
        }
    }

}