package com.example.miaprimaapplicazione;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        final User[] insertUser = {null};
        Button registrationButton = findViewById(R.id.btnSave);
        Button backButton = findViewById(R.id.btnGoBack);

        EditText registrationName = findViewById(R.id.txtNome);
        EditText registrationSurname = findViewById(R.id.txtCognome);
        EditText registrationDate = findViewById(R.id.txtDataNascita);
        EditText registrationPassword = findViewById(R.id.txtPasswordRegistration);
        EditText registrationUsername = findViewById(R.id.txtUsernameRegistration);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( RegistrationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeInserito = registrationName.getText().toString();
                String cognomeInserito = registrationSurname.getText().toString();
                String dataInserita = registrationDate.getText().toString();
                String passwordInserita = registrationPassword.getText().toString();
                String usernameInserito = registrationUsername.getText().toString();
                insertUser[0] = new User(usernameInserito, passwordInserita, nomeInserito, cognomeInserito, dataInserita);
                //scrittura dei log
                Log.d("Registrazione", " Nome: " + insertUser[0].getName() + " Cognome: " + insertUser[0].getSurname() + " Data: " + insertUser[0].getDate() + " Password: " + insertUser[0].getPassword() + " Username: " + insertUser[0].getUsername());
                Toast.makeText(RegistrationActivity.this, "Utente registrato: " + insertUser[0].getUsername(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent( RegistrationActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}