package com.example.homework63.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import com.example.homework63.R
import com.example.homework63.databinding.FragmentPlaylistBinding
import com.example.homework63.ui.adapters.SongsAdapter
import com.example.homework63.ui.models.Music

class PlaylistFragment : Fragment() {
    private lateinit var binding: FragmentPlaylistBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlaylistBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = SongsAdapter(uploadSongs(), this::onItemClick)
        binding.rvSongs.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }

    private fun uploadSongs() = listOf(
        Music("1", "Скриптонит", "Цепи", "1:00"),
        Music("1", "Скриптонит", "Поворот", "3:00"),
        Music("1", "Скриптонит", "Мистер 718", "4:00"),
        Music("1", "Скриптонит", "Положение", "5:00"),
        Music("1", "Скриптонит", "Москва любит", "20:00"),
    )

    private fun onItemClick(title: String) {
        requireActivity().supportFragmentManager.findFragmentById(R.id.album_fragment)?.view?.isGone =
            true
        val bundle = Bundle()
        bundle.putString("если ты не Рустам, то ты уже крутой", title)
        val singleSongFragment = SingleSongFragment()
        singleSongFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.songs_fragment, singleSongFragment).commit()
    }
}