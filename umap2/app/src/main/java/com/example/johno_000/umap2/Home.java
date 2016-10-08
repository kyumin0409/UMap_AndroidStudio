package com.example.johno_000.umap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button map = (Button) findViewById(R.id.map);
        Button sch = (Button) findViewById(R.id.schedule);

        map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Home.this,MapsActivity.class));
            }
        });

        sch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Home.this,location.class));
            }
        });

    }
}
