package com.example.myfigures.canvas

import android.graphics.Canvas
import android.graphics.Paint

class ShapeDrawer {
    private val shapes = listOf(Triangle(), Square())
    private var currentShapeIndex = 0
    private val drawnShapes = mutableListOf<Pair<Shape, Float>>() // Lista de pares (forma, posición X)
    private var currentX = 50f // Posición X inicial
    private val spacing = 10f // Espaciado entre formas

    fun addNextShape(y: Float, size: Float) {
        if (currentShapeIndex < shapes.size) {
            val shape = shapes[currentShapeIndex]
            drawnShapes.add(Pair(shape, currentX)) // Añadir la forma y su posición a la lista
            currentX += size + spacing // Actualiza la posición X para la siguiente forma
            currentShapeIndex++
        }
    }

    fun drawAllShapes(canvas: Canvas, paint: Paint, y: Float, size: Float) {
        for ((shape, x) in drawnShapes) {
            shape.draw(canvas, paint, x, y, size)
        }
    }

    fun reset() {
        drawnShapes.clear()
        currentShapeIndex = 0
        currentX = 50f
    }
}

