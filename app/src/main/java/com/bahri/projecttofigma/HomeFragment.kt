package com.bahri.projecttofigma

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bahri.projecttofigma.adapter.ItemAdapter
import com.bahri.projecttofigma.databinding.FragmentHomeBinding
import com.bahri.projecttofigma.model.DataItem

class HomeFragment : Fragment() {

    private lateinit var itemAdapter: ItemAdapter
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val dataDummy = arrayListOf(
        DataItem(
            R.drawable.ellipse_11,
            "Spotify Subscription",
            "Entertaiment",
            "$-9.99",
            "10.14 AM"

        ),

        DataItem(
            R.drawable.diana,
            "Dyana",
            "Gift",
            "$-9.99",
            "10.14 AM"
        ),

        DataItem(
            R.drawable.steam,
            "Steam",
            "entertaiment",
            "$-9.99",
            "10.14 AM"
        ),

        DataItem(
            R.drawable.marline,
            "Marline",
            "Gift",
            "$-9.99",
            "10.14 AM"
        ),
        DataItem(
            R.drawable.ellipse_11,
            "Spotify Subscription",
            "Entertaiment",
            "$-9.99",
            "10.14 AM"

        ),

        DataItem(
            R.drawable.diana,
            "Dyana",
            "Gift",
            "$-9.99",
            "10.14 AM"
        ),

        DataItem(
            R.drawable.steam,
            "Steam",
            "entertaiment",
            "$-9.99",
            "10.14 AM"
        ),

        DataItem(
            R.drawable.marline,
            "Marline",
            "Gift",
            "$-9.99",
            "10.14 AM"
        ),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.transfer.setOnClickListener {
            val b = Intent(this@HomeFragment.requireContext(),TopupActivity::class.java)
            startActivity(b)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        itemAdapter = context?.let { ItemAdapter(it) }!!
        binding.rvList.apply {
            setHasFixedSize(true)
            layoutManager =  object : LinearLayoutManager(requireContext()) {
                override fun canScrollVertically(): Boolean {
                    return false
                }
            }
            adapter = itemAdapter
        }

        itemAdapter.setData(dataDummy)

    }
}