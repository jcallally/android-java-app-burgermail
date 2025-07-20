package com.example.burgermail;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.Calendar;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Mostrar firma con año actual y version
        TextView texto = findViewById(R.id.version);
        texto.setText(getFirmaConVersion());

        // Ir a MainActivity luego de 4 segundos
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }, 3000);
    }

    // Obtener firma con año actual y versión de la app
    private String getFirmaConVersion() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return "© " + year + " JavCodeDev • v1.0.0";
    }
}