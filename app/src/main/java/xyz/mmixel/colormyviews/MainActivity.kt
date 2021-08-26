package xyz.mmixel.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import xyz.mmixel.colormyviews.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        val clickableViews: List<View> =
            with(binding) {
                listOf(
                    boxOneText, boxTwoText, boxThreeText,
                    boxFourText, boxFiveText, constraintLayout,
                    redButton, yellowButton, greenButton
                )
            }


        for (item in clickableViews) {
            item.setOnClickListener { makeColor(it) }
        }
    }

    private fun makeColor(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(getResources().getColor(R.color.my_holo_green_light))
            R.id.box_four_text -> view.setBackgroundColor(getResources().getColor(R.color.my_holo_green_dark))
            R.id.box_five_text -> view.setBackgroundColor(getResources().getColor(R.color.my_holo_green_light))
            R.id.red_button -> view.setBackgroundColor(getResources().getColor(R.color.my_red))
            R.id.green_button -> view.setBackgroundColor(getResources().getColor(R.color.my_green))
            R.id.yellow_button -> view.setBackgroundColor(getResources().getColor(R.color.my_yellow))
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}