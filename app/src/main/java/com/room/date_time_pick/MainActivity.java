package com.room.date_time_pick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView datetext,timetext;
    private String date;
    private String time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datetext=(TextView)findViewById(R.id.dateid);
        timetext=(TextView) findViewById(R.id.timeId);

        Calendar callforDate=Calendar.getInstance();
        SimpleDateFormat currentDateformat=new SimpleDateFormat("MMM dd, YYYY");
        date=currentDateformat.format(callforDate.getTime());

        Calendar callforTime=Calendar.getInstance();
        SimpleDateFormat currentTimeformat=new SimpleDateFormat("hh:mm a");
        time=currentTimeformat.format(callforTime.getTime());


        datetext.setText(date );
        timetext.setText(time);

        Toast.makeText(this,"succed",Toast.LENGTH_SHORT).show();



    }
}
