package com.example.myfigures.canvas

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path

class RegularPolygon(private val sides: Int) {

    fun draw(canvas: Canvas, paint: Paint, x: Float, y: Float, size: Float) {
        val path = Path()
        val radius = size / (2 * Math.sin(Math.PI / sides))
        val angle = 2.0 * Math.PI / sides

        // Mueve al primer vértice
        val startX = (x + radius * Math.cos(0.0)).toFloat()
        val startY = (y - radius * Math.sin(0.0)).toFloat()
        path.moveTo(startX, startY)

        // Dibuja los vértices del polígono
        for (i in 1 until sides) {
            val nextX = (x + radius * Math.cos(angle * i)).toFloat()
            val nextY = (y - radius * Math.sin(angle * i)).toFloat()
            path.lineTo(nextX, nextY)
        }

        // Cerrar el camino
        path.close()

        // Dibujar el polígono en el canvas
        canvas.drawPath(path, paint)
    }
}
