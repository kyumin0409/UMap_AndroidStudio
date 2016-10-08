package com.example.johno_000.umap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class end_time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_time);

        Button end = (Button) findViewById(R.id.finish);
        Button another = (Button) findViewById(R.id.add_another);
        final TimePicker time = (TimePicker) findViewById(R.id.timePicker2);

        end.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                int h = time.getCurrentHour();
                int m = time.getCurrentMinute();
                Intent i = new Intent(end_time.this,display_sch.class);
                Intent old = getIntent();
                Bundle b = old.getExtras();
                Bundle send = new Bundle();
                send.putString("location",b.getString("location"));
                send.putInt("start_h" , b.getInt("s_hour"));
                send.putInt("start_m" , b.getInt("s_min"));
                send.putInt("end_h" , h);
                send.putInt("end_m" , m);
                i.putExtras(send);
                startActivity(i);
            }
        });

    }
}
