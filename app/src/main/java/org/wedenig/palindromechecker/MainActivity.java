package org.wedenig.palindromechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button checkButton;
    TextView resultView;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkButton = (Button)findViewById(R.id.buttonCheck);
        resultView = (TextView)findViewById(R.id.textViewStatus);
        input = (EditText)findViewById(R.id.stringInput);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().length() == 0) {
                    resultView.setText("Please enter a string.");
                } else if (input.getText().toString().length() < 5) {
                    resultView.setText("String needs to be longer than 5 characters.");
                }else if(Utility.isPalindrome(input.getText().toString())) {
                    resultView.setText("It's a palindrome :)");
                } else {
                    resultView.setText("Not a palindrome :(");
                }
            }
        });
    }
}
