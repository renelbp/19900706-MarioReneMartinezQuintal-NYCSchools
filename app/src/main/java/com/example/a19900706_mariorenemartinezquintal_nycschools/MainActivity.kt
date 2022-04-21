package com.example.a19900706_mariorenemartinezquintal_nycschools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.a19900706_mariorenemartinezquintal_nycschools.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        drawerLayout = findViewById(R.id.drawer_layout)

        appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(R.id.schoolListFragmet, R.id.satResultsListFragment),
            drawerLayout = drawerLayout
        )
        setupActionBarWithNavController(
            navController = navController,
            configuration = appBarConfiguration
        )
        binding.navigationView.setupWithNavController(navController)
        binding.navigationView.setCheckedItem(navController.graph.startDestinationId)
    }
    override fun onSupportNavigateUp(): Boolean {
        //val navController =findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}