package com.example.home_work_3_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;


import com.example.home_work_3_4.databinding.FragmentCountryInfoBinding;

import java.util.ArrayList;


public class CountryInfoFragment extends Fragment {
    private final ArrayList<Country> countryList = new ArrayList<>();
    private FragmentCountryInfoBinding binding;
    private CountryAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentCountryInfoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getContinentsCountries();
        adapter = new CountryAdapter(countryList);
        RecyclerView.LayoutManager columns = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        binding.recyclerView.setLayoutManager(columns);
        binding.recyclerView.setAdapter(adapter);

    }

    private void getContinentsCountries() {
        countryList.clear();
        if (getArguments() != null) {
            switch (getArguments().getString("continentName")) {
                case "Eurasia":
                    countryList.add(new Country("Kyrgyzstan", "Bishkek", "https://user-images.githubusercontent.com/98197909/197177921-66f767d5-f610-41d2-af88-6a00424c890a.png"));
                    countryList.add(new Country("Russian", "Moscow", "https://user-images.githubusercontent.com/98197909/197178326-307a6df4-149f-4afe-b949-da8171ec307a.png"));
                    countryList.add(new Country("China", "Beijing", "https://user-images.githubusercontent.com/98197909/197178866-8b8cdb07-1b4c-4aef-977b-96809a059a59.png"));
                    countryList.add(new Country("China", "Beijing", "https://user-images.githubusercontent.com/98197909/197178866-8b8cdb07-1b4c-4aef-977b-96809a059a59.png"));
                    countryList.add(new Country("China", "Beijing", "https://user-images.githubusercontent.com/98197909/197178866-8b8cdb07-1b4c-4aef-977b-96809a059a59.png"));
                    countryList.add(new Country("China", "Beijing", "https://user-images.githubusercontent.com/98197909/197178866-8b8cdb07-1b4c-4aef-977b-96809a059a59.png"));
                    countryList.add(new Country("China", "Beijing", "https://user-images.githubusercontent.com/98197909/197178866-8b8cdb07-1b4c-4aef-977b-96809a059a59.png"));
                    countryList.add(new Country("China", "Beijing", "https://user-images.githubusercontent.com/98197909/197178866-8b8cdb07-1b4c-4aef-977b-96809a059a59.png"));
                    countryList.add(new Country("China", "Beijing", "https://user-images.githubusercontent.com/98197909/197178866-8b8cdb07-1b4c-4aef-977b-96809a059a59.png"));
                    countryList.add(new Country("China", "Beijing", "https://user-images.githubusercontent.com/98197909/197178866-8b8cdb07-1b4c-4aef-977b-96809a059a59.png"));
                    countryList.add(new Country("China", "Beijing", "https://user-images.githubusercontent.com/98197909/197178866-8b8cdb07-1b4c-4aef-977b-96809a059a59.png"));
                    countryList.add(new Country("China", "Beijing", "https://user-images.githubusercontent.com/98197909/197178866-8b8cdb07-1b4c-4aef-977b-96809a059a59.png"));
                    countryList.add(new Country("China", "Beijing", "https://user-images.githubusercontent.com/98197909/197178866-8b8cdb07-1b4c-4aef-977b-96809a059a59.png"));
                    countryList.add(new Country("Great Britain", "London", "https://user-images.githubusercontent.com/98197909/197179289-d3094366-5b7e-427b-8a16-68f4d0285ed2.png"));
                    break;
                case "NorthAmerica":

                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    countryList.add(new Country("United States", "Washington D.C", "https://user-images.githubusercontent.com/98197909/197181577-bc13ecdf-882f-4826-91a5-778e9226cbcc.png"));
                    break;
                case "Africa":
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    countryList.add(new Country("Algeria", "Algeria", "https://user-images.githubusercontent.com/98197909/197179987-a71122e8-8f1a-4155-8983-a03e70dd9476.png"));
                    break;
                case "SouthAmerica":
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    countryList.add(new Country("Brasilia", "Brazil", "https://user-images.githubusercontent.com/98197909/197182105-c7ecc0e1-3140-49a9-8674-8192e617115f.png"));
                    break;

                case "Australia":
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://user-images.githubusercontent.com/98197909/197179505-6b3a1204-4e2a-4b08-90a4-fdcdd17a60e5.png"));
                    break;
            }
        }
    }


}