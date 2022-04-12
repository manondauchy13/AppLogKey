package fr.isen.dauchy.applogkey.accueil

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import fr.isen.dauchy.applogkey.*

class MonCompteActivity : AppCompatActivity() {
    lateinit var boutonVersInfosPersonnelles: TextView
    lateinit var boutonVersDocumentsDeVoyage: TextView
    lateinit var boutonVersChangementDeMotDePasse: TextView
    lateinit var boutonVersMesMoyensDePaiement: TextView
    lateinit var boutonVersMaFacture: TextView
    lateinit var boutonVersSuivreMesCommandesEnCours: TextView
    lateinit var boutonVersVoirMesCommandesTerminees: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mon_compte)
        boutonVersInfosPersonnelles = findViewById(R.id.informationsPersonnelles)
        boutonVersDocumentsDeVoyage = findViewById(R.id.documentsVoyage)
        boutonVersMesMoyensDePaiement = findViewById(R.id.mesMoyensDePaiement)
        boutonVersChangementDeMotDePasse= findViewById(R.id.changementMDP)
        boutonVersMaFacture= findViewById(R.id.maFacture)
        boutonVersSuivreMesCommandesEnCours= findViewById(R.id.suivreMesCommandes)
        boutonVersVoirMesCommandesTerminees= findViewById(R.id.commandesTerminees)



        val intentVersInfosPersonnelles: Intent = Intent(this, InformationsPersonnellesActivity::class.java)
        val intentVersDocumentsDeVoyage: Intent = Intent(this, DocumentsDeVoyageActivity::class.java)
        val intentVersMesMoyensDePaiement: Intent = Intent(this, MesMoyensDePaiementActivity::class.java)
        val intentVersMaFacture: Intent = Intent(this, MaFactureActivity::class.java)
        val intentVersMesCommandesEnCours: Intent = Intent(this, MesCommandesEnCoursActivity::class.java)
        val intentVersCommandesTerminees: Intent = Intent(this, MesCommandesTermineesActivity::class.java)

        boutonVersInfosPersonnelles.setOnClickListener {
            startActivity(intentVersInfosPersonnelles)
        }
        boutonVersDocumentsDeVoyage.setOnClickListener {
            startActivity(intentVersDocumentsDeVoyage)
        }
        boutonVersMesMoyensDePaiement.setOnClickListener {
            startActivity(intentVersMesMoyensDePaiement)
        }
        boutonVersChangementDeMotDePasse.setOnClickListener {
            Toast.makeText(applicationContext,"Option indisponible pour le moment.", Toast.LENGTH_SHORT).show()
        }
        boutonVersMaFacture.setOnClickListener {
            startActivity(intentVersMaFacture)
        }
        boutonVersSuivreMesCommandesEnCours.setOnClickListener {
            startActivity(intentVersMesCommandesEnCours)
        }
        boutonVersVoirMesCommandesTerminees.setOnClickListener {
            startActivity(intentVersCommandesTerminees)
        }
    }
}