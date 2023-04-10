package com.example.a230410widget_checkbox_radiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch swi;
    RadioGroup rGroup;
    RadioButton rbntQ, rbntR, rbntS;
    Button bntClose, bntReset;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("안드로이드 버전 선택!");

        text1 = (TextView) findViewById(R.id.Text1);
        swi = (Switch) findViewById(R.id.Swi);

        text2 = (TextView) findViewById(R.id.text2);
        rGroup = (RadioGroup) findViewById(R.id.Rgroup);
        rbntQ = (RadioButton) findViewById(R.id.BtnQ);
        rbntR = (RadioButton) findViewById(R.id.BtnR);
        rbntS = (RadioButton) findViewById(R.id.BtnS);

        bntClose = (Button) findViewById(R.id.BtnClose);
        bntReset = (Button) findViewById(R.id.BtnReset);
        img = (ImageView) findViewById(R.id.Img);
        //imgPet.setVisibility(View.INVISIBLE);
        swi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == false)
                {
                    rGroup.setVisibility(View.INVISIBLE);
                    rbntQ.setVisibility(View.INVISIBLE);
                    rbntR.setVisibility(View.INVISIBLE);
                    rbntS.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                    bntClose.setVisibility(View.INVISIBLE);
                    bntReset.setVisibility(View.INVISIBLE);
                } else if (b == true) {
                    rGroup.setVisibility(View.VISIBLE);
                    rbntQ.setVisibility(View.VISIBLE);
                    rbntR.setVisibility(View.VISIBLE);
                    rbntS.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                    bntClose.setVisibility(View.VISIBLE);
                    bntReset.setVisibility(View.VISIBLE);
                }
            }
        });
        rbntQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.qq);
            }
        });
        rbntR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.rr);
            }
        });
        rbntS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.ss);
            }
        });

        bntClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                finishAndRemoveTask();
                System.exit(0);
            }
        });
        bntReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rbntQ.setChecked(false);
                rbntR.setChecked(false);
                rbntS.setChecked(false);
                swi.setChecked(false);
            }
        });

    }
}