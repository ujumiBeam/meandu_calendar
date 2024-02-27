package com.example.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ScheduleItemView extends LinearLayout {
    TextView schedule_list;
    EditText schEdit_list;
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageView imageView;



    public ScheduleItemView(Context context){
        super(context);
        init(context);
    }

    public ScheduleItemView(Context context, AttributeSet attrs){
        super(context,attrs);
        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.schedule_item, this, true);

        schedule_list = (TextView)findViewById(R.id.schedule_list);
        schEdit_list = (EditText)findViewById(R.id.scheduleEdit_list);
        imageButton1 = (ImageButton)findViewById(R.id.editSch_button);
        imageButton2 = (ImageButton)findViewById(R.id.delSch_button);
        imageView = (ImageView) findViewById(R.id.schedule_image);

    }

    public void setSchedule(String schedule){
        schedule_list.setText(schedule);
    }
    /*public void editSchedule(boolean beEdit) {
        if (beEdit == true) {
            schedule_list.setVisibility(GONE);
            schEdit_list.setVisibility(VISIBLE);
        } else {
            schedule_list.setVisibility(VISIBLE);
            schEdit_list.setVisibility(GONE);
        }
    }*/
    //나머지 set은 안건드려도 되는데..?
}
