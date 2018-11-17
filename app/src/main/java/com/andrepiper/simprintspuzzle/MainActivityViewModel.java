package com.andrepiper.simprintspuzzle;

import java.util.ArrayList;

public class MainActivityViewModel {

    private ArrayList<String> _commonValues;

    public MainActivityViewModel(ArrayList<String> commonValues){
        _commonValues = commonValues;
    }

    public ArrayList<String> getCommonValues() {
        return _commonValues;
    }

    public void setCommonValues(ArrayList<String> _commonValues) {
        this._commonValues = _commonValues;
    }
}
