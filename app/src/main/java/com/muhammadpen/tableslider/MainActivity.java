package com.muhammadpen.tableslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final ListView tables = findViewById(R.id.listView);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);

        ArrayAdapter<Integer> numbersToTablesAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_activated_1, numbers);

        tables.setAdapter(numbersToTablesAdapter);


        SeekBar numberSlider = findViewById(R.id.seekBar);

        numberSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


                ArrayList<Integer> numbers = new ArrayList<>();
                int tableMax = 11;
                for(int counter=1; counter < tableMax; counter++){
                    numbers.add(counter*i);
                }
                /*numbers.add(1*i);
                numbers.add(2*i);
                numbers.add(3*i);
                numbers.add(4*i);
                numbers.add(5*i);
                numbers.add(6*i);
                numbers.add(7*i);
                numbers.add(8*i);
                numbers.add(9*i);
                numbers.add(10*i);
                */

                ArrayAdapter<Integer> numbersToTablesAdapter = new ArrayAdapter<Integer>(MainActivity.this, android.R.layout.simple_list_item_activated_1, numbers);

                tables.setAdapter(numbersToTablesAdapter);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
