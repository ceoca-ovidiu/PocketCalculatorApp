package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displaytextView;
    Button zeroButton;
    Button oneButton ;
    Button twoButton;
    Button threeButton ;
    Button fourButton ;
    Button fiveButton;
    Button sixButton ;
    Button sevenButton ;
    Button eightButton ;
    Button nineButton ;
    Button plusButton;
    Button minusButton ;
    Button multiplyButton ;
    Button divideButton ;
    Button moduloButton ;
    Button radicalButton ;
    Button piButton ;
    Button dotButton ;
    Button equalButton ;
    Button clearButton ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeButtons();
        setContentView(R.layout.activity_main);
       // buttonsListener(View view);

    }

    void initializeButtons(){

        TextView displaytextView = findViewById(R.id.firstNumberTextView);
        Button zeroButton = findViewById(R.id.zeroButton);
        Button oneButton = findViewById(R.id.oneButton);
        Button twoButton = findViewById(R.id.twoButton);
        Button threeButton = findViewById(R.id.threeButton);
        Button fourButton = findViewById(R.id.fourButton);
        Button fiveButton = findViewById(R.id.fiveButton);
        Button sixButton = findViewById(R.id.sixButton);
        Button sevenButton = findViewById(R.id.sevenButton);
        Button eightButton = findViewById(R.id.eightButton);
        Button nineButton = findViewById(R.id.nineButton);
        Button plusButton = findViewById(R.id.plusButton);
        Button minusButton = findViewById(R.id.minusButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);
        Button moduloButton = findViewById(R.id.moduloButton);
        Button radicalButton = findViewById(R.id.sqrtButton);
        Button piButton = findViewById(R.id.piButton);
        Button dotButton = findViewById(R.id.dotButton);
        Button equalButton = findViewById(R.id.equalButton);
        Button clearButton = findViewById(R.id.clearButton);

    }

   public void buttonsListener(View view){

   }

}