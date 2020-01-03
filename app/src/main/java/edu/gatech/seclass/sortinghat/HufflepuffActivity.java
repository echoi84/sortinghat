package edu.gatech.seclass.sortinghat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HufflepuffActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hufflepuff_main);
    }

    public void handleClick(View view) {
        if (view.getId() == R.id.homeButton) {
            Intent i = new Intent(HufflepuffActivity.this, MainActivity.class);
            startActivity(i);
        }
    }


}
