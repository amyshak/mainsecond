package com.mainacademy.homework;

public class TestVarArg{
    public int calcSum(int... values){
        int res = 0;
        for (int x: values){
            res +=x;
        }
        return res;
    }
}
