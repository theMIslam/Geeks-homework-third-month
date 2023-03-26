package com.example.rw1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mentorsList = new ArrayList<>();
    private RecyclerView rvMentorsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addValue();

        rvMentorsList = findViewById(R.id.rv_mentors);
        MentorAdapter mentorsAdapter = new MentorAdapter(mentorsList);
        rvMentorsList.setAdapter(mentorsAdapter);
    }

    private void addValue() {
        mentorsList.add("Нооруз");
        mentorsList.add("Нуртилек");
        mentorsList.add("Бектур");
        mentorsList.add("Тима");
        mentorsList.add("Актан");
        mentorsList.add("Рая");
        mentorsList.add("Ислам");
        mentorsList.add("Ливаза");
        mentorsList.add("Айжан");
        mentorsList.add("Адиль");
        mentorsList.add("Шамиль");
        mentorsList.add("Нурбол");
        mentorsList.add("Жылдыз");
        mentorsList.add("Розимухаммед");
        mentorsList.add("Эмиль");
        mentorsList.add("Альберт");
        mentorsList.add("Ишеналы");
        mentorsList.add("Тан");
        mentorsList.add("Бексултан");
        mentorsList.add("Мубарак");
        mentorsList.add("Рустам не ментор");
    }
}