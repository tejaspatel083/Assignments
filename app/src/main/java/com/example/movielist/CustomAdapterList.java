package com.example.movielist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class CustomAdapterList extends BaseAdapter {

    ArrayList<movie> arrayList;
    private Integer[ ] movieImages = {R.drawable.movie1,R.drawable.movie2,R.drawable.movie3,R.drawable.movie4,R.drawable.movie5,
            R.drawable.movie6,R.drawable.movie7,R.drawable.movie8,R.drawable.movie9,R.drawable.movie10};

    TextView title,ratings,descrition;
    ImageView imageView;

    public CustomAdapterList(ArrayList<movie> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_listview,null);

        title = convertView.findViewById(R.id.movie_title);
        ratings = convertView.findViewById(R.id.movie_ratings);
        descrition = convertView.findViewById(R.id.movie_description);

        imageView = convertView.findViewById(R.id.movie_imageView);

        movie mv_obj = (movie) getItem(position);

        title.setText(mv_obj.getTitle());
        ratings.setText(mv_obj.getRatings());
        descrition.setText(mv_obj.getDescription());
        imageView.setImageResource(movieImages[position]);


        return convertView;
    }
}
