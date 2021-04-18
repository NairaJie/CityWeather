package com.nailah.cityweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils.loadAnimation
import com.google.android.material.animation.AnimationUtils
import com.nailah.cityweather.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
         supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        val animCloud = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.splash_cloud)
        val animSun = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.splash_sun)

        binding.ivCloudSplash.animation = animCloud
        binding.ivSun.animation = animSun
        object : CountDownTimer(3600,200){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {

            }
        }.start()

        super.onResume()
    }
}