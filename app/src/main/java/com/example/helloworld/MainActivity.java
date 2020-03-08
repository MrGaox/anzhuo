package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btu = (Button)findViewById(R.id.btn);
        btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editHeight = (EditText)findViewById(R.id.editHeight);
                EditText editWeight = (EditText)findViewById(R.id.editWeight);
                TextView textResult = (TextView)findViewById(R.id.textResult);
                Double height = Double.parseDouble(editHeight.getText().toString());
                Double weight = Double.parseDouble(editWeight.getText().toString());
                /*体质指数BMI==体重(kg)/身高^2(m)
                 * 过轻 ：低于18.5
                 * 正常 ：18.5-23.9
                 *过重：24-27
                 *肥胖：28-32
                 * 非常肥胖：高于32
                 * */
                Double bmi = weight/(height*height);
                CheckBox checkWHO = (CheckBox)findViewById(R.id.checkWHO);
                CheckBox checkAsia = (CheckBox)findViewById(R.id.checkAsia);
                CheckBox checkChina = (CheckBox)findViewById(R.id.checkChina);
                String strResult = "";
                if (checkChina.isChecked()){
                    if (bmi<17.5){
                        strResult += "中国标准 BMI:"+bmi.toString()+"体重过轻！\n";
                    }else if (bmi<=22.4){
                        strResult += "中国标准 BMI:"+bmi.toString()+"体重正常！\n";
                    }else if (bmi<=27.9){
                        strResult += "中国标准 BMI:"+bmi.toString()+"体重过重！\n";
                    }else if (bmi<=32.4){
                        strResult += "中国标准 BMI:"+bmi.toString()+"体重肥胖！\n";
                    }else {
                        strResult += "中国标准 BMI:"+bmi.toString()+"非常肥胖！\n";
                    }
                }
                if (checkAsia.isChecked()){
                    if (bmi<18){
                        strResult += "亚洲标准 BMI:"+bmi.toString()+"体重过轻！\n";
                    }else if (bmi<=23){
                        strResult += "亚洲标准 BMI:"+bmi.toString()+"体重正常！\n";
                    }else if (bmi<=29){
                        strResult += "亚洲标准 BMI:"+bmi.toString()+"体重过重！\n";
                    }else if (bmi<=32.8){
                        strResult += "亚洲标准 BMI:"+bmi.toString()+"体重肥胖！\n";
                    }else {
                        strResult += "亚洲标准 BMI:"+bmi.toString()+"非常肥胖！\n";
                    }
                }
                if (checkWHO.isChecked()){
                    if (bmi<18.5){
                        strResult += "WHO标准 BMI:"+bmi.toString()+"体重过轻！\n";
                    }else if (bmi<=24.9){
                        strResult += "WHO标准 BMI:"+bmi.toString()+"体重正常！\n";
                    }else if (bmi<=28.2){
                        strResult += "WHO标准 BMI:"+bmi.toString()+"体重过重！\n";
                    }else if (bmi<=33){
                        strResult += "WHO标准 BMI:"+bmi.toString()+"体重肥胖！\n";
                    }else {
                        strResult += "WHO标准 BMI:"+bmi.toString()+"非常肥胖！\n";
                    }
                }
                textResult.setText(strResult);
            }
        });
    }
    public void btn_Clicked(View v){

    }
}
