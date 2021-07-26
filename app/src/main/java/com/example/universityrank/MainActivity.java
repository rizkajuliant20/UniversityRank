package com.example.universityrank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Mode List";
    private RecyclerView rvUniversity;
    private ArrayList<University> list = new ArrayList<>();

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DESC = "extra_desc";
    public static final String EXTRA_PHOTO = "extra_photo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUniversity = findViewById(R.id.rv_university);
        rvUniversity.setHasFixedSize(true);

        list.addAll(UniversityList.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvUniversity.setLayoutManager(new LinearLayoutManager(this));
        ListUniversityAdapter listUniversityAdapter = new ListUniversityAdapter(list);
        rvUniversity.setAdapter(listUniversityAdapter);

        listUniversityAdapter.setOnItemClickCallback(new ListUniversityAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(University data) {
                showSelectedUniversity(data);
            }
        });
    }

    private void showSelectedUniversity(University university) {
        //Action intent ke detail
        int image = university.getImage();
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_NAME, university.getName());
        intent.putExtra(DetailActivity.EXTRA_DESC, university.getDesc());
        intent.putExtra(DetailActivity.EXTRA_PHOTO, image);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.profile:
                title = "My Profile";
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
                break;

            case R.id.about:
                Uri webpage = Uri.parse("https://github.com/rizkajuliant20");
                Intent i = new Intent(Intent.ACTION_VIEW, webpage);
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                break;
        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}