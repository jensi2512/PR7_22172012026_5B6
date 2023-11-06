package com.example.pr7_22172012026_5b6

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import androidx.core.view.WindowCompat
import com.example.pr7_22172012026_5b6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initYoutubePlayer()
        binding.btn.setOnClickListener{
           Intent(this,activity_youtube::class.java)
        }
    }
    private fun initYoutubePlayer(){
        val mediaController=MediaController(this)
        val uri:Uri= Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        binding.videoView.setMediaController(mediaController)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setVideoURI(uri)
        binding.videoView.requestFocus()
        binding.videoView.start()
    }
}
