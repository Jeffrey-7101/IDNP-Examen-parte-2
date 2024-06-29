package com.example.myfigures.canvas

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path

class RegularPolygon(private val lados: Int) {

    fun draw(canvas: Canvas, paint: Paint, x: Float, y: Float, size: Float) {
        val path = Path() // Crea un objeto de la clase Path para dibujar lineas
        val radius = size / (2 * Math.sin(Math.PI / lados)) // Asegura un tamaño en comun de los lados
        val angle = 2.0 * Math.PI / lados

        // Mueve al primer vertice
        val startX = (x + radius * Math.cos(0.0)).toFloat()
        val startY = (y - radius * Math.sin(0.0)).toFloat()
        path.moveTo(startX, startY)

        // Dibuja los vertices del poligono
        for (i in 1 until lados) {
            val nextX = (x + radius * Math.cos(angle * i)).toFloat()
            val nextY = (y - radius * Math.sin(angle * i)).toFloat()
            path.lineTo(nextX, nextY)
        }

        // Completa el poligono
        path.close()

        // Dibuja el poligono en el canvas
        canvas.drawPath(path, paint)
    }
}
