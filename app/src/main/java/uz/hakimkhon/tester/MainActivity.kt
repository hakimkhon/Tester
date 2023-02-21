package uz.hakimkhon.tester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hakimkhon.tester.databinding.ActivityMainBinding
import uz.hakimkhon.tester.homeworks.HomeWork
import uz.hakimkhon.tester.homeworks.HomeWorkTwo
import uz.hakimkhon.tester.lessons.Lesson1
import uz.hakimkhon.tester.lessons.Lesson2

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
            val intent = Intent(this, HomeWork::class.java)
            startActivity(intent)
        }
        viewBinding.btnLesson2.setOnClickListener {
            val intent = Intent(this, Lesson2::class.java)
            startActivity(intent)
        }

        viewBinding.btnHomework2.setOnClickListener {
            val intent = Intent(this, HomeWorkTwo::class.java)
            startActivity(intent)
        }
    }

}
