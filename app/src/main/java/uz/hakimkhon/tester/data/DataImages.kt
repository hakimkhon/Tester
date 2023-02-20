package uz.hakimkhon.tester.data

import uz.hakimkhon.tester.R

class DataImages {
    private val list: List<Int> = mutableListOf(
        R.drawable.img0_trekker,
        R.drawable.img1_malibu,
        R.drawable.img2_gentra,
        R.drawable.img3_cobalt,
        R.drawable.img4_onix,
        R.drawable.img5_damas,
        R.drawable.img6_matiz,
        R.drawable.img7_nexia,
    )
    fun getImagesList(): List<Int> = list
}