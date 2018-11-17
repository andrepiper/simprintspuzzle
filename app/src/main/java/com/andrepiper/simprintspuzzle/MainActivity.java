package com.andrepiper.simprintspuzzle;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends BaseAppCompactActivity {

    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        View linearLayout =  findViewById(R.id.simprints_results_view);

        viewModel = new MainActivityViewModel(CommonValues.getCommonValues());

        ArrayList<AsciiModel> calculatedIntValues = new AsciiCalculator().calculateASCII(viewModel.getCommonValues());

        int counter = 0;

        for(AsciiModel asciiSummation : calculatedIntValues){

            String logEntryTag = "Value : "+ asciiSummation.getsimprintValue();
            String logEntryValue = "Ascii Sum : "+asciiSummation.getAsciiIntValue();

            Log.d(logEntryTag, logEntryValue);

            TextView valueTV = new TextView(this);
            valueTV.setText(logEntryTag+" -> "+logEntryValue);
            valueTV.setId(counter);
            valueTV.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
            ((LinearLayout) linearLayout).addView(valueTV);

            counter++;
        }
    }
}