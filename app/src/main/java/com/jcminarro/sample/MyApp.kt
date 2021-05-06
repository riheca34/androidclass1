package com.jcminarro.sample

import android.app.Application
import android.util.Log

class MyApp : Application() {

	override fun onCreate() {
		super.onCreate()
		Log.d("JcLog", "App is starting")
	}
}