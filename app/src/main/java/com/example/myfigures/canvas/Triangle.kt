package com.example.myfigures.canvas

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path

class Triangle : Shape {
    override fun draw(canvas: Canvas, paint: Paint, x: Float, y: Float, size: Float) {
        val path = Path()
        path.moveTo(x, y)
        path.lineTo(x + size, y) // Lado derecho
        path.lineTo(x + size / 2, y - size) // Lado izquierdo
        path.close() // Cerrar el triángulo
        canvas.drawPath(path, paint)
    }
}