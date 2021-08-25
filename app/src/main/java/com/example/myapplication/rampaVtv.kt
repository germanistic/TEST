package com.example.myapplication

class RampaVtv {

    var velocidadRampa:Int=20
    var largoRampa:Int=100


    fun acelerarVelocidad(vel:Int)
    {
        if(vehiculo().velocidadActual<20) {
            println("Baja Velocidad a 20")
        }
    }

    fun detenerVelocidad(vel:Int)
    {
        if(vehiculo().velocidadActual<20 || vehiculo().velocidadActual>20) {
            println("Stop")
        }
    }

    fun aumentarVelocidad(vel:Int)
    {
        if(vehiculo().velocidadActual<20){
        println("Aumenta Velocidad a 20")
    }
    }

    fun controlarVelocidad(vel:Int)
    {
        if(vehiculo().velocidadActual!=20)
        println("Velocidad a 20")
    }
}