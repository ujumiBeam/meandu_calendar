package com.example.calendar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ScheduleItem {
    String schedule;

    public ScheduleItem(String schedule) {
        this.schedule = schedule;
    }
    public String getSchedule() {
        return schedule;
    }
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    public boolean editSchedule(boolean beEdit) { return !beEdit;}

}
