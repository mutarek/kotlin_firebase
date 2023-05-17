package com.example.loginfirebase.database

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.loginfirebase.MainActivity
import com.google.firebase.auth.FirebaseAuth

class AppDatabase {
    private var  auth: FirebaseAuth
    init {
        auth= FirebaseAuth.getInstance()
    }

}