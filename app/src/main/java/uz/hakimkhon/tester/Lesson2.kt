package uz.hakimkhon.tester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Images
import android.view.View
import android.widget.ImageView
import uz.hakimkhon.tester.data.DataImages
import uz.hakimkhon.tester.databinding.ActivityLesson2Binding

class Lesson2 : AppCompatActivity() {
    val dataImages = DataImages()
    val listOfImage = dataImages.getImagesList()
    private lateinit var viewBinding: ActivityLesson2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityLesson2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
    }

    fun onImageSelected(view: View){
        val image = view as ImageView
        val tag = view.tag.toString().toInt()

    }
}