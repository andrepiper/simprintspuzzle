package com.andrepiper.simprintspuzzle;

import java.util.ArrayList;
import java.util.Collections;

public class AsciiCalculator {

    private ArrayList<Integer> asciiValues;
    private int asciiCount;
    private char charInWord;

    public AsciiCalculator() {
        asciiValues = new ArrayList<>();
        asciiCount = 0;
        charInWord = 0;
    }

    public ArrayList<AsciiModel> calculateASCII(ArrayList<String> commonValues) {

        for (int i = 0; i < commonValues.size(); i++) {
            for(int x = 0; x < commonValues.get(i).length(); x++) {
                charInWord = commonValues.get(i).charAt(x);
                asciiCount = asciiCount + (int) charInWord;
            }
            asciiValues.add(asciiCount);
            asciiCount = 0;
        }

        ArrayList resultSet = new ArrayList<>();
        for(int v = 0; v < commonValues.size(); v++ ) {
            resultSet.add(new AsciiModel(commonValues.get(v),asciiValues.get(v)));
        }

        // sort in descending order
        Collections.sort(resultSet);

        return resultSet;
    }
}
