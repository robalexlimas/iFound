package com.example.ifound;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class form_sign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_sign);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button btnLogin = (Button) findViewById(R.id.btnSignBack);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLogin(v);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    private void goLogin(View v) {
        Intent login = new Intent(this, MainActivity.class);
        startActivity(login);
    }

    private void showConfirm(Context context, String message) {
        AlertDialog.Builder modal = new AlertDialog.Builder(context);
        modal.setCancelable(true);
        modal.setPositiveButton(R.string.modal_confirm, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Confirm
            }
        });
        modal.setNegativeButton(R.string.modal_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Cancel
            }
        });
        modal.setMessage(message);
        modal.create();
        modal.show();
    }
}