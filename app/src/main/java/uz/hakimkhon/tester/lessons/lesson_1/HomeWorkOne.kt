package uz.hakimkhon.tester.lessons.lesson_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hakimkhon.tester.databinding.ActivityHomeWorkOneBinding

class HomeWorkOne : AppCompatActivity() {
    private lateinit var viewBinding: ActivityHomeWorkOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityHomeWorkOneBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

    }
}