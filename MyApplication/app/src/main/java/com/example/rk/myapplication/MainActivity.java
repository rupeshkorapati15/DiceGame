package com.example.rk.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static com.example.rk.myapplication.R.id.screen;

public class MainActivity extends AppCompatActivity {

    private View v;
    private TextView tv, tv1, tv2,e1;

    private Button button10;
    private Button button9;

    private int count=0,e2,n;
    private String expression="";
    private String text="";
    Random rand = new Random();


    private String str1,str2,str3,result,str,sign;
    private Double a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tv = (TextView)this.findViewById(R.id.myLabel);
        this.tv1 = (TextView)this.findViewById(R.id.myLabel11);
        this.tv2 = (TextView)this.findViewById(R.id.myLabel3);
        this.e1=(TextView)this.findViewById(R.id.editText1);


    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.button0:

                this.tv.setText("0");
                break;

            case R.id.button1:
                e2=1;
                this.tv.setText("1");
                break;

            case R.id.button2:

                e2=2;
                this.tv.setText("2");
                break;


            case R.id.button3:
                e2=3;
                this.tv.setText("3");
                break;


            case R.id.button4:
                e2=4;
                this.tv.setText("4");
                break;

            case R.id.button5:
                e2=5;
                this.tv.setText("5");
                break;

            case R.id.button6:
                e2=6;
                this.tv.setText("6");
                break;

            case R.id.button7:
                e2=7;
                this.tv.setText("7");
                break;

            case R.id.button8:
                e2=8;
                this.tv.setText("8");
                break;

            case R.id.button9:
                e2=9;
                this.tv.setText("9");
                break;









        }
    }
    public void onClick1(View v)
    {
        switch(v.getId()) {

            case R.id.imageButton9:
                rand = new Random();
                n = rand.nextInt(4) + 1;
                n = 4;
                this.tv1.setText("D4");
                break;

            case R.id.imageButton11:
                rand = new Random();
                n = rand.nextInt(8) + 1;
                n = 8;
                this.tv1.setText("D8");
                break;
            case R.id.imageButton12:
                rand = new Random();
                n = rand.nextInt(6) + 1;
                n = 6;
                this.tv1.setText("D6");
                break;
            case R.id.imageButton8:
                rand = new Random();
                n = rand.nextInt(10) + 1;
                n = 10;
                this.tv1.setText("D10");
                break;
            case R.id.imageButton10:
                rand = new Random();
                n = rand.nextInt(12) + 1;
                n = 12;
                this.tv1.setText("D12");
                break;
            case R.id.imageButton13:
                rand = new Random();
                n = rand.nextInt(20) + 1;
                n = 20;
                this.tv1.setText("D20");
                break;


        }



    }

    public void onClick2(View v)
    {
        e1.setText("");
        int i;
        int total=0;

        for(i=0; i < (e2); i++)
        {

            rand = new Random();
            int x = rand.nextInt(n) + 1;
            if(i==0)
                e1.setText("" + x);
            if(i!=0)
            e1.setText(e1.getText()+ "+" + x);







            total = total + x;


        }
        tv2.setText(""+ total);

    }
    public void onClick3(View v)
    {
        e1.setText("");
        tv.setText("");
        tv1.setText("");
        tv2.setText("");
    }

    public void onClick4(View v)
    {
        e1.setText("");
        tv.setText("");
        tv1.setText("");
        tv2.setText("");
        rand = new Random();
        int x = rand.nextInt(100) + 1;
        tv2.setText("" + x);
    }



}
