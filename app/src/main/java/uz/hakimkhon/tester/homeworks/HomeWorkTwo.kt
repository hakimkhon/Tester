package uz.hakimkhon.tester.homeworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import uz.hakimkhon.tester.R

class HomeWorkTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_work_two)
    }

//    fun onImageSelected(view: View){
//        val image = view as ImageView
//        val tag = image.tag.toString().toInt()
//        val intent = Intent(this, HomeWorkTwoDetail::class.java)
//        intent.putExtra("imgId", tag)
//        startActivity(intent)
//    }
}