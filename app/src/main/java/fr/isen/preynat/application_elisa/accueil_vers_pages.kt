package fr.isen.preynat.application_elisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class accueil_vers_pages : AppCompatActivity() {

    lateinit var boutonVersRestauration : Button
    lateinit var boutonVersMonCompte : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accueil_vers_pages)

        //initialisation
        boutonVersRestauration = findViewById(R.id.btn_vers_restauration)
        boutonVersMonCompte = findViewById(R.id.btn_vers_compte)


        //envoi intent
        val intentVersRestauration : Intent =  Intent(this,MainActivity::class.java)
        val intentVersCompte : Intent =  Intent(this,MonCompte::class.java)


        //clic bouton
        boutonVersRestauration.setOnClickListener {
            startActivity(intentVersRestauration)
        }
        boutonVersMonCompte.setOnClickListener {
            startActivity(intentVersCompte)
        }

    }
}