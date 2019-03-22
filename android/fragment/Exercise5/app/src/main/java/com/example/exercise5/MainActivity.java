package com.example.exercise5;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DialogFragmentExample.IDialogFragmentListener {

    Button btn_ques1, btn_ques2, btn_ques3, btn_ques4;
    TextView dialog_fragment_tv;
    int mFlag;
    DialogFragmentExample dialogFragmentExample;
    FragmentManager manager;
    FragmentTransaction transaction;
    PreferenceFragmentExample preferenceFragmentExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ques1 = findViewById(R.id.btn_ques1);
        btn_ques2 = findViewById(R.id.btn_ques2);
        btn_ques3 = findViewById(R.id.btn_ques3);
        btn_ques4 = findViewById(R.id.btn_ques4);
        dialog_fragment_tv = findViewById(R.id.dialog_text_view);
        dialogFragmentExample = new DialogFragmentExample();
        dialogFragmentExample.setFragmentComm(this);
        preferenceFragmentExample = new PreferenceFragmentExample();
        manager = getSupportFragmentManager();
        mFlag = 0;

        btn_ques1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddReplaceShowHide.class);
                startActivity(intent);
            }
        });

        btn_ques2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.popBackStackImmediate("PreferenceFragment", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                dialogFragmentExample.show(getSupportFragmentManager(), "Dialog Fragment");
            }
        });

        btn_ques3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog_fragment_tv.setVisibility(View.GONE);
                boolean isFragmentPresent = manager.popBackStackImmediate("PreferenceFragment", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                if (!isFragmentPresent) {
                    transaction = manager.beginTransaction();
                    transaction.add(R.id.fragment_container_main, preferenceFragmentExample)
                            .addToBackStack("PreferenceFragment")
                            .commit();
                } else {
                    manager.popBackStackImmediate("PreferenceFragment", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    Toast.makeText(MainActivity.this, "Preference Fragment already added!\nPress Again To Add!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_ques4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FragA2FragB.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void sendData(String name) {
        dialog_fragment_tv.setVisibility(View.VISIBLE);
        dialog_fragment_tv.setText("Data Communicated from Dialog Fragment\nName: " + name);
    }
}
