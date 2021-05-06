package com.jcminarro.sample

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat

class ColorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("JcLog", "ColorActivity is in onCreate $savedInstanceState")
        savedInstanceState?.let {
            Log.d("JcLog", "Bundle -> ${it.getString("id")}")
        }
        setContentView(R.layout.activity_color)

        val backgroundColor: BackgroundColor =
            intent.getSerializableExtra(BACKGROUND_COLOR_KEY) as? BackgroundColor
                ?: BackgroundColor.YELLOW
        Log.d("JcLog", "ColorActivity created with color: $backgroundColor")

        findViewById<View>(R.id.vBackground).setBackgroundColor(getCompactColor(backgroundColor.colorId()))
    }

    override fun onStart() {
        super.onStart()
        Log.d("JcLog", "ColorActivity is in onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("JcLog", "ColorActivity is in onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("JcLog", "ColorActivity is in onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("JcLog", "ColorActivity is in onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("JcLog", "ColorActivity is in onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("id", "colorActivity")
        Log.d("JcLog", "ColorActivity is in onSaveInstanceState")
    }

    companion object {

        const val BACKGROUND_COLOR_KEY = "BACKGROUND_COLOR_KEY"

        fun intent(context: Context, backgroundColor: BackgroundColor): Intent =
            Intent(context, ColorActivity::class.java).apply {
                putExtra(BACKGROUND_COLOR_KEY,  backgroundColor)
            }

        private fun BackgroundColor.colorId(): Int = when (this) {
            BackgroundColor.YELLOW -> R.color.yellow
            BackgroundColor.RED -> R.color.red
            BackgroundColor.GREEN -> R.color.green
            BackgroundColor.BLUE -> R.color.blue
        }
    }
}

enum class BackgroundColor {
    YELLOW,
    RED,
    GREEN,
    BLUE
}
