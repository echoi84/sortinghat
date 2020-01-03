package edu.gatech.seclass.sortinghat;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SlytherinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slytherin_main);
    }

    public void handleClick(View view) {
        if (view.getId() == R.id.homeButton) {
            Intent i = new Intent(SlytherinActivity.this, MainActivity.class);
            startActivity(i);
        }
    }


}
