package com.vaibhavmojidra.demokotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var EmailTB:EditText;
    private lateinit var PassTB:EditText;
    private lateinit var LoginB:Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EmailTB = findViewById(R.id.EmailTB)
        PassTB = findViewById(R.id.PassTB)
        LoginB = findViewById(R.id.Login)
        if (FirebaseAuth.getInstance().getCurrentUser()!= null) {
            startActivity(Intent(this@MainActivity,SendNotif::class.java))
        }else{
            LoginB.setOnClickListener(View.OnClickListener {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(EmailTB.text.toString().trim(), PassTB.text.toString().trim()).addOnSuccessListener {
                    startActivity(Intent(this@MainActivity,SendNotif::class.java))
                }
            })
        }
    }
}
