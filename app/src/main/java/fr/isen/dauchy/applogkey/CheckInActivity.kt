package fr.isen.dauchy.applogkey

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CheckInActivity : AppCompatActivity() {
     lateinit var boutonOpeningMsg : Button

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




    }
}