class Persona(dni: String, cuentas: Array<Cuenta>) {

    var cuentas: Array<Cuenta> = cuentas
        set(value) {
            require(value.size <= 3) { "La persona sólo puede tener 3 cuentas asociadas." }
            field = value
        }
    init {
        require(dni.length == 9) { "El campo dni debe constar de 8 numeros y una letra, todo junto." } }

    fun esMorosa(persona: Persona): Boolean{
        return persona.cuentas.any { (it.saldoDisponible ?: 0.0) < 0 }
    }

    fun transferencia(personaOrigen: Persona, cuentaOrigen: Cuenta, personaDestino: Persona, cuentaDestino: Cuenta, cantidad: Double): Boolean {

        if (personaOrigen.cuentas.contains(cuentaOrigen) && personaDestino.cuentas.contains(cuentaDestino)) {
            if (cantidad < cuentaOrigen.saldoDisponible) {
                cuentaOrigen.saldoDisponible -= cantidad
                cuentaDestino.saldoDisponible += cantidad
                return true
            } else {
                return false
            }
        }else{
            return false
        }
    }
}