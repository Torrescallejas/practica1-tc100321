package com.sv.edu.ufg.fis.amb.p3_practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navegacion : NavigationBarView
    private val opcionMenuSeleccionado = NavigationBarView.OnItemSelectedListener {item ->

        when (item.itemId){
            R.id.fragmento1 -> {
                supportFragmentManager.commit {
                    replace<primer_fragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacment")
                }
                return@OnItemSelectedListener true
            }
            R.id.fragmento2 -> {
                supportFragmentManager.commit {
                    replace<segundo_fragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacment")
                }
                return@OnItemSelectedListener true
            }
            R.id.fragmento3 -> {
                supportFragmentManager.commit {
                    replace<tercer_fragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacment")
                }
                return@OnItemSelectedListener true
            }
            R.id.fragmento4 -> {
                supportFragmentManager.commit {
                    replace<cuarto_fragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacment")
                }
                return@OnItemSelectedListener true
            }
        }
        false

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            replace<primer_fragmento>(R.id.fragment_container_view)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }

        navegacion = findViewById(R.id.nav_menu)
        navegacion.setOnItemSelectedListener(opcionMenuSeleccionado)
    }
}