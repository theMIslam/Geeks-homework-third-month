package com.example.homework3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.homework3_7.databinding.FragmentRikiBinding
import com.example.homework3_7.databinding.ItemRiciBinding


class RikiFragment : Fragment() {
    private val RiciLIst=ArrayList<Parametr>()
    private lateinit var binding: FragmentRikiBinding
    private  lateinit var  item: ItemRiciBinding
    private lateinit var  adapterMusic: RickAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRikiBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        loadData()

         adapterMusic = RickAdapter(RiciLIst,this::onClick)
        binding.rici.adapter=adapterMusic
    }

    fun loadData() {
        RiciLIst.add(Parametr(R.drawable.img,"Alive","Rick Sanchez"))
        RiciLIst.add(Parametr(R.drawable.img_1,"Alive","Morty Smith"))
        RiciLIst.add(Parametr(R.drawable.img_2,"Alive"," Albert Einstein"))
        RiciLIst.add(Parametr(R.drawable.img_3,"Alive"," Jerry Smith"))
    }
    private fun onClick(position:Int){
        val bundle = Bundle()
        bundle.putSerializable("key",RiciLIst[position])
        findNavController().navigate(R.id.blankFragment,bundle)
    }



}