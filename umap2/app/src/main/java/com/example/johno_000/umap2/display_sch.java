package com.example.johno_000.umap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class display_sch extends AppCompatActivity {
    ArrayList<schedule> list = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_sch);
        TextView t = (TextView) findViewById(R.id.textView);
        Button back = (Button) findViewById(R.id.back);
        Intent old = getIntent();
        Bundle b = old.getExtras();
        schedule s = new schedule(b.getString("location"),b.getInt("start_h"),b.getInt("start_m"),b.getInt("end_h"),b.getInt("end_m"));
        list.add(s);
        for(int i = 0; i < list.size(); i++){
            //t.append(list.get(i).loc + "\n");
            System.out.println("distance" + list.get(i).loc);
        }
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent i = new Intent(display_sch.this,Home.class);
                //i.putExtra("location",ilc.getText().toString());
                startActivity(i);
            }
        });
    }
}
