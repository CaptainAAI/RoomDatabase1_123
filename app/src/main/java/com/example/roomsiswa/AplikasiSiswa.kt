package com.example.roomsiswa

import android.app.Application
import com.example.roomsiswa.repositori.ContainerApp

class AplikasiSiswa {
    class AplikasiSiswa : Application() {
        lateinit var container: ContainerApp

        override fun onCreate() {
            super.onCreate()
            container = ContainerApp(this)
        }
    }
}