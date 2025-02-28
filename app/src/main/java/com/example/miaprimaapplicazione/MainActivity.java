package com.example.miaprimaapplicazione;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //credenziali
        String username = "admin";
        String password = "admin";
        //testo
        EditText usernameText = findViewById(R.id.txtUsername);
        EditText passwordText = findViewById(R.id.txtPassword);
        //bottoni
        Button loginButton = findViewById(R.id.btnLogin);
        Button registrationButton = findViewById(R.id.btnRegistrati);
        //visualizzatore errori
        TextView visualizzatoreErrori = findViewById(R.id.textError);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameInserito = usernameText.getText().toString();
                String passwordInserita = passwordText.getText().toString();
                if (usernameInserito.equals(username) && passwordInserita.equals(password))
                {
                    Intent intent = new Intent( MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
                else
                {
                    visualizzatoreErrori.setText("Credenziali errate");
                }
            }
        });
    }
}