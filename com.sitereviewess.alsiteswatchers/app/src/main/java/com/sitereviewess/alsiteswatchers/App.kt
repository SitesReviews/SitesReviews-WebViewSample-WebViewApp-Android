package com.sitereviewess.alsiteswatchers

import android.app.Application
import com.yandex.metrica.YandexMetrica

import com.yandex.metrica.YandexMetricaConfig


class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val config =
            YandexMetricaConfig.newConfigBuilder("12adc469-5fb2-438b-b642-63e1fba49344").build()
        YandexMetrica.activate(applicationContext, config)
        YandexMetrica.enableActivityAutoTracking(this)
    }
}