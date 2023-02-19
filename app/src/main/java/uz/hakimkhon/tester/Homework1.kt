package uz.hakimkhon.tester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hakimkhon.tester.databinding.ActivityHomework1Binding

class Homework1 : AppCompatActivity() {
    private lateinit var viewBinding: ActivityHomework1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityHomework1Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

//        viewBinding.btnBack.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
    }
}