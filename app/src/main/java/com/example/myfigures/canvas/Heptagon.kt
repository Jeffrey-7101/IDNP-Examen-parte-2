package com.example.myfigures.canvas

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path

class Heptagon : Shape {
    override fun draw(canvas: Canvas, paint: Paint, x: Float, y: Float, size: Float) {
        val path = Path()
        val angle = (2.0 * Math.PI / 7).toFloat()
        path.moveTo(x + size, y)
        for (i in 1..6) {
            path.lineTo(
                (x + size * Math.cos(i * angle.toDouble())).toFloat(),
                (y - size * Math.sin(i * angle.toDouble())).toFloat()
            )
        }
        path.close()
        canvas.drawPath(path, paint)
    }
}