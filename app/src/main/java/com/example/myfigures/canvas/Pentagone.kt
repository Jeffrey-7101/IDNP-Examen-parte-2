package com.example.myfigures.canvas

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path

class Pentagone : Shape {
    override fun draw(canvas: Canvas, paint: Paint, x: Float, y: Float, size: Float) {
        // Crea un nuevo Path para dibujar la forma
        val path = Path()

        // Calcula el angulo entre cada vertice del pentagono
        val angle = (2.0 * Math.PI / 5).toFloat()

        // Mueve el Path al primer vertice del pentágono
        path.moveTo(x + size, y)

        // Dibuja las líneas que conectan los vértices del pentagono
        for (i in 1..4) {
            path.lineTo(
                (x + size * Math.cos(i * angle.toDouble())).toFloat(),
                (y - size * Math.sin(i * angle.toDouble())).toFloat()
            )
        }
        // Cierra el Path para completar el pentagono
        path.close()

        // Dibuja el Path en el Canvas usando la Paint proporcionada
        canvas.drawPath(path, paint)
    }
}