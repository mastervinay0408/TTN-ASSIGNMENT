package com.example.sharedprefernce;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.sharedprefernce.MainActivity.Email;
import static com.example.sharedprefernce.MainActivity.MyPREFERENCES;
import static com.example.sharedprefernce.MainActivity.Name;
import static com.example.sharedprefernce.MainActivity.Phone;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SharedPreferences preferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        String name = preferences.getString(Name, "");
        String phone = preferences.getString(Phone, "");
        String email = preferences.getString(Email, "");
        TextView ed1 = findViewById(R.id.tv1);
        TextView ed2 = findViewById(R.id.tv2);
        TextView ed3 = findViewById(R.id.tv3);
        ed1.setText(name);
        ed2.setText(phone);
        ed3.setText(email);


        setlogout();
    }


    public void setlogout() {
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SharedPreferences preferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();


                editor.remove("FIRST RUN");
                editor.clear();
                editor.apply();


                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);

                Toast.makeText(Login.this, "back", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
