package com.example.myfigures.canvas

import android.graphics.Canvas
import android.graphics.Paint

interface Shape {
    fun draw(canvas: Canvas, paint: Paint, x: Float, y: Float, size: Float)
}