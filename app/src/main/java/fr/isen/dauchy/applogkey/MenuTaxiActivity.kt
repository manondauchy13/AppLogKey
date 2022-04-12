package fr.isen.dauchy.applogkey

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

lateinit var boutonTelephoneTaxi: ImageView

class MenuTaxiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_taxi)

        boutonTelephoneTaxi = findViewById(R.id.icone_telephone)

        boutonTelephoneTaxi.setOnClickListener {
            call(boutonTelephoneTaxi)
        }

    }
    fun call(view: View) {
        val telephoneIntent = Intent(Intent.ACTION_DIAL)
        telephoneIntent.data = Uri.parse("tel:" + "33672240680")
        startActivity(telephoneIntent)
    }

}
