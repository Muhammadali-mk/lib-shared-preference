package uz.muhammadali.mk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.muhammadali.lib_shared_preference.PrefTestClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PrefTestClass.show(this)
    }
}