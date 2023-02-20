package uz.hakimkhon.tester.data

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hakimkhon.tester.R
import uz.hakimkhon.tester.databinding.ActivityLesson22Binding

class Lesson2_2 : AppCompatActivity() {

    val dataImages = DataImages()
    val listOfImage = dataImages.getImagesList()

    private lateinit var viewBinding: ActivityLesson22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityLesson22Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        val index = intent.getIntExtra("imageId", 0)
        viewBinding.imgResult.setImageResource(listOfImage[index])
    }

}