package com.example.kozinetsnpz4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void ClickTextNewYear(View view) {
        Intent intentNum = new Intent(MainActivity.this,
                list2KozinetsNPz4.class);
        startActivity(intentNum);


    }

    public void clickGaleryr(View view) {
        Intent intentNum = new Intent(MainActivity.this,
                list3.class);
        startActivity(intentNum);
    }

    public void ClickIcon(View view) {
        textView.setText("Ну шо, не ждали!?");

        Toast num = Toast.makeText(MainActivity.this,
                "вы нажали на 3 кнопку, зачем?", Toast.LENGTH_LONG);
        num.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout numView = (LinearLayout) num.getView();
        ImageView imageView = new ImageView(MainActivity.this);
        imageView.setImageResource(R.drawable.num);
        num.show();

    }
}