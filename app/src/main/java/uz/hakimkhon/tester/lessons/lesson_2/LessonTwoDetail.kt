package uz.hakimkhon.tester.lessons.lesson_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hakimkhon.tester.data.DataImages
import uz.hakimkhon.tester.databinding.ActivityLessonTwoBinding

class LessonTwoDetail : AppCompatActivity() {

    val dataImages = DataImages()
    val listOfImage = dataImages.getImagesList()

    private lateinit var viewBinding: ActivityLessonTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityLessonTwoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
//
//        val index = intent.getIntExtra("imageId", 0)
//        viewBinding.imgResult.setImageResource(listOfImage[index].first)
//        viewBinding.textView.text = (listOfImage[index].second)
    }

}
