package fr.isen.dauchy.applogkey

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fr.isen.dauchy.applogkey.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToLogin("")

    }
    private  fun goToLogin(login: String){
        val intent = Intent(this, LoginActivity::class.java)
        intent.putExtra("login", login)
        startActivity(intent)
    }
}
