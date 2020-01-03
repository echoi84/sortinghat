package edu.gatech.seclass.sortinghat;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View view) {
        if (view.getId() == R.id.startButton) {
            Intent i = new Intent(MainActivity.this, QuestionActivity.class);
            startActivity(i);
        }
    }
}
