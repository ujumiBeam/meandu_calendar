package com.example.calendar;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ContactFragment extends ListFragment {

    ContactAdapter adapter ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Adapter 생성 및 Adapter 지정.
        adapter = new ContactAdapter() ;
        setListAdapter(adapter) ;

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.people3),
                "계인", "010-1111-1111", "남","19살") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.people4),
                "선빈", "010-2222-2222", "여", "22살") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.people2),
                "봉준", "010-3333-3333", "남", "23살") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.people5),
                "다은", "010-4444-4444", "여", "23살") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.people1),
                "유점", "010-5555-1234", "여", "3살") ;

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}