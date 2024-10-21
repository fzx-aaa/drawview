package com.example.myapplication;

import android.os.Looper;

public class main {
    public static void main(String[] args) {
        try {
            Looper.prepare();
        } catch (Exception e) {
            System.out.printf("e :"+e);
        }

    }
}
