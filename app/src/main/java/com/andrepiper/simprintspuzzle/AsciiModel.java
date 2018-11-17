package com.andrepiper.simprintspuzzle;

public class AsciiModel implements Comparable<AsciiModel> {

        private String _simprintValue;
        private int _asciiIntValue;


        public AsciiModel(String simprintValue,int asciiIntValue){
                this._simprintValue=simprintValue;
                this._asciiIntValue=asciiIntValue;
        }

        public String getsimprintValue(){
                return _simprintValue;
        }

        public void setsimprintValue(String val){
                this._simprintValue=val;
        }
        public int getAsciiIntValue(){
                return _asciiIntValue;
        }

        public void setAsciiIntValue(int val){
                this._asciiIntValue=val;
        }

        public int compareTo(AsciiModel compareValue){
                return (compareValue.getAsciiIntValue() - this._asciiIntValue);
        }
}