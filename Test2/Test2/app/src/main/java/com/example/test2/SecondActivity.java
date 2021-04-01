package com.example.test2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.test2.fragment.FirstFragment;
import com.example.test2.fragment.FourthFragment;
import com.example.test2.fragment.SecondFragment;
import com.example.test2.fragment.ThirdFragment;

public class SecondActivity extends AppCompatActivity {

    private FirstFragment firstFragment;
    private SecondFragment secondFragment;
    private ThirdFragment thirdFragment;
    private FourthFragment fourthFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initFragment();
        Intent intent = getIntent();
        String a = intent.getStringExtra("btn");
        if(a.equals("a2")){
            showSecondFragment();
        }
        else if(a.equals("a1")){
            showFirstFragment();
        } else if(a.equals("a3")){
            showThirdFragment();
        }else if(a.equals("a4")){
            showFourthFragment();
        }
    }

    private void showFirstFragment(){
        getSupportFragmentManager().beginTransaction().show(firstFragment).hide(secondFragment).hide(thirdFragment).hide(fourthFragment).commit();
    }

    private void showSecondFragment(){
        getSupportFragmentManager().beginTransaction().show(secondFragment).hide(firstFragment).hide(thirdFragment).hide(fourthFragment).commit();
    }

    private void showThirdFragment(){
        getSupportFragmentManager().beginTransaction().show(thirdFragment).hide(firstFragment).hide(secondFragment).hide(fourthFragment).commit();
    }

    private void showFourthFragment(){
        getSupportFragmentManager().beginTransaction().show(fourthFragment).hide(firstFragment).hide(secondFragment).hide(thirdFragment).commit();
    }

    private void initFragment(){
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();
        fourthFragment = new FourthFragment();


        getSupportFragmentManager().beginTransaction()
                .add(R.id.ln_second, firstFragment, FirstFragment.class.getName())
                .add(R.id.ln_second, secondFragment, SecondFragment.class.getName())
                .add(R.id.ln_second, thirdFragment, ThirdFragment.class.getName())
                .add(R.id.ln_second, fourthFragment, FourthFragment.class.getName())
                .commit();
    }




}