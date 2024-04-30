package com.example.restaurant_poli.ui.contacto

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.restaurant_poli.R
import com.example.restaurant_poli.ui.web.webActivity

class contactoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contacto)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val linkNavigate = findViewById<TextView>(R.id.openWeb)
        linkNavigate.setOnClickListener{navigateToWeb()}
    }

    private fun navigateToWeb() {
        val intent = Intent(this, webActivity::class.java);
        startActivity(intent);
    }
}