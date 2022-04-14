package fr.isen.dauchy.applogkey

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BluetoothActivity : AppCompatActivity() {
    lateinit var boutonGoBlePage : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bluetooth)
    print("ble")
        boutonGoBlePage = findViewById(R.id.checkIn)
        val intent = Intent(this, CheckInActivity::class.java)

        boutonGoBlePage.setOnClickListener{
            startActivity(intent)
        }
    }
}