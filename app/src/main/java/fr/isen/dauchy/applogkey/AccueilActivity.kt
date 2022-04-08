package fr.isen.dauchy.applogkey

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import fr.isen.dauchy.applogkey.databinding.ActivityAccueilBinding


class AccueilActivity : AppCompatActivity() {
         lateinit var clickMaChambre : TextView
         lateinit var clickMaReservation : TextView
         lateinit var clickRestauration : TextView
         lateinit var clickMonHotel : TextView
         lateinit var clickMesServices : TextView
         lateinit var clickMonCompte : TextView
         lateinit var clickFaq : TextView
         lateinit var clickNotifications : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accueil)

        clickMaChambre = findViewById(R.id.buttonChambre)
        clickMaReservation=findViewById(R.id.buttonReservation)
        clickRestauration = findViewById(R.id.buttonRestau)
        clickMonHotel = findViewById(R.id.buttonHotel)
        clickMesServices = findViewById(R.id.buttonServices)
        clickMonCompte = findViewById(R.id.buttonCompte)
        clickFaq = findViewById(R.id.buttonFaq)
        clickNotifications = findViewById(R.id.buttonNotifications)

        val chambreIntent : Intent =  Intent(this,MaChambreActivity::class.java)
        clickMaChambre.setOnClickListener {
            startActivity(chambreIntent)
        }
        val reservationIntent : Intent =  Intent(this,MaReservationActivity::class.java)
        clickMaReservation.setOnClickListener {
            startActivity(reservationIntent)
        }
        val restauIntent : Intent =  Intent(this,RestaurationActivity::class.java)
       clickRestauration.setOnClickListener {
            startActivity(restauIntent)
        }
        val hotelIntent : Intent =  Intent(this,MonHotelActivity::class.java)
        clickMonHotel.setOnClickListener {
            startActivity(hotelIntent)
        }

        val servicesIntent : Intent =  Intent(this,MesServicesActivity::class.java)
        clickMesServices.setOnClickListener {
            startActivity(servicesIntent)
        }
        val compteIntent : Intent =  Intent(this,MonCompteActivity::class.java)
        clickMonCompte.setOnClickListener {
            startActivity(compteIntent)
        }
        val faqIntent : Intent =  Intent(this,FaqActivity::class.java)
        clickFaq.setOnClickListener {
            startActivity(faqIntent)
        }
        val notificationsIntent : Intent =  Intent(this,NotificationsActivity::class.java)
        clickNotifications.setOnClickListener {
            startActivity(notificationsIntent)
        }



    }

}