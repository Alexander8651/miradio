package com.example.myradio.login;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myradio.home.MainActivity;

public class Presenter  implements IPresenter{

    ILogin iLogin;
    Context context;

    Button entrar;
    EditText nombre;

    public Presenter(ILogin iLogin, Context context) {
        this.iLogin = iLogin;
        this.context = context;

    }

    @Override
    public void validarCampos() {
        nombre = iLogin.crearNombre();

        entrar = iLogin.crearButton();

        if (!nombre.getText().toString().isEmpty()){

            Intent intent = new Intent(context, MainActivity.class);
            intent.putExtra("nombre", nombre.getText().toString());
            context.startActivity(intent);
        }else {

            Toast.makeText(context, "Ingresa tu  nombre", Toast.LENGTH_SHORT).show();



        }
    }
}
