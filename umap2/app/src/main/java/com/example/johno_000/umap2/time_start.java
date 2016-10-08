package com.example.johno_000.umap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class time_start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        Button next = (Button) findViewById(R.id.time_next);
        final TimePicker t_start = (TimePicker) findViewById(R.id.timePicker_start);

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                int h = t_start.getCurrentHour();
                int m = t_start.getCurrentMinute();
                Intent old = getIntent();
                Intent i = new Intent(time_start.this,end_time.class);
                String s = old.getStringExtra("location");
                Bundle b = new Bundle();
                b.putString("location",s);
                b.putInt("s_hour",h);
                b.putInt("s_min",m);
                i.putExtras(b);
                startActivity(i);
            }
        });

    }
}
