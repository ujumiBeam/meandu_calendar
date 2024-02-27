package com.example.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TodoItemView extends LinearLayout {
    TextView textView;
    ImageButton imageButton1;
    ImageButton imageButton2;
    CheckBox checkBox;

    public TodoItemView(Context context){
        super(context);
        init(context);
    }

    public TodoItemView(Context context, AttributeSet attrs){
        super(context,attrs);
        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.todo_item, this, true);

        textView = (TextView)findViewById(R.id.todo_list);
        imageButton1 = (ImageButton)findViewById(R.id.edit_button);
        imageButton2 = (ImageButton)findViewById(R.id.delete_button);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
    }

    public void setTodo(String todo){
        textView.setText(todo);
    }

    //나머지 set은 안건드려도 되는데..?
}
