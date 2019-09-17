package com.krungsri.shimmertest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.shimmer.Shimmer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// https://stackoverflow.com/questions/55350972/android-vertical-shimmer
		val builder = Shimmer.AlphaHighlightBuilder()
		builder.setDuration(1400)
		builder.setAutoStart(true)
		builder.setBaseAlpha(0.6f)
		builder.setHighlightAlpha(0.2f)
		builder.setIntensity(.3f)
		builder.setDirection(Shimmer.Direction.TOP_TO_BOTTOM)
		shimmerView.setShimmer(builder.build())
	}

}
