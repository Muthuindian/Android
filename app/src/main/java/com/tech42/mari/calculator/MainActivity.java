package com.tech42.mari.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends Activity {
    TextView result;
    EditText num;
    Button clear_b,roor_b,pow_b,back_b,porm_b,pie_b,open_b,close_b,sin_b,cos_b,tan_b,log_b,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,d_b,div_b,mul_b,sub_b,add_b,eq_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText) findViewById(R.id.editText4);
        num.setSelection(num.getText().length());
        result = (TextView) findViewById(R.id.textView3);
        roor_b = (Button) findViewById(R.id.r_b);
        clear_b = (Button) findViewById(R.id.c_b);
        pow_b = (Button) findViewById(R.id.p_b);
        back_b = (Button) findViewById(R.id.b_b);
        porm_b = (Button) findViewById(R.id.m_b);
        pie_b = (Button) findViewById(R.id.p);
        open_b = (Button) findViewById(R.id.e_b);
        close_b = (Button) findViewById(R.id.per_b);
        sin_b = (Button) findViewById(R.id.button5);
        cos_b = (Button) findViewById(R.id.button9);
        tan_b = (Button) findViewById(R.id.button13);
        log_b = (Button) findViewById(R.id.button31);
        b0 = (Button) findViewById(R.id.button17);
        b1 = (Button) findViewById(R.id.button16);
        b2 = (Button) findViewById(R.id.button23);
        b3 = (Button) findViewById(R.id.button25);
        b4 = (Button) findViewById(R.id.button7);
        b5 = (Button) findViewById(R.id.button11);
        b6 = (Button) findViewById(R.id.button15);
        b7 = (Button) findViewById(R.id.button6);
        b8 = (Button) findViewById(R.id.button10);
        b9 = (Button) findViewById(R.id.button14);
        d_b = (Button) findViewById(R.id.button24);
        eq_b = (Button) findViewById(R.id.button27);
        add_b = (Button) findViewById(R.id.button35);
        sub_b = (Button) findViewById(R.id.button34);
        mul_b = (Button) findViewById(R.id.button33);
        div_b = (Button) findViewById(R.id.button32);
        equalclick();
        clearclick();
        rootclick();
        powerclick();
        backclick();
        numclick();
        trigclick();
    }



    private void trigclick() {
        sin_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = num.getText().toString();
                if(value.isEmpty() == false && value.matches("[0-9.]+") && value.indexOf('.') == value.lastIndexOf('.'))
                {
                Double res = Math.sin(Double.parseDouble(value));
                result.setText(Double.toString(res));}
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Malformed Expression" , Toast.LENGTH_SHORT);
                    toast.setText("Malformed Expression");
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();}
            }
        });
        cos_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = num.getText().toString();
                if(value.isEmpty() == false  && value.matches("[0-9.]+") && value.indexOf('.') == value.lastIndexOf('.')){
                Double res = Math.cos(Double.parseDouble(value));
                result.setText(Double.toString(res));}
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Malformed Expression" , Toast.LENGTH_SHORT);
                    toast.setText("Malformed Expression");
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();}
            }
        });
        tan_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = num.getText().toString();
                if(value.isEmpty() == false && value.matches("[0-9.]+") && value.indexOf('.') == value.lastIndexOf('.')){
                Double res = Math.tan(Double.parseDouble(value));
                result.setText(Double.toString(res));}
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Malformed Expression" , Toast.LENGTH_SHORT);
                    toast.setText("Malformed Expression");
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();
                }
            }
        });
        log_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = num.getText().toString();
                if(value.isEmpty() == false && value.matches("[0-9.]+") && value.indexOf('.') == value.lastIndexOf('.')) {
                Double res = Math.log(Double.parseDouble(value));
                result.setText(Double.toString(res));}
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Malformed Expression" , Toast.LENGTH_SHORT);
                    toast.setText("Malformed Expression");
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();}
            }
        });
    }

    private void numclick() {
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("9");
            }
        });
        d_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append(".");
            }
        });
        porm_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("-");
            }
        });
        pie_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("3.14159");
            }
        });
        open_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("(");
            }
        });
        close_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append(")");
            }
        });
        add_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("+");
            }
        });
        sub_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("-");
            }
        });
        mul_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("*");
            }
        });
        div_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.append("/");
            }
        });


    }

    private void clearclick() {

        clear_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText("");result.setText("");
            }
        });
    }

    private void rootclick() {
        roor_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = num.getText().toString();
                if(value.isEmpty() == false && value.matches("[0-9]+") && value.indexOf('.') == value.lastIndexOf('.')) {
                    Double root = java.lang.Math.sqrt(Double.parseDouble(value));
                    result.setText(Double.toString(root));
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Malformed Expression" , Toast.LENGTH_SHORT);
                    toast.setText("Malformed Expression");
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();}
            }
        });

    }
    private void powerclick() {
        pow_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = num.getText().toString();
                if(value.isEmpty() == false && value.matches("[0-9]+") && value.indexOf('.') == value.lastIndexOf('.')) {
                    Double power = java.lang.Math.pow(Double.parseDouble(value), 2);
                    result.setText(Double.toString(power));
                }
                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Malformed Expression" , Toast.LENGTH_SHORT);
                    toast.setText("Malformed Expression");
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();}
            }
        });

    }
    private void backclick() {
        back_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value = num.getText().toString();
                if(value.isEmpty() == false) {
                    value = value.substring(0, value.length() - 1);
                    //StringBuilder builder = new StringBuilder(value);
                    //builder.deleteCharAt(builder.length()-1);
                    num.setText(value);
                    num.setSelection(num.getText().length());
                }
                else
                { }
            }
        });
    }
    private void equalclick() {
        eq_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = num.getText().toString();
                    try {
                        Expression expression = new ExpressionBuilder(value).build();
                        Double res = expression.evaluate();
                        result.setText(Double.toString(res));
                    } catch (ArithmeticException | IllegalArgumentException ex) {
                        if(!value.isEmpty()) {
                            Toast toast = Toast.makeText(getApplicationContext(), "Malformed Expression" , Toast.LENGTH_SHORT);
                            toast.setText("Malformed Expression");
                            toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                            toast.show();}
                        }

            }
        });

        }
    }


