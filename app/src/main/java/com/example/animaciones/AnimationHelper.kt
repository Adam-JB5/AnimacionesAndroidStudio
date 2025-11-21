package com.example.animaciones

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

class AnimationHelper {

    fun animarVista(vista: View) {
        val moverY = ObjectAnimator.ofFloat(vista, "translationY", 0f, -200f, 0f)
        val rotar = ObjectAnimator.ofFloat(vista, "rotation", 0f, 360f)
        val escalarX = ObjectAnimator.ofFloat(vista, "scaleX", 1f, 1.3f, 1f)
        val escalarY = ObjectAnimator.ofFloat(vista, "scaleY", 1f, 1.3f, 1f)

        val animacion = AnimatorSet()
        animacion.playTogether(moverY, rotar, escalarX, escalarY)
        animacion.duration = 1500
        animacion.start()
    }
}
