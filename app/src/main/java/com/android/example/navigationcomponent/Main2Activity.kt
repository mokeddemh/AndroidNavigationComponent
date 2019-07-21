package com.android.example.navigationcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        navController = findNavController(R.id.navHostFragment)
        setSupportActionBar(toolbar)
        NavigationUI.setupActionBarWithNavController(this,navController,drawerLayout)
        NavigationUI.setupWithNavController(nav_view,navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        navController = findNavController(R.id.navHostFragment)
        return NavigationUI.navigateUp(navController,drawerLayout)
    }


}
