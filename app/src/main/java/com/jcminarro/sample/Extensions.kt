package com.jcminarro.sample

import android.content.Context
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

@ColorInt fun Context.getCompactColor(@ColorRes resId: Int): Int = ContextCompat.getColor(this, resId)
