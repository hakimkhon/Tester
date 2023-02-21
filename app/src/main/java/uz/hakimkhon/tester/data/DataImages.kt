package uz.hakimkhon.tester.data

import uz.hakimkhon.tester.R

class DataImages {
    private val list: List<Pair<Int, String>> = listOf(
        Pair(R.drawable.img0_trekker, "Trekker"),
        Pair(R.drawable.img1_malibu, "Malibu"),
        Pair(R.drawable.img2_gentra, "Gentra"),
        Pair(R.drawable.img3_cobalt, "Cobalt"),
        Pair(R.drawable.img4_onix, "Onix"),
        Pair(R.drawable.img5_damas, "Damas"),
        Pair(R.drawable.img6_matiz, "Matiz"),
        Pair(R.drawable.img7_nexia, "Nexia")
    )
    fun getImagesList(): List<Pair<Int, String>> = list
}