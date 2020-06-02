package com.example.Calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button zero, one, two, three, four, five, six, seven, eight, nine, dot, ac, plus, minus, mul, div, equal;
    float mone, mtwo;
    EditText editText;
    View view;
    int b=0;

    boolean add, sub, mull, divv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        mul = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        dot = findViewById(R.id.dot);
        ac = findViewById(R.id.ac);
        equal = findViewById(R.id.equal);
        editText = findViewById(R.id.edi);
        view = findViewById(R.id.rel);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mone = Float.parseFloat(editText.getText() + "");
                add = true;
                editText.setText(null);

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mone = Float.parseFloat(editText.getText() + "");
                sub = true;
                editText.setText(null);

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mone = Float.parseFloat(editText.getText() + "");
                mull = true;
                editText.setText(null);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mone = Float.parseFloat(editText.getText() + "");
                divv = true;
                editText.setText(null);

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtwo = Float.parseFloat(editText.getText() + "");

                if (add == true) {
                    editText.setText(mone + mtwo + "");
                    add = false;
                }
                if (sub == true) {
                    editText.setText(mone - mtwo + "");
                    sub = false;
                }
                if (mull == true) {
                    editText.setText(mone * mtwo + "");
                    mull = false;
                }
                if (divv == true) {
                    editText.setText(mone / mtwo + "");
                    divv = false;
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.b1:

                b = 1;
                view.setBackgroundResource(R.drawable.back2);
                return true;
            case R.id.b2:
                b = 2;
                view.setBackgroundResource(R.drawable.back1);
                return true;
            case R.id.b3:
                b = 3;
                view.setBackgroundResource(R.drawable.call);
                return true;
            case R.id.b4:
                b = 4;
                view.setBackgroundResource(R.drawable.cal);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

