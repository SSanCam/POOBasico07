fun main() {

    try{
        /*instanciar un objeto Persona con un DNI cualquiera, así como dos objetos cuenta,
 una sin saldo inicial y otra con 700 euros.*/
        val cuenta1P1 = Cuenta(333444222, 0.0)
        val cuenta2P1 = Cuenta(222111333, 700.00)
        val persona1 = Persona("123123123", arrayOf(cuenta1P1, cuenta2P1))

        /*La persona recibe la nómina mensual, por lo que ingresa 1100 euros en la primera cuenta,
        pero tiene que pagar el alquiler de 750 euros con la segunda. Imprimir por pantalla si la persona es morosa.
        */
        var saldoCuenta1 = persona1.cuentas[0]
        var saldoCuenta2 = persona1.cuentas[1]
        println("El saldo en la primera cuenta es de: $saldoCuenta1€")
        println("El saldo en la segunda cuenta es de: $saldoCuenta2€")

        val ingresoNomina = persona1.cuentas[0].recibirAbono(1100.0)
        println("Has recibido tu nómina en tu cuenta principal. Tu saldo actual es de: ")
        println(saldoCuenta1)

        val pagarAlquiler = persona1.cuentas[1].realizarPago(750.0)
        println(pagarAlquiler)
        //val transferencia = persona1.transferencia(persona1,cuenta1P1,persona1,cuenta2P1, 50.0)

    }catch (e: IllegalArgumentException){
        println(e.message)
    }


}
