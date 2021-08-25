package com.example.myapplication

class vehiculo {
    var anio: Int = 0

        get() = field
        set(value) {
            if(value>3) field = value else print("hola")
        }

    var marca: String = ""
    var modelo: String = ""
    var patente: String = ""
    var cantEjes: Int = 0
    var kmActual: Int = 0
    var domRadicacion: String = ""
    var velocidadActual: Int = 0

}