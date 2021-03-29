package com.example.mysubmission1jetpack.ui.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mysubmission1jetpack.databinding.FragmentTvshowBinding
import com.example.mysubmission1jetpack.ui.viewmodel.ViewModelFactory


class TvshowFragment : Fragment() {

    lateinit var fragmentTvshowBinding: FragmentTvshowBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentTvshowBinding = FragmentTvshowBinding.inflate(inflater, container, false)
        return fragmentTvshowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null){
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvshowViewModel::class.java]
            val tvshow = viewModel.getTvshow()
            val adapter = TvshowAdapter()

            fragmentTvshowBinding.progressBar.visibility = View.VISIBLE
            viewModel.getTvshow().observe(this, { tvshow ->
                fragmentTvshowBinding.progressBar.visibility = View.GONE
                adapter.setTvshow(tvshow)
                adapter.notifyDataSetChanged()
            })

            with(fragmentTvshowBinding.rvTvshow){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }
}

