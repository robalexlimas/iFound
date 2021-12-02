package com.example.ifound;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText user = (EditText) findViewById(R.id.textUser);
                EditText password = (EditText) findViewById(R.id.textPassword);
                if (!user.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
                    showMessage(v.getContext(), user.getText().toString(), password.getText().toString());
                } else {
                    showMessage(v.getContext(), "Error", "Ingrese los datos solicitados");
                }
            }
        });

        Button btnSign = (Button) findViewById(R.id.btnSign);
        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSign(v);
            }
        });
    }

    private void goSign(View v) {
        Intent sign = new Intent(this, form_sign.class);
        startActivity(sign);
    }

    private void showMessage(Context context, String title, String message) {
        AlertDialog.Builder modal = new AlertDialog.Builder(context);
        modal.setTitle(title);
        modal.setMessage(message);
        modal.create();
        modal.show();
    }
}