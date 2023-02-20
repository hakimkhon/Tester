package uz.hakimkhon.tester.data

import uz.hakimkhon.tester.R

class DataImages {
    private val list: List<Int> = mutableListOf(
        R.drawable.img0_trekker,
        R.drawable.img1_malibu,
        R.drawable.img2_gentra,
        R.drawable.img3_cobalt
    )
    fun getImagesList(): List<Int> = list
}