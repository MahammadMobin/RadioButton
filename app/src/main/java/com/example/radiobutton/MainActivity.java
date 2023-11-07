package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button showButton;
    private RadioButton genderButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radiogroupid);
        showButton = (Button) findViewById(R.id.showbutton);
        resultTextView = (TextView) findViewById(R.id.textviewdid);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selecteedId = radioGroup.getCheckedRadioButtonId();
                genderButton = (RadioButton) findViewById(selecteedId);

                String value = genderButton.getText().toString();
                resultTextView.setText("You have selected "+value);




            }
        });
    }
}