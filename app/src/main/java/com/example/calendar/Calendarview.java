package com.example.calendar;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CalendarView;
import android.widget.LinearLayout;

public class Calendarview extends LinearLayout{

    CalendarView calendarView;

    public Calendarview(Context context) {
        super(context);
        init(context);
    }

    public Calendarview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private int init(Context context) {
        // XML 레이아웃을 인플레이션함
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.fragment_calendar, this, true);

        /*calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth){
            }
        });*/

        return 0;
    }
}