package fr.isen.dauchy.applogkey

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MenuPressingActivity : AppCompatActivity() {

    lateinit var boutonValidationCommandePressing: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pressing_service)
        boutonValidationCommandePressing = findViewById(R.id.validationCommandePressing)

        boutonValidationCommandePressing.setOnClickListener {
            Toast.makeText(applicationContext,"Votre commande a été validée.", Toast.LENGTH_SHORT).show()
        }
    }
}