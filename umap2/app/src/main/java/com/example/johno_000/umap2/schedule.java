package com.example.johno_000.umap2;


import java.util.ArrayList;

public class schedule {
    public int start_hour;
    public int start_min;
    public int end_hour;
    public int end_min;
    public String loc;
    public ArrayList<schedule> sc = new ArrayList();

    public schedule(String loc,int start_hour,int start_min, int end_hour, int end_min){
        this.loc = loc;
        this.start_hour = start_hour;
        this.start_min = start_min;
        this.end_min = end_min;
        this.end_hour = end_hour;
    }

    public void setStart_hour(int s_hour){
        start_hour = s_hour;
    }

    public void setStart_min(int s_min){
        start_min = s_min;
    }

    public void setEnd_hour(int e_hour){
        end_hour = e_hour;
    }

    public void setEnd_min(int e_min){
        end_min = e_min;
    }
}
