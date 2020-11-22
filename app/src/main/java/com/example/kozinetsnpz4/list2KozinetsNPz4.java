package com.example.kozinetsnpz4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable2;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class list2KozinetsNPz4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2_kozinets_n_pz4);

        ImageView imageAnim = findViewById(R.id.claus);
        Animation imgClaus = AnimationUtils.loadAnimation(this, R.anim.animation_claus);
        imageAnim.startAnimation(imgClaus);
    }

    public void clickHome(View view) {
        Intent intentNum = new Intent(list2KozinetsNPz4.this,
                MainActivity.class);
        startActivity(intentNum);
    }
}