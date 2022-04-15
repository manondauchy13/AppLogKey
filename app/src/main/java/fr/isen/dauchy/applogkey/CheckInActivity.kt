package fr.isen.dauchy.applogkey

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import fr.isen.dauchy.applogkey.accueil.AccueilActivity

class CheckInActivity : AppCompatActivity() {
     lateinit var boutonOpeningMsg : Button
    lateinit var accueiBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_in)

        boutonOpeningMsg = findViewById(R.id.checkIn)
        val fm = supportFragmentManager
        val openingLocker = OpeningLockerActivity()

        boutonOpeningMsg.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                openingLocker.show(fm, "game")
            }
        })

        accueiBtn = findViewById(R.id.accueilBtn)
        val intent = Intent(this, AccueilActivity::class.java)

        accueiBtn.setOnClickListener{
            startActivity(intent)
        }



    }
}