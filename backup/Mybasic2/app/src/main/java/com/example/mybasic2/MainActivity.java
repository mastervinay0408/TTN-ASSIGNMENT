package com.example.mybasic2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox check1,check2,check3 ;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenCheck();
        addListenerButton();


    }

    public void addListenCheck(){
            check1=(CheckBox)findViewById(R.id.checkBox);
            check2=(CheckBox)findViewById(R.id.checkBox2);
            check3=(CheckBox)findViewById(R.id.checkBox3);

            check1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(((CheckBox)v).isChecked()){
                                Toast.makeText(MainActivity.this,"Dog is barking",Toast.LENGTH_LONG).show();
                            }
                        }
                    }
            );
            check2.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(((CheckBox)v).isChecked()){
                                Toast.makeText(MainActivity.this,"cat is meow",Toast.LENGTH_LONG).show();
                            }
                        }
                    }
            );
            check3.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(((CheckBox)v).isChecked()){
                                Toast.makeText(MainActivity.this,"cow giving milk",Toast.LENGTH_LONG).show();
                            }
                        }
                    }
            );
        }






    public void addListenerButton(){
        check1=(CheckBox)findViewById(R.id.checkBox);
        check2=(CheckBox)findViewById(R.id.checkBox2);
        check3=(CheckBox)findViewById(R.id.checkBox3);
        button=(Button)findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                        StringBuffer result= new StringBuffer();
                                        result.append("dog : ").append(check1.isChecked());
                                        result.append("\n cat : ").append(check2.isChecked());
                                        result.append("\n cow : ").append(check3.isChecked());
                                          Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_LONG).show();
                                      }
                                  }

        );

    }
}
