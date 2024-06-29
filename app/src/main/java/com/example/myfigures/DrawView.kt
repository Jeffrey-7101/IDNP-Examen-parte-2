package com.example.myfigures

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
import com.example.myfigures.canvas.ShapeDrawer

class DrawView(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {

    private val paint = Paint()
    private val shapeDrawer = ShapeDrawer()
    private var currentY = 200f
    private val size = 100f

    init {
        paint.color = Color.BLACK
        paint.style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        shapeDrawer.drawAllShapes(canvas, paint, currentY, size)
    }

    fun addShape() {
        shapeDrawer.addNextShape(currentY, size)
        invalidate() // Llama a onDraw() para redibujar todas las formas
    }

    fun reset() {
        shapeDrawer.reset()
        invalidate() // Llama a onDraw() para limpiar y reiniciar el dibujo
    }
}


