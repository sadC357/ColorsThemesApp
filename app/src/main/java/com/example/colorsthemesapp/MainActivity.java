package com.example.colorsthemesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mainLayout;
    private int snackBarCount;
    private int surpriseCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = findViewById(R.id.mainLayout);
        snackBarCount = 0;
    }


    public void snackbarClicked(View v) {
        Snackbar.make(mainLayout, "How many snackbars?", Snackbar.LENGTH_LONG)
                .setAction("Answer", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        snackBarCount++;
                        Snackbar.make(mainLayout, "Count: " + snackBarCount,
                                        Snackbar.LENGTH_SHORT)
                                .show();
                    }
                })
                .show();
    }

    public void onSurpriseClicked(View v) {
        surpriseCount++;
        if (surpriseCount % 2 == 0) {
            mainLayout.setBackgroundColor(getResources()
                    .getColor(R.color.md_theme_light_onBackground));
        } else {

            mainLayout.setBackgroundColor(getResources()
                    .getColor(R.color.md_theme_dark_error));
        }
    }



}