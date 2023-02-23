package uz.hakimkhon.tester.data

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import uz.hakimkhon.tester.data.DataImages

class ImageAdapter(private val contex: Context): PagerAdapter() {
    private val dataImage = DataImages()
    private val images = dataImage.getImagesList()
    override fun getCount(): Int = images.size

    override fun isViewFromObject(view: View, image: Any): Boolean {
        return view == image
    }

   override fun instantiateItem(container: ViewGroup, position: Int): Any {
       val imageView = ImageView(contex)
       imageView.scaleType = ImageView.ScaleType.CENTER_CROP
       imageView.setImageResource(images[position].first)
       container.addView(imageView, 0)
        return imageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, image: Any) {
        container.removeView(image as View)
        super.destroyItem(container, position, image)
    }
}