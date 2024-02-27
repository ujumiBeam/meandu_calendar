package com.example.calendar;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class DiaryDialog extends DialogFragment {
    ImageButton save_btn;
    ImageButton cancel_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_diary_edit, container, false);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog diaryDialog = super.onCreateDialog(savedInstanceState);
        diaryDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        diaryDialog.setContentView(R.layout.fragment_diary_edit);

        save_btn = (ImageButton) diaryDialog.findViewById(R.id.save_button);
        cancel_btn = (ImageButton) diaryDialog.findViewById(R.id.delete_button);
        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //db 저장
                diaryDialog.dismiss();
            }
        });

        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //창 닫기
                diaryDialog.dismiss();
            }
        });
        return diaryDialog;


    }
}
