package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrir(View view){
        // toast customizado
        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setImageResource(android.R.drawable.star_big_off);
        //TextView textView = new TextView(getApplicationContext());
        //textView.setBackgroundResource(R.color.colorAccent);
        //textView.setText("Ação realizada com sucesso");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(imageView);
        toast.show();

        //toast básico
        /*
        Toast.makeText(
                getApplicationContext(),
                "Ação realizada oom sucesso",
                Toast.LENGTH_LONG
        ).show();
        */
    }
}
