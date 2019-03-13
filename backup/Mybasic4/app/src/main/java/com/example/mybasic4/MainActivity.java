package com.example.mybasic4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        RadioGroup r1;
        RadioButton c1,c2,c3;
        Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickListner();
    }


    public void OnclickListner(){
        r1=(RadioGroup)findViewById(R.id.Rg);
        b1=(Button)findViewById(R.id.button);


        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int select_id=r1.getCheckedRadioButtonId();
                        c1=(RadioButton)findViewById(select_id);

                        Toast.makeText(MainActivity.this,c1.getText(),Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }




}
