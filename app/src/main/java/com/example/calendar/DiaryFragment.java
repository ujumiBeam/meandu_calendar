package com.example.calendar;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class DiaryFragment extends Fragment {
    ImageButton addDiaryBtn;
    public static Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_diary, container, false);


        addDiaryBtn = (ImageButton) v.findViewById(R.id.addDiary_btn);
        DialogFragment diaryDialog = (DialogFragment) new DiaryDialog.class();


        addDiaryBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                diaryDialog.show(getActivity().getSupportFragmentManager(), "DiaryDialog");
                //Intent intent = new Intent(getActivity(), DiaryDialog.class);
               //startActivity(intent);
            }
        });

        return v;
    }
}