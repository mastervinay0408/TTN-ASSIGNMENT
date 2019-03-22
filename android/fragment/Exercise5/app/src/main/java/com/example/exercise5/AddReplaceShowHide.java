package com.example.exercise5;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.exercise5.fragment.Fragment1;
import com.example.exercise5.fragment.Fragment2;

public class AddReplaceShowHide extends AppCompatActivity {

    Button btn_add_fragment1, btn_show_fragment1, btn_hide_fragment1, btn_remove_fragment1;
    Button btn_replace_fragment1, btn_add_fragment2, btn_show_fragment2, btn_hide_fragment2;
    Button btn_remove_fragment2, btn_replace_fragment2;
    FragmentManager manager;
    FragmentTransaction transaction;
    Fragment1 fragment1;
    Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_replace_show_hide);

        btn_add_fragment1 = findViewById(R.id.btn_add_fragment1);
        btn_show_fragment1 = findViewById(R.id.btn_show_fragment1);
        btn_hide_fragment1 = findViewById(R.id.btn_hide_fragment1);
        btn_remove_fragment1 = findViewById(R.id.btn_remove_fragment1);
        btn_replace_fragment1 = findViewById(R.id.btn_replace_fragment1);
        btn_add_fragment2 = findViewById(R.id.btn_add_fragment2);
        btn_show_fragment2 = findViewById(R.id.btn_show_fragment2);
        btn_hide_fragment2 = findViewById(R.id.btn_hide_fragment2);
        btn_remove_fragment2 = findViewById(R.id.btn_remove_fragment2);
        btn_replace_fragment2 = findViewById(R.id.btn_replace_fragment2);
        manager = getSupportFragmentManager();
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();

        btn_add_fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isFragment1Present = manager.popBackStackImmediate("Fragment1", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                boolean isFragment2Present = manager.popBackStackImmediate("Fragment2", FragmentManager.POP_BACK_STACK_INCLUSIVE);

                if (!isFragment1Present) {
                    if (isFragment2Present) {
                        manager.popBackStackImmediate("Fragment2", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    }
                    transaction = manager.beginTransaction();
                    transaction.add(R.id.fragment_container, fragment1);
                    transaction.addToBackStack("Fragment1");
                    transaction.commit();
                } else {
                    manager.popBackStackImmediate("Fragment1", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    Toast.makeText(v.getContext(), "Fragmen1 already added!\nPress Again To Add!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_show_fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
                transaction.show(fragment1);
                transaction.commit();
            }
        });
        btn_hide_fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
                transaction.hide(fragment1);
                transaction.commit();
            }
        });
        btn_remove_fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
                transaction.remove(fragment1);
                transaction.commit();
            }
        });
        btn_replace_fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isFragment1Present = manager.popBackStackImmediate("Fragment1", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                boolean isFragment2Present = manager.popBackStackImmediate("Fragment2", FragmentManager.POP_BACK_STACK_INCLUSIVE);

                if (!isFragment2Present) {
                    if (isFragment1Present) {
                        manager.popBackStackImmediate("Fragment2", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    }
                    transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, fragment2);
                    transaction.addToBackStack("Fragment2");
                    transaction.commit();
                } else {
                    manager.popBackStackImmediate("Fragment2", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    Toast.makeText(v.getContext(), "Fragment2 already added!\nPress Again To Add!", Toast.LENGTH_SHORT).show();
                }
//                transaction = manager.beginTransaction();
//                transaction.replace(R.id.fragment_container, fragment2);
//                transaction.addToBackStack("Fragment2");
//                transaction.commit();
            }
        });
        btn_add_fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isFragment1Present = manager.popBackStackImmediate("Fragment1", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                boolean isFragment2Present = manager.popBackStackImmediate("Fragment2", FragmentManager.POP_BACK_STACK_INCLUSIVE);

                if (!isFragment2Present) {
                    if (isFragment1Present) {
                        manager.popBackStackImmediate("Fragment2", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    }
                    transaction = manager.beginTransaction();
                    transaction.add(R.id.fragment_container, fragment2);
                    transaction.addToBackStack("Fragment2");
                    transaction.commit();
                } else {
                    manager.popBackStackImmediate("Fragment2", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    Toast.makeText(v.getContext(), "Fragment2 already added!\nPress Again To Add!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_show_fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
                transaction.show(fragment2);
                transaction.commit();
            }
        });
        btn_hide_fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
                transaction.hide(fragment2);
                transaction.commit();
            }
        });
        btn_remove_fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
                transaction.remove(fragment2);
                transaction.commit();
            }
        });
        btn_replace_fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isFragment1Present = manager.popBackStackImmediate("Fragment1", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                boolean isFragment2Present = manager.popBackStackImmediate("Fragment2", FragmentManager.POP_BACK_STACK_INCLUSIVE);

                if (!isFragment1Present) {
                    if (isFragment2Present) {
                        manager.popBackStackImmediate("Fragment2", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    }
                    transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, fragment1);
                    transaction.addToBackStack("Fragment1");
                    transaction.commit();
                } else {
                    manager.popBackStackImmediate("Fragment1", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    Toast.makeText(v.getContext(), "Fragmen1 already added!\nPress Again To Add!", Toast.LENGTH_SHORT).show();
                }
//                transaction = manager.beginTransaction();
//                transaction.replace(R.id.fragment_container, fragment1);
//                transaction.addToBackStack("Fragment1");
//                transaction.commit();
            }
        });
    }
}
