package com.example.animaciones

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

class FadeSlideAnimation {

    fun mostrarVistaConAnimacion(vista: View) {
        val fadeIn = ObjectAnimator.ofFloat(vista, "alpha", 0f, 1f)
        val moverArriba = ObjectAnimator.ofFloat(vista, "translationY", 100f, 0f)

        val animacion = AnimatorSet()
        animacion.playTogether(fadeIn, moverArriba)
        animacion.duration = 1200
        animacion.start()
    }
}
