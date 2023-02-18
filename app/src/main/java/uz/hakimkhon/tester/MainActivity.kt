package uz.hakimkhon.tester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hakimkhon.tester.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnLesson1.setOnClickListener {
            val intent = Intent(this, Lesson1::class.java)
            startActivity(intent)
        }

        viewBinding.btnHomework1.setOnClickListener {
            val intent = Intent(this, Homework1::class.java)
            startActivity(intent)
        }
    }

}
