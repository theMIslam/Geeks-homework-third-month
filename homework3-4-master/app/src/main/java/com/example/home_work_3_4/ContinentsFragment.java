package com.example.home_work_3_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.home_work_3_4.databinding.FragmentContinentsBinding;

import java.util.ArrayList;

public class ContinentsFragment extends Fragment implements OnClickListener {
    private final ArrayList<Continent> continentsList = new ArrayList<>();
    ArrayList<Country> countries = new ArrayList<>();

    private FragmentContinentsBinding binding;
    private ContinentAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentContinentsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continentsList, this);
        binding.continents.setAdapter(adapter);
    }

    private void loadData() {
        continentsList.clear();
        continentsList.add(new Continent(R.drawable.eurasia, "Eurasia"));
        continentsList.add(new Continent(R.drawable.north_america, "NorthAmerica"));
        continentsList.add(new Continent(R.drawable.africa, "Africa"));
        continentsList.add(new Continent(R.drawable.south_america, "SouthAmerica"));
        continentsList.add(new Continent(R.drawable.australia, "Australia"));
    }

    @Override
    public void onClick(Continent continent) {
        Bundle bundle = new Bundle();
        bundle.putString("continentName", continent.getCountryName());
        CountryInfoFragment countryInfoFragment = new CountryInfoFragment();
        countryInfoFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_continents, countryInfoFragment).addToBackStack(null).commit();
    }
}