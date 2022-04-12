package fr.isen.dauchy.applogkey

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MesServicesMenuActivity : AppCompatActivity() {

    lateinit var boutonVersRoomService: Button
    lateinit var boutonVersPressing: Button
    lateinit var boutonVersTaxi: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mes_services_menu)
        //initialisation
        boutonVersRoomService = findViewById(R.id.icone_roomService)
        boutonVersPressing = findViewById(R.id.icone_pressing)
        boutonVersTaxi = findViewById(R.id.icone_taxi)


        //envoi intent
        val intentVersRoomService : Intent =  Intent(this,MenuRoomServiceActivity::class.java)
        val intentVersPressing : Intent =  Intent(this,MenuPressingActivity::class.java)
        val intentVersTaxi : Intent =  Intent(this,MenuTaxiActivity::class.java)


        //clic bouton
        boutonVersRoomService.setOnClickListener {
            startActivity(intentVersRoomService)
        }
        boutonVersPressing.setOnClickListener {
            startActivity(intentVersPressing)
        }
        boutonVersTaxi.setOnClickListener {
            startActivity(intentVersTaxi)
        }
    }
}