package uz.hakimkhon.tester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Images
import android.view.View
import android.widget.ImageView
import uz.hakimkhon.tester.data.DataImages
import uz.hakimkhon.tester.data.Lesson2_2
import uz.hakimkhon.tester.databinding.ActivityLesson2Binding

class Lesson2 : AppCompatActivity() {
    private lateinit var viewBinding: ActivityLesson2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityLesson2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
    }

    fun onImageSelected(view: View){
        val image = view as ImageView
        val tag = image.tag.toString().toInt()

        val intent = Intent(applicationContext, Lesson2_2::class.java)
        intent.putExtra("imageId", tag)
        startActivity(intent)
    }
}