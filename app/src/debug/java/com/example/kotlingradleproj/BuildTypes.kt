package com.example.kotlingradleproj

import android.app.Activity
import android.graphics.Color
import android.view.View
import android.view.ViewGroup

fun Activity.drawBadge(){
    val badge = View(this)
    badge.setBackgroundColor(Color.YELLOW)
    val decorview = window.decorView as ViewGroup
    decorview.addView(badge,200,200)
}