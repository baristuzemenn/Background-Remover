package com.theapache64.bgremover

import android.app.Application
import com.theapache64.removebg.RemoveBg

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        RemoveBg.init("YE2MAdiMbpArewjuk2dsLtZh")
    }
}