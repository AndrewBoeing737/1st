package com.example.a1st;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textCount;
    private int count = 0;
Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textCount = findViewById(R.id.textView2);


    }

    public void onCountClick(View view) {
        count++;
        textCount.setText(Integer.toString(count));
    }

    public MainActivity() {
        super();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count=savedInstanceState.getInt("count");
        textCount.setText(Integer.toString(count));
    }

    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(getApplicationContext(),"onStart()", Toast.LENGTH_LONG);
        toast.show();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(getApplicationContext(),"onStop()", Toast.LENGTH_LONG);
        toast.show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext(),"onDestroy()", Toast.LENGTH_LONG);
        toast.show();
        super.onDestroy();
    }
    @Override
    protected void onPause() {
        Toast toast = Toast.makeText(getApplicationContext(),"onPause()", Toast.LENGTH_LONG);
        toast.show();
        super.onPause();
    }
    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(getApplicationContext(),"onResume()", Toast.LENGTH_LONG);
        toast.show();
        super.onResume();
    }

}