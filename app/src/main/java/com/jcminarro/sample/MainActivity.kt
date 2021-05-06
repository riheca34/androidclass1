package com.jcminarro.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		Log.d("JcLog", "MainActivity is in onCreate")
		setContentView(R.layout.activity_main)
		setupListener()
	}

	override fun onStart() {
		super.onStart()
		Log.d("JcLog", "MainActivity is in onStart")
	}

	override fun onResume() {
		super.onResume()
		Log.d("JcLog", "MainActivity is in onResume")
	}

	override fun onPause() {
		super.onPause()
		Log.d("JcLog", "MainActivity is in onPause")
	}

	override fun onStop() {
		super.onStop()
		Log.d("JcLog", "MainActivity is in onStop")
	}

	override fun onDestroy() {
		super.onDestroy()
		Log.d("JcLog", "MainActivity is in onDestroy")
	}

	private fun setupListener() {
		setupButtonClickListener(R.id.bYellow, BackgroundColor.YELLOW)
		setupButtonClickListener(R.id.bRed, BackgroundColor.RED)
		setupButtonClickListener(R.id.bGreen, BackgroundColor.GREEN)
		setupButtonClickListener(R.id.bBlue, BackgroundColor.BLUE)
	}

	private fun setupButtonClickListener(
		buttonId: Int,
		backgroundColor: BackgroundColor
	) {
		findViewById<Button>(buttonId).setOnClickListener {
			Log.d("JcLog", "Click on button to Start ColorActivity with background: $backgroundColor")
			startActivity(ColorActivity.intent(this, backgroundColor))
		}
	}
}