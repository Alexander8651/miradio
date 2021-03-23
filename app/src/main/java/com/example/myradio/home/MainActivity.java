package com.example.myradio.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myradio.R;

public class MainActivity extends AppCompatActivity implements IMain {

    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombreusuario);

        if (getIntent().getExtras().getString("nombre") != null){
            final String nombreUsuario = getIntent().getExtras().getString("nombre");
            nombre.setText(nombreUsuario);

        }

    }
}