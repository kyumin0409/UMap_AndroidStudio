package com.example.johno_000.umap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class location extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        final Button ilc = (Button) findViewById(R.id.ilc);
        final Button isen = (Button) findViewById(R.id.isb);
        final Button hasb = (Button) findViewById(R.id.has);
        final Button lib = (Button) findViewById(R.id.lib);


        ilc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent i = new Intent(location.this,time_start.class);
                i.putExtra("location",ilc.getText().toString());
                startActivity(i);
            }
        });

        hasb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent i = new Intent(location.this,time_start.class);
                i.putExtra("location",hasb.getText().toString());
                startActivity(i);
            }
        });

        lib.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent i = new Intent(location.this,time_start.class);
                i.putExtra("location",lib.getText().toString());
                startActivity(i);
            }
        });

        isen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent i = new Intent(location.this,time_start.class);
                i.putExtra("location",isen.getText().toString());
                startActivity(i);
            }
        });

    }

}
