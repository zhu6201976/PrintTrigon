package com.example.administrator.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/**
 * 打印如下图形：
 *   *
 *  * *
 * * * *
 ** * * *
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 1;i<= 4;i++){
            for (int j = 1;j <= 4 - i;j++){
                System.out.print(" ");// 打印空格
            }
            for (int k = 1;k <= i;k++){
                System.out.print("* ");// 打印*
            }
            System.out.println();
        }

        /*
        12-16 05:21:48.855 21942-21942/com.example.administrator.test I/System.out:    *
        12-16 05:21:48.855 21942-21942/com.example.administrator.test I/System.out:   * *
        12-16 05:21:48.855 21942-21942/com.example.administrator.test I/System.out:  * * *
        12-16 05:21:48.855 21942-21942/com.example.administrator.test I/System.out: * * * *
        */


    }

}