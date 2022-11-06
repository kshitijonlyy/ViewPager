package com.kshitij.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.kshitij.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewPagerRecycler: ViewPagerRecycler
    var layoutArray = arrayOf(
        R.layout.layout_first,
        R.layout.layout_second,
        R.layout.layout_third,
        R.layout.layout_fourth
    )
    lateinit var dotsAdapter: DotsRecycler
    lateinit var layoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewPagerRecycler = ViewPagerRecycler(layoutArray)
        binding.viewPager.adapter = viewPagerRecycler
        dotsAdapter = DotsRecycler(0)
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, true)
        binding.slidePosition.adapter = dotsAdapter
        binding.slidePosition.layoutManager = layoutManager

        binding.viewPager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    dotsAdapter.updatePosition(position)
                }
            })
    }
}