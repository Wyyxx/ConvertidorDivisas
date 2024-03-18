package mx.edu.utch.convertidormonedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import mx.edu.utch.convertidormonedas.presenter.PCurrencyConversor
import mx.edu.utch.convertidormonedas.view.ConvertView

class MainActivity : AppCompatActivity(), ConvertView {

        private lateinit var presenter: PCurrencyConversor

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            presenter = PCurrencyConversor(this)

            findViewById<Button>(R.id.button_convertir).setOnClickListener {
                val editText = findViewById<EditText>(R.id.editText)
                val pesosString = editText.text.toString()
                val pesos = pesosString.toDoubleOrNull() ?: 0.0
                presenter.convertCurrency(pesos)
            }
        }

        override fun showConversionResult(message: String) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
