package com.example.myfigures.canvas

import android.graphics.Canvas
import android.graphics.Paint

class ShapeDrawer {
    private val drawnShapes = mutableListOf<Pair<RegularPolygon, Float>>() // Lista de pares (figura, posición X)
    private var currentX = 30f // Posición X inicial
    private val initialSpacing = 40f // Espaciado inicial entre la primera figura y el borde

    fun addNextShape(y: Float) {
        val sides = drawnShapes.size + 3 // Número de lados comenzando desde el triángulo
        val size = 90f
        val shape = RegularPolygon(sides)
        drawnShapes.add(Pair(shape, currentX)) // Añade la figura y su posición a la lista
        currentX += calculateSpacing(size) // Actualiza la posición X para la siguiente figura
    }

    fun drawAllShapes(canvas: Canvas, paint: Paint, y: Float, size: Float) {
        for ((shape, x) in drawnShapes) {
            shape.draw(canvas, paint, x, y, size)
        }
    }

    fun reset() {
        drawnShapes.clear()
        currentX = initialSpacing // Reinicia la posición inicial X al espaciado inicial
    }

    private fun calculateSpacing(size: Float): Float {
        return size + initialSpacing // Espacia igual al tamaño de la figura más el espaciado inicial
    }
}







