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
        val opacidad = ObjectAnimator.ofFloat(vista, "alpha", 1f, 0f, 1f)

        //La animacion no dejara de reproducirse
        rotar.repeatCount = ObjectAnimator.INFINITE

        val animacion = AnimatorSet()
        animacion.playTogether(moverY, rotar, escalarX, escalarY, opacidad)
        animacion.duration = 3000
        animacion.start()
    }
}
