package com.andrepiper.simprintspuzzle;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class SimprintsInstrumentedTest {
    @Test
    public void useAppContext() {
        ArrayList<String> testValues = new ArrayList<>();

        testValues.add("Simprints, every person counts");

        MainActivityViewModel viewModel = new MainActivityViewModel(testValues);

        ArrayList<AsciiModel> calculatedIntValues = new AsciiCalculator().calculateASCII(viewModel.getCommonValues());

        assertEquals(2995, calculatedIntValues.get(0).getAsciiIntValue());
    }
}
