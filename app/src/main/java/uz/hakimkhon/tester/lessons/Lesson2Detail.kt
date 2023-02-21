package uz.hakimkhon.tester.lessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hakimkhon.tester.data.DataImages
import uz.hakimkhon.tester.databinding.ActivityLesson2DetailBinding

class Lesson2Detail : AppCompatActivity() {

    val dataImages = DataImages()
    val listOfImage = dataImages.getImagesList()

    private lateinit var viewBinding: ActivityLesson2DetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityLesson2DetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        val index = intent.getIntExtra("imageId", 0)
        viewBinding.imgResult.setImageResource(listOfImage[index].first)
        viewBinding.textView.text = (listOfImage[index].second)
    }

}
