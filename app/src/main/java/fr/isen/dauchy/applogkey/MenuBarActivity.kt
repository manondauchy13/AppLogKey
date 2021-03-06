package fr.isen.dauchy.applogkey

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import fr.isen.dauchy.applogkey.accueil.AccueilActivity
import fr.isen.dauchy.applogkey.accueil.MaReservationActivity
import fr.isen.dauchy.applogkey.accueil.MonCompteActivity
import fr.isen.dauchy.applogkey.accueil.NotificationsActivity

class MenuBarActivity : AppCompatActivity() {
    lateinit var bellButton : ImageView
    lateinit var bagButton : ImageView
    lateinit var homeButton : ImageView
    lateinit var userButton : ImageView
    lateinit var menuButton : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_bar)
        bellButton = findViewById(R.id.bell)
        bagButton = findViewById(R.id.bag)
        homeButton = findViewById(R.id.house)
        userButton = findViewById(R.id.user)
        menuButton = findViewById(R.id.menu)

        val intent1 = Intent(this, NotificationsActivity::class.java)
        bellButton.setOnClickListener {
            startActivity(intent1)
        }


        val intent2 = Intent(this, MaReservationActivity::class.java)
        bagButton.setOnClickListener {
            startActivity(intent2)
        }

        val intent3 = Intent(this, AccueilActivity::class.java)
        homeButton.setOnClickListener {
            startActivity(intent3)
        }


        val intent4 = Intent(this, MonCompteActivity::class.java)
        userButton.setOnClickListener {
            startActivity(intent4)
        }

        val intent5 = Intent(this, NotificationsActivity::class.java)
        menuButton.setOnClickListener {
            startActivity(intent5)
        }
    }
}