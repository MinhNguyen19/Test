package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity { //test6

    Button btn;

    public void methodTest(){
        System.out.println("hi");
        int a = 0;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("hi");
        super.onCreate(savedInstanceState);

        btn = findViewById(R.id.button);
        //1
        //2
        //3
        //4
        //5
        //6
        // Test 7


    }

    public int addNum() {
        return 1;
    }
}