package com.deguzman.patricia;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4IT-H", "onCreate has started.");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4IT-H", "onStart has started.");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4IT-H", "onResume has started.");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4IT-H", "onStop has started.");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4IT-H", "onPause has started.");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4IT-H", "onRestart has started.");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4IT-H", "onDestroy has started.");
    }

    public void ToastMsg(View v) {
        Toast.makeText(this, "Welcome to Highland Resort Hotel and Spa!", Toast.LENGTH_LONG).show();
    }

    public void SnackbarMsg(View v) {
        Snackbar.make(v, "Please enjoy your stay!", Snackbar.LENGTH_LONG).show();
    }
}
