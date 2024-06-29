package com.example.myfigures.canvas

import android.graphics.Canvas
import android.graphics.Paint

class Square : Shape {
    override fun draw(canvas: Canvas, paint: Paint, x: Float, y: Float, size: Float) {
        canvas.drawRect(x, y - size, x + size, y, paint) // Dibuja un cuadrado
    }
}
