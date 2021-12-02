package com.example.ifound;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage(v.getContext(), "Error", "Error in login");
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