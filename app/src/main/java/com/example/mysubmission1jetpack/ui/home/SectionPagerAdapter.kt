package com.example.mysubmission1jetpack.ui.home

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.mysubmission1jetpack.R
import com.example.mysubmission1jetpack.ui.academy.MoviesFragment
import com.example.mysubmission1jetpack.ui.tvshow.TvshowFragment

class SectionPagerAdapter(private val mContext: Context, fm: FragmentManager): FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    companion object{
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.movie, R.string.tv_show)
    }

    override fun getCount(): Int = TAB_TITLES.size

    override fun getItem(position: Int): Fragment =
        when(position){
            0 -> MoviesFragment()
            1 -> TvshowFragment()
            else -> Fragment()
        }


    override fun getPageTitle(position: Int): CharSequence? = mContext.resources.getString(TAB_TITLES[position])
}