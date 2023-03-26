package com.example.rw1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MentorAdapter extends RecyclerView.Adapter<MentorViewHolder> {
    private ArrayList<String> listName;

    public MentorAdapter(ArrayList<String> listName) {
        this.listName = listName;

    }


    @NonNull
    @Override
    public MentorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MentorViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mentor, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MentorViewHolder holder, int position) {
        holder.bind(listName.get(position));
    }

    @Override
    public int getItemCount() {
        return listName.size();
    }
}
