package uz.hakimkhon.tester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.ViewBinding
import uz.hakimkhon.tester.databinding.ActivityLesson1Binding

class Lesson1 : AppCompatActivity() {
    private lateinit var viewBinding: ActivityLesson1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityLesson1Binding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.buttonOrtga.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}