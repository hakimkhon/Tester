package uz.hakimkhon.tester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hakimkhon.tester.databinding.ActivityHomeWorkBinding

class HomeWork : AppCompatActivity() {
    private lateinit var viewBinding: ActivityHomeWorkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityHomeWorkBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

    }
}