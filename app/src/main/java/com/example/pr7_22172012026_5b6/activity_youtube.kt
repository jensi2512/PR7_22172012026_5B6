package com.example.pr7_22172012026_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.core.view.WindowCompat
import com.example.pr7_22172012026_5b6.databinding.ActivityYoutubeBinding

class activity_youtube : AppCompatActivity() {
    private lateinit var binding:ActivityYoutubeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)
        binding=ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        webviewert()
        binding.btn.setOnClickListener{
            Intent(this,MainActivity::class.java)
        }
    }
    private val ytid="watch?v=ebfV2J4lso4"
    private fun webviewert(){
        val webSettings:WebSettings=binding.webview.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        binding.webview.loadUrl("https://m.youtube.com/$ytid")
    }
}