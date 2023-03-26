package com.example.home_work_3_4;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.home_work_3_4.databinding.ItemCountryBinding;


import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    private final ArrayList<Country> list;


    public CountryAdapter(ArrayList<Country> list) {
        this.list = list;

    }

    @NonNull
    @Override
    public CountryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ItemCountryBinding binding;

        public ViewHolder(@NonNull ItemCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Country country) {
            Glide.with(binding.countryFlag).load(list.get(getAdapterPosition()).getFlag()).into(binding.countryFlag);
            binding.tvCountry.setText(country.getCountry());
            binding.tvCapital.setText(country.getCapital());
        }
    }
}