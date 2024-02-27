package com.example.calendar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    ListView scheduleListView;
    ListView todoListView;

    CalendarView calendarView;
    TextView date_textView;

    ScheduleAdapter scheduleAdapter;
    TodoAdapter todoAdapter;

    EditText schAddText;
    EditText todoAddText;

    ImageButton schImgBtn;
    ImageButton todoImgBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_home, container, false);

        calendarView = (CalendarView) v.findViewById(R.id.home_calendar);
        date_textView = (TextView) v.findViewById(R.id.date_textview);
        //날짜 선택
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView cView, int year, int month, int dayOfMonth){} {
                String date = year + "년 " + month + "월 " + dayOfMonth + "일 ";
                date_textView .setText(date);
            }
        });

        scheduleListView = (ListView)v.findViewById(R.id.schedule_list);
        todoListView = (ListView)v.findViewById(R.id.todo_list);

        scheduleAdapter = new ScheduleAdapter();
        todoAdapter = new TodoAdapter();

        schAddText = (EditText)v.findViewById(R.id.schedule_addText);
        schImgBtn = (ImageButton)v.findViewById(R.id.addSchedule_btn);

        todoAddText = (EditText)v.findViewById(R.id.todo_addText);
        todoImgBtn = (ImageButton)v.findViewById(R.id.addsTodo_btn);

        //일정 삽입
        scheduleAdapter.addItem(new ScheduleItem("내 생일"));
        scheduleAdapter.addItem(new ScheduleItem("중간고사 시작"));

        scheduleListView.setAdapter(scheduleAdapter);

        schImgBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String schedule = schAddText.getText().toString();
                schAddText.setText(null);

                scheduleAdapter.addItem(new ScheduleItem(schedule));
                scheduleAdapter.notifyDataSetChanged();
            }
        });

        //할 일 삽입
        todoAdapter.addItem(new TodoItem("모프 UI 구현"));
        todoAdapter.addItem(new TodoItem("학교폭력 과제"));
        todoAdapter.addItem(new TodoItem("박선빈 보여?"));
        todoAdapter.addItem(new TodoItem("버튼 클릭 시 추가 기능"));

        todoListView.setAdapter(todoAdapter);

        todoImgBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String todo = todoAddText.getText().toString();
                schAddText.setText(null);

                todoAdapter.addItem(new TodoItem(todo));
                todoAdapter.notifyDataSetChanged();
            }
        });

        return v;
    }
    class ScheduleAdapter extends BaseAdapter{
        ArrayList<ScheduleItem> items = new ArrayList<ScheduleItem>();

        ImageButton editSchBtn;
        ImageButton delSchBtn;

        @Override
        public int getCount(){
            return items.size();
        }
        public void addItem(ScheduleItem item){
            items.add(item);
        }
        @Override
        public Object getItem(int position){
            return items.get(position);
        }
        @Override
        public long getItemId(int position){
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup){
            ScheduleItemView view = new ScheduleItemView(getActivity().getApplicationContext());


            ScheduleItem item = items.get(position);
            view.setSchedule(item.getSchedule());

            editSchBtn = (ImageButton)view.findViewById(R.id.editSch_button);
            delSchBtn = (ImageButton)view.findViewById(R.id.delSch_button);

            delSchBtn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view)
                {
                    scheduleAdapter.items.remove(position);
                    scheduleAdapter.notifyDataSetChanged();
                }
            });
            return view;
        }
    }

    class TodoAdapter extends BaseAdapter{
        ArrayList<TodoItem> items = new ArrayList<TodoItem>();

        ImageButton editTodoBtn;
        ImageButton delTodoBtn;
        TextView todoTextView;

        @Override
        public int getCount(){
            return items.size();
        }

        public void addItem(TodoItem item){
            items.add(item);
        }

        @Override
        public Object getItem(int position){
            return items.get(position);
        }

        @Override
        public long getItemId(int position){
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup){
            TodoItemView view = new TodoItemView(getActivity().getApplicationContext());

            TodoItem item = items.get(position);
            view.setTodo(item.getTodo());

            editTodoBtn = (ImageButton)view.findViewById(R.id.editTodo_button);
            delTodoBtn = (ImageButton)view.findViewById(R.id.delTodo_button);
            todoTextView = (TextView)view.findViewById(R.id.todo_list);

            delTodoBtn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view)
                {
                    todoAdapter.items.remove(position);
                    todoAdapter.notifyDataSetChanged();
                }
            });

            return view;
        }
    }
}
