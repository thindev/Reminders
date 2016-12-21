package com.apress.gerber.reminders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RemindersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        doSomething();
        
        
        setContentView(R.layout.activity_reminders);
        System.out.println("dsfsddsf");
    }

    private void doSomething() {
    }
}
