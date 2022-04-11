package fr.isen.preynat.application_elisa


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import fr.isen.preynat.application_elisa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Déclaration de bouton
    lateinit var boutonVersMenuRestaurant : Button
    lateinit var boutonVersMenuPetitDej: Button
    lateinit var boutonVersMenuBar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialisation
        boutonVersMenuRestaurant = findViewById(R.id.icone_menuRestaurant)
        boutonVersMenuPetitDej = findViewById(R.id.icone_menuPetitDej)
        boutonVersMenuBar = findViewById(R.id.icone_menuBar)

        //envoi intent
        val intentVersMenuRestaurant : Intent =  Intent(this,MenuRestaurant::class.java)
        val intentVersMenuPetitDej : Intent = Intent(this,MenuPetitDej::class.java)
        val intentVersMenuBar : Intent = Intent(this, MenuBar::class.java)

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