package uz.hakimkhon.tester.lessons.lesson_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hakimkhon.tester.MainActivity
import uz.hakimkhon.tester.databinding.ActivityLessonOneBinding

class LessonOne : AppCompatActivity() {
    private lateinit var viewBinding: ActivityLessonOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityLessonOneBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.buttonOrtga.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}