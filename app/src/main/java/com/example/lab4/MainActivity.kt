package com.example.lab4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.fragment.NavHostFragment
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.ui.navigateUp
import androidx.appcompat.widget.Toolbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.activity.viewModels
class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private val viewModel: DataModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragConteiner) as NavHostFragment
        val navController = navHostFragment.navController
        val drawerLayout: DrawerLayout = findViewById(R.id.drawler)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.categoriesFragment,
                R.id.aboutFragment,
                R.id.settingsFragment,
                R.id.main
            ),
            drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        val navView: NavigationView = findViewById(R.id.nav_view)
        navView.setupWithNavController(navController)
        val bottomNav: BottomNavigationView = findViewById(R.id.bottom_view)
        bottomNav.setupWithNavController(navController)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.drawler)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragConteiner) as NavHostFragment
        val navController = navHostFragment.navController

        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}