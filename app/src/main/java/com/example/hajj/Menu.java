package com.example.hajj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button button_book, button_dua, button_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button_book = (Button) findViewById(R.id.button_book);
        button_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityBook();
            }
        });

        button_dua = (Button) findViewById(R.id.button_book);
        button_dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityDua();
            }
        });

        button_map = (Button) findViewById(R.id.button_book);
        button_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMap();
            }
        });

    }
    public void openActivityBook(){
        Intent intent = new Intent (this, ActivityBook.class);
        startActivity(intent);
    }

}