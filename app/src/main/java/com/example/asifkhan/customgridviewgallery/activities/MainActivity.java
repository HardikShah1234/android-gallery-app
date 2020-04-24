package com.example.asifkhan.customgridviewgallery.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

import com.example.asifkhan.customgridviewgallery.R;
import com.example.asifkhan.customgridviewgallery.adapters.GalleryAdapter;
import com.example.asifkhan.customgridviewgallery.models.Users;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Users> users;
    private GridView gallery;
    private GalleryAdapter galleryAdapter;
    private String[] names = {
            "Camera", "WhatsApp", "Screenshots", "Telegrams", "WhatsApp",
            "Download", "WhatsApp", "Reddit", "0", "OpenCamera",
            "WhatsApp", "WallPaper", "Videos", "WhatsApp Videos"
    };
    private String[] professions = {
            "200 Media", "10828 Media", "66 Media", "39 Media", "497 Media",
            "5 Media", "112 Media", "3 Media", "1 Media", "1 Media",
            "1 Media", "1 Media", "12 Media", "15 Media"
    };
    private int[] photos = {
            R.drawable.sample_8, R.drawable.sample_3, R.drawable.sample_8, R.drawable.sample_4, R.drawable.sample_8,
            R.drawable.sample_8, R.drawable.sample_8, R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_3,
            R.drawable.sample_8, R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_8, R.drawable.sample_4,
            R.drawable.sample_8, R.drawable.sample_3, R.drawable.sample_3, R.drawable.sample_3, R.drawable.sample_4,
            R.drawable.sample_4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        users = new ArrayList<>();
        gallery = (GridView) findViewById(R.id.gallery);
        galleryAdapter = new GalleryAdapter(users, this);
        gallery.setAdapter(galleryAdapter);
        getDatas();
    }

    // getting all the datas
    private void getDatas() {
        for (int count = 0; count < names.length; count++) {
            users.add(new Users(names[count], professions[count], photos[count]));
        }
    }
}
