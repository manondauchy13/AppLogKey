package fr.isen.dauchy.applogkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.isen.dauchy.applogkey.accueil.AccueilActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToAccueil("")

    }
    private  fun goToAccueil(accueil: String){
        val intent = Intent(this, AccueilActivity::class.java)
        intent.putExtra("accueil", accueil)
        startActivity(intent)
    }
}
