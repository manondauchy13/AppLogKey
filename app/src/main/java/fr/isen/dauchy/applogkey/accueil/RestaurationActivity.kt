package fr.isen.dauchy.applogkey.accueil

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import fr.isen.dauchy.applogkey.MenuBarActivity
import fr.isen.dauchy.applogkey.MenuPetitDejActivity
import fr.isen.dauchy.applogkey.MenuRestaurantActivity
import fr.isen.dauchy.applogkey.R

class RestaurationActivity : AppCompatActivity() {
    // Déclaration de bouton
    lateinit var boutonVersMenuRestaurant : Button
    lateinit var boutonVersMenuPetitDej: Button
    lateinit var boutonVersMenuBar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restauration)
        //initialisation
        boutonVersMenuRestaurant = findViewById(R.id.icone_menuRestaurant)
        boutonVersMenuPetitDej = findViewById(R.id.icone_menuPetitDej)
        boutonVersMenuBar = findViewById(R.id.icone_menuBar)

        //envoi intent
        val intentVersMenuRestaurant : Intent =  Intent(this, MenuRestaurantActivity::class.java)
        val intentVersMenuPetitDej : Intent = Intent(this,MenuPetitDejActivity::class.java)
        val intentVersMenuBar : Intent = Intent(this, MenuBarActivity::class.java)

        //clic bouton
        boutonVersMenuRestaurant.setOnClickListener {
            startActivity(intentVersMenuRestaurant)
        }
        boutonVersMenuPetitDej.setOnClickListener {
            startActivity(intentVersMenuPetitDej)
        }

        boutonVersMenuBar.setOnClickListener{
            startActivity(intentVersMenuBar)
        }
    }

    override fun onDestroy(){
        super.onDestroy()

        Log.d("MainActivity","Mon activité est détruite")

    }
}