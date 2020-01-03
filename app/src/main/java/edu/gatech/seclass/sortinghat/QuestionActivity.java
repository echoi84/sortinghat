package edu.gatech.seclass.sortinghat;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class QuestionActivity extends AppCompatActivity {

    private RadioButton radioButton_Gryffindor;
    private RadioButton radioButton_Ravenclaw;
    private RadioButton radioButton_Hufflepuff;
    private RadioButton radioButton_Slytherin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_main);

        radioButton_Gryffindor =(RadioButton)findViewById(R.id.gryffindorOption);
        radioButton_Ravenclaw =(RadioButton)findViewById(R.id.ravenclawOption);
        radioButton_Hufflepuff =(RadioButton)findViewById(R.id.hufflepuffOption);
        radioButton_Slytherin =(RadioButton)findViewById(R.id.slytherinOption);
    }

    public void handleClick(View view) {
        if (view.getId() == R.id.sortMe) {
            if (radioButton_Slytherin.isChecked()) {
                Intent i = new Intent(QuestionActivity.this, SlytherinActivity.class);
                startActivity(i);
            }

            else if (radioButton_Gryffindor.isChecked()) {
                Intent i = new Intent(QuestionActivity.this, GryffindorActivity.class);
                startActivity(i);
            }

            else if (radioButton_Hufflepuff.isChecked()) {
                Intent i = new Intent(QuestionActivity.this, HufflepuffActivity.class);
                startActivity(i);
            }

            else if (radioButton_Ravenclaw.isChecked()) {
                Intent i = new Intent(QuestionActivity.this, RavenclawActivity.class);
                startActivity(i);
            }
        }
    }
}
