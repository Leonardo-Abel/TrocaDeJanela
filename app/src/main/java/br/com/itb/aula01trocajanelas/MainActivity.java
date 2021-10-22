package br.com.itb.aula01trocajanelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btnTrocarJanela);
        btn1.setOnClickListener(view -> {
            Intent it = new Intent(getBaseContext(),MainActivity2.class);
            startActivity(it);
        });

    }
}