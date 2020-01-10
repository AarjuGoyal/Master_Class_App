package com.example.aarjugoyal.master_class_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button b1;//About button
    private Button b2;//Book a seat button
    private Button b3;//Venue



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();

    }

    public void addListenerOnButton1()
    {
        b1 = (Button) findViewById(R.id.Button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent about_activity_Intent = new Intent(view.getContext(), AboutActivity.class);
                view.getContext().startActivity(about_activity_Intent);

            }
        });
    }

    public void addListenerOnButton2()
    {
        b2 = (Button) findViewById(R.id.Button2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent book_seat_Intent = new Intent(view.getContext(), BookSeatActivity.class);
                view.getContext().startActivity(book_seat_Intent);

            }
        });
    }

    public void addListenerOnButton3()
    {
        b3 = (Button) findViewById(R.id.Button3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent book_seat_Intent = new Intent(view.getContext(), VenueActivity.class);
                view.getContext().startActivity(book_seat_Intent);

            }
        });
    }

    public void addListenerOnButton4()
    {
        b3 = (Button) findViewById(R.id.Button4);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent book_seat_Intent = new Intent(view.getContext(), ScheduleActivity.class);
                view.getContext().startActivity(book_seat_Intent);

            }
        });
    }
}
