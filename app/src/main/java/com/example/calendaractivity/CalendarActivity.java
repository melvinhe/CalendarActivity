package com.example.calendaractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity {

    CalendarView calendarView;
    TextView myDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarView = (CalendarView)findViewByID(R.id.calendView);
        myDate = (TextView)findViewByID(R.id.myDate);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
        @Override
        public void onSelectedDayChange(@NonNull CalendarView calendarView,int i,int i1,int i2){
             String date=(i1+1)+"/"+i2+"/"+i;
             myDate.setText(date);
         }
     });

    }


}