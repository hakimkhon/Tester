package uz.hakimkhon.tester.lessons.lesson_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import uz.hakimkhon.tester.databinding.ActivityLessonTwoBinding

class LessonTwo : AppCompatActivity() {
    private lateinit var viewBinding: ActivityLessonTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityLessonTwoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
    }

    fun onImageSelected(view: View){
        val image = view as ImageView
        val tag = image.tag.toString().toInt()

        val intent = Intent(applicationContext, LessonTwoDetail::class.java)
        val putExtra = intent.putExtra("imageId", tag)
        startActivity(putExtra)
    }
}