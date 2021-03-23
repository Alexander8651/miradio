package com.example.myradio.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myradio.R;

public class LoginActivity extends AppCompatActivity implements ILogin {
    
    EditText nombre;
    Button entrar;
    IPresenter iPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        iPresenter = new Presenter(this, this);

        nombre = findViewById(R.id.nombreEdittext);
        entrar = findViewById(R.id.entrar);

        entrar.setOnClickListener(v ->{
            iPresenter.validarCampos();

        });

    }


    @Override
    public EditText crearNombre() {
        return nombre;
    }

    @Override
    public Button crearButton() {
        return entrar;
    }
}