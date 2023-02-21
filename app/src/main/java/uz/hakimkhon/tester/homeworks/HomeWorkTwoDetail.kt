package uz.hakimkhon.tester.homeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hakimkhon.tester.R
import uz.hakimkhon.tester.data.DataImages
import uz.hakimkhon.tester.databinding.ActivityHomeWorkTwoDetailBinding

class HomeWorkTwoDetail : AppCompatActivity() {
    private lateinit var viewBinding: ActivityHomeWorkTwoDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        val imageView = DataImages()
        val imageList = imageView.getImagesList()
        viewBinding = ActivityHomeWorkTwoDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        val index = intent.getIntExtra("imgId", 0)
        viewBinding.imgResult.setImageResource(imageList[index].first)
    }
}