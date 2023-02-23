package uz.hakimkhon.tester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hakimkhon.tester.databinding.ActivityMainBinding
import uz.hakimkhon.tester.lessons.lesson_1.HomeWorkOne
import uz.hakimkhon.tester.lessons.lesson_2.HomeWorkTwo
import uz.hakimkhon.tester.lessons.lesson_1.LessonOne
import uz.hakimkhon.tester.lessons.lesson_2.LessonTwo
import uz.hakimkhon.tester.lessons.lesson_3.HomeWorkThree
import uz.hakimkhon.tester.lessons.lesson_3.LessonThree

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnLesson1.setOnClickListener {
            val intent = Intent(this, LessonOne::class.java)
            startActivity(intent)
        }

        viewBinding.btnHomework1.setOnClickListener {
            val intent = Intent(this, HomeWorkOne::class.java)
            startActivity(intent)
        }

        viewBinding.btnLesson2.setOnClickListener {
            val intent = Intent(this, LessonTwo::class.java)
            startActivity(intent)
        }

        viewBinding.btnHomework2.setOnClickListener {
            val intent = Intent(this, HomeWorkTwo::class.java)
            startActivity(intent)
        }

        viewBinding.btnLesson3.setOnClickListener {
            val intent = Intent(this, LessonThree::class.java)
            startActivity(intent)
        }

        viewBinding.btnHomework3.setOnClickListener {
            val intent = Intent(this, HomeWorkThree::class.java)
            startActivity(intent)
        }
    }

}
