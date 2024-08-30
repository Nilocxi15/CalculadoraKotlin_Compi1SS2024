package com.example.calculadorakotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadorakotlin.analyzers.L_Analyzer
import com.example.calculadorakotlin.analyzers.S_Analyzer
import java.io.StringReader

class MainActivity : AppCompatActivity() {

    var textContent: EditText? = null
    var bttnClicked: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        textContent = findViewById(R.id.content)
        bttnClicked = findViewById(R.id.calculateBttn)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bttnClicked?.setOnClickListener {
            getText()
        }
    }

    private fun getText(){
        val contentString = textContent?.text.toString()

        val reader = StringReader(contentString)
        try {
            val lexic: L_Analyzer = L_Analyzer(reader)
            val parser: S_Analyzer = S_Analyzer(lexic)
            parser.parse()

            if (parser.resultado == null) {
                Toast.makeText(this, "Expresión incorrecta. VERIFICAR", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "El resultado es: ${parser.resultado}", Toast.LENGTH_LONG).show()
            }

        } catch (e: Exception) {
            Toast.makeText(this, "Exprexión incorrecta. VERIFICAR", Toast.LENGTH_LONG).show()
        }
    }
}