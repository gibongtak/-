package com.example.a230410widget_checkbox_radiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    CheckBox checkBox;
    RadioGroup rGroup;
    RadioButton rbntCat, rbntDog, rbntRabbit;
    Button bnt1;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("애완동물 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        checkBox = (CheckBox) findViewById(R.id.ChkAgree);

        text2 = (TextView) findViewById(R.id.text2);
        rGroup = (RadioGroup) findViewById(R.id.Rgroup);
        rbntCat = (RadioButton) findViewById(R.id.BtnCat);
        rbntDog = (RadioButton) findViewById(R.id.BtnDog);
        rbntRabbit = (RadioButton) findViewById(R.id.BtnRabbit);

        bnt1 = (Button) findViewById(R.id.BtnSelect);
        imgPet = (ImageView) findViewById(R.id.ImgPet);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox.isChecked() == true)
                {
                    text2.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    bnt1.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }
                else
                {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    bnt1.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(rGroup.getCheckedRadioButtonId()){
                    case R.id.BtnCat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.BtnDog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.BtnRabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}