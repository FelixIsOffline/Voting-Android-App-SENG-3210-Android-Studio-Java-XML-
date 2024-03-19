package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
// Add imports for your other activities if they are in the same package
import com.example.finalproject.LoginActivity;
import com.example.finalproject.ForgotPasswordActivity;
import com.example.finalproject.CreateAccountActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find each button by its ID
        Button loginButton = findViewById(R.id.button); // Login button
        Button forgotPasswordButton = findViewById(R.id.button2); // Forgot Password button
        Button createAccountButton = findViewById(R.id.button4); // Create Account button

        // Set an OnClickListener on the Login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener on the Forgot Password button
        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener on the Create Account button
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });
    }
}
