package com.example.lab5

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    private lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val Selected_Radio = intent.getStringExtra("Selected_Radio")
        val timeValue = intent.getStringExtra("Time")?.toIntOrNull() ?: 0

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        text=findViewById(R.id.textView4)
        var result:Int=0
        when(Selected_Radio){
            "RadioButton1"->{
                result=timeValue*2000
            }
            "RadioButton2"->{
                result=timeValue*2500
            }
            "RadioButton3"->{
                result=timeValue*3500
            }
        }
        text.text=result.toString()
    }
}