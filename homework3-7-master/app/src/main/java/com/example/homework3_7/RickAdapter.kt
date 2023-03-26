package com.example.homework3_7

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework3_7.databinding.ItemRiciBinding

class RickAdapter(val data: ArrayList<Parametr>,
                  val onclick: (position: Int) -> Unit
) :
    RecyclerView.Adapter<RickAdapter.RickViewHolder>() {
    private lateinit var array:ArrayList<Parametr>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickViewHolder {
        return RickViewHolder(
            ItemRiciBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false

            )
        )
    }

    override fun onBindViewHolder(holder: RickViewHolder, position: Int) {
        holder.bund()
        holder.itemView.setOnClickListener{

        }
    }
    override fun getItemCount() = data.size
    inner class RickViewHolder(private val binding:ItemRiciBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bund() {
            val item = data[adapterPosition]
            binding.profi.text=item.prof
            binding.name.text=item.name
            binding.image.setImageResource(item.img)

            binding.image.setOnClickListener{
                onclick(adapterPosition)
            }
            binding.name.setOnClickListener{
                onclick(adapterPosition)
            }
            binding.profi.setOnClickListener{
                onclick(adapterPosition)
            }
        }}}