package com.example.casia_yan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView screen, output;
    private Button ac, c, del, add, minus, multiply, divide, equal, dot, one, two, three, four, five, six, seven, eight, nine, zero, doubleZero;
    private String process;

    // checkers
    private int flag = 0, checker = 0;

    // computer
    private float compute = 0;
    private String outputCompute, screenCompute;


    private float parse = 0, parse2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // screens
        screen = findViewById(R.id.screen);
        output = findViewById(R.id.output);

        // clears screen
        ac = findViewById(R.id.ac);
        c = findViewById(R.id.c);


        // numerical buttons
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        doubleZero = findViewById(R.id.doubleZero);

        // decimal
        dot = findViewById(R.id.dot);


        // arithmetic operators
        add = findViewById(R.id.add);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        equal = findViewById(R.id.equal);











// FUNCTION THAT CLEARS THE SCREEN //
            ac.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    screen.setText("");
                    output.setText("");
                    flag = 0;
                    checker = 0;
                }
            });


            c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    screen.setText("");
                    output.setText("");
                    flag = 0;
                    checker = 0;
                }
            });


// FUNCTION THAT WILL INPUT THE SELECTED DIGIT //

            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    process = screen.getText().toString();
                    screen.setText(process + "1");
                }
            });



            two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    process = screen.getText().toString();
                    screen.setText(process + "2");
                }
            });



            three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    process = screen.getText().toString();
                    screen.setText(process + "3");
                }
            });


            four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    process = screen.getText().toString();
                    screen.setText(process + "4");
                }
            });


            five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    process = screen.getText().toString();
                    screen.setText(process + "5");
                }
            });



            six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    process = screen.getText().toString();
                    screen.setText(process + "6");
                }
            });



            seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    process = screen.getText().toString();
                    screen.setText(process + "7");
                }
            });


            eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    process = screen.getText().toString();
                    screen.setText(process + "8");
                }
            });



            nine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    process = screen.getText().toString();
                    screen.setText(process + "9");
                }
            });


            zero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    process = screen.getText().toString();
                    screen.setText(process + "0");
                }
            });



            doubleZero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    process = screen.getText().toString();
                    screen.setText(process + "00");
                }
            });


            dot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(flag == 0) {
                        process = screen.getText().toString();
                        screen.setText(process + ".");
                        flag = 1;
                    }
                }
            });





// FUNCTION THAT WILL INPUT THE ARITHMETIC OPERATOR

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(checker == 0) {
                        process = screen.getText().toString();
                        output.setText(process);
                        screen.setText("");
                        checker = 1;  // addition
                        flag = 0;
                    }
                }
            });



            minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(checker == 0) {
                        process = screen.getText().toString();
                        output.setText(process);
                        screen.setText("");
                        checker = 2;  // addition
                        flag = 0;
                    }
                }
            });


            multiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(checker == 0) {
                        process = screen.getText().toString();
                        output.setText(process);
                        screen.setText("");
                        checker = 3;  // addition
                        flag = 0;
                    }
                }
            });



            divide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(checker == 0) {
                        process = screen.getText().toString();
                        output.setText(process);
                        screen.setText("");
                        checker = 4;  // addition
                        flag = 0;
                    }
                }
            });


//            total compute


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputCompute = output.getText().toString();
                parse = Float.parseFloat(outputCompute);

                screenCompute = screen.getText().toString();
                parse2 = Float.parseFloat(screenCompute);

                if(checker == 1){
                    output.setText(parse +" + "+ parse2);
                    compute = parse + parse2;
                    screen.setText("" +compute);
                } else if(checker == 2) {
                    output.setText(parse +" - "+ parse2);
                    compute = parse - parse2;
                    screen.setText("" +compute);
                } else if(checker == 3) {
                    output.setText(parse +" * "+ parse2);
                    compute = parse * parse2;
                    screen.setText("" +compute);
                }else if(checker == 4) {
                    output.setText(parse + " / " + parse2);
                    compute = parse / parse2;
                    screen.setText("" + compute);
                }
            }
        });


    }
}