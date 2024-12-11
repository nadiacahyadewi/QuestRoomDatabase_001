package com.example.pertemuan10

import android.app.Application
import com.example.pertemuan10.dependenciesinjection.ContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp // fungsinya untuk menyimpan instance

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) //membuatinstance ContainerApp
        //instance adalah object yang dibuat dari class
    }
}