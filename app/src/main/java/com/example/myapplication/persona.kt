package com.example.myapplication


import java.util.*

class persona {

    var nombre: String = ""

        get() = field
        set(value) {
            if(value== buscarfbi()) field = value else print("Peligro")
        }

    var apellido: String = ""
    var dni: Int = 0
    var mail: String = ""
    var anioNacimiento: Int = 0
    var domicilio: String = ""
    var discapacitado: Boolean =false
    var estadoJubilado: Boolean =false

    fun buscarfbi():String{
        var nuevoNombre = persona()
        var valor2 = Scanner(System.`in`)
        print("Ingrese el nombre:")
        nuevoNombre.nombre = valor2.toString()
        return valor2.toString()
    }

}