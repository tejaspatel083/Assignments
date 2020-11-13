package com.example.movielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<movie> arrayList;
    private CustomAdapterList adapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.movie_listView);

        arrayList = new ArrayList<movie>();


        arrayList.add(new movie("Dil Bechara","7.9 IMDB","Romantic Movie"));
        arrayList.add(new movie("Laxmi Bomb","2.2 IMDB","Horror Movie"));
        arrayList.add(new movie("Sooryavanshi","coming soon","Action Movie"));
        arrayList.add(new movie("Avengers","8.4 IMDB","Action Movie"));
        arrayList.add(new movie("War","8.2 IMDB","Action Movie"));
        arrayList.add(new movie("Civil War","7.8 IMDB","Action Movie"));
        arrayList.add(new movie("3 idiots","8.4 IMDB","Comedy Movie"));
        arrayList.add(new movie("Raees","6.8 IMDB","Crime Movie"));
        arrayList.add(new movie("Baaghi 3","2.1 IMDB","Action Movie"));
        arrayList.add(new movie("Phir Hera Pheri","6.9 IMDB","Comedy Movie"));

        adapterList = new CustomAdapterList(arrayList);

        listView.setAdapter(adapterList);
    }
}
