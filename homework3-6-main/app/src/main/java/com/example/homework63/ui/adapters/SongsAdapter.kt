package com.example.homework63.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.homework63.databinding.ItemSongBinding
import com.example.homework63.ui.models.Music

class SongsAdapter(
    private val list: List<Music>,
    private val onItemClick: (title: String) -> Unit
) : Adapter<SongsAdapter.SongsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SongsViewHolder(
        ItemSongBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: SongsViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount() = list.size

    inner class SongsViewHolder(private val binding: ItemSongBinding) : ViewHolder(binding.root) {
        fun onBind(music: Music) = with(binding) {
            tvRank.text = music.rank
            tvTitle.text = music.title
            tvAuthor.text = music.author
            tvDuration.text = music.duration
            root.setOnClickListener {
                onItemClick(list[adapterPosition].title)
            }
        }
    }
}