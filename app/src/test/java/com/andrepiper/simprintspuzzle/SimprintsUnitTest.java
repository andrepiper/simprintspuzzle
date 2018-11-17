package com.andrepiper.simprintspuzzle;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class SimprintsUnitTest {
    @Test
    public void ascii_Total_Correct() {
        ArrayList<String> testValues = new ArrayList<>();

        testValues.add("Simprints, every person counts");

        MainActivityViewModel viewModel = new MainActivityViewModel(testValues);

        ArrayList<AsciiModel> calculatedIntValues = new AsciiCalculator().calculateASCII(viewModel.getCommonValues());

        assertEquals(2995, calculatedIntValues.get(0).getAsciiIntValue());
    }
}