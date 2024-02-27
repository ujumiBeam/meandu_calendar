package com.example.calendar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import android.graphics.Color;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class StatisticsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int[] colorArray = new int[] {Color.parseColor("#77AAAD"), Color.parseColor("#6E7783"),
                Color.parseColor("#D8E6E7"), Color.parseColor("#9DC3C1"), Color.LTGRAY};

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_statistics, container, false);
        PieChart pieChart = (PieChart) v.findViewById(R.id.pieChart);
        //친구 데이터
        ArrayList<PieEntry> friends = new ArrayList<>();
        friends.add(new PieEntry(10,"계인"));
        friends.add(new PieEntry(6,"선빈"));
        friends.add(new PieEntry(4,"봉준"));
        friends.add(new PieEntry(3,"다은"));
        friends.add(new PieEntry(1,"유점"));

        PieDataSet pieDataSet = new PieDataSet(friends, "friends");
        pieDataSet.setColors(colorArray);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Friends");
        pieChart.setHoleRadius(50);
        pieChart.animate();

        return v;
    }

}


