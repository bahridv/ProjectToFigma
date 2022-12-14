package com.bahri.projecttofigma

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bahri.projecttofigma.adapter.ItemAdapter
import com.bahri.projecttofigma.databinding.FragmentGraficBinding
import com.bahri.projecttofigma.model.DataItem

class GraficFragment : Fragment() {

    private lateinit var itemAdapter: ItemAdapter
    private var _binding: FragmentGraficBinding? = null

    private val binding get() = _binding!!

    private val dataDummy = arrayListOf(
        DataItem(
            R.drawable.ellipse_11,
            "Spotify Subscription",
            "Entertainment",
            "10.14 AM",
            "-$9.99"
        ),
        DataItem(
            R.drawable.diana,
            "Dyana",
            "Gift",
            "10.14 AM",
            "+$9.99"
        ),
        DataItem(
            R.drawable.steam,
            "Steam",
            "Entertainment",
            "10.14 AM",
            "-$9.99"
        ),
        DataItem(
            R.drawable.marline,
            "Marline",
            "Gift",
            "10.14 AM",
            "+$9.99"
        ),
        DataItem(
            R.drawable.ellipse_11,
            "Spotify Subscription",
            "Entertainment",
            "10.14 AM",
            "-$9.99"
        ),
        DataItem(
            R.drawable.diana,
            "Dyana",
            "Gift",
            "10.14 AM",
            "+$9.99"
        ),
        DataItem(
            R.drawable.steam,
            "Steam",
            "Entertainment",
            "10.14 AM",
            "-$9.99"
        ),
        DataItem(
            R.drawable.marline,
            "Marline",
            "Gift",
            "10.14 AM",
            "+$9.99"
        ),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGraficBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        itemAdapter = ItemAdapter(requireContext())
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