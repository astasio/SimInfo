package com.astasio.siminfo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button = findViewById(R.id.button);
        EditText Pin = findViewById(R.id.editTextTextPersonName3);
        button.setOnClickListener(
                v -> {
                    //get PIN
                    String text1 = Pin.getText().toString();
                    //code USSD
                    String UssdCode = "*125*" + text1 + Uri.encode("#");
                    if (ActivityCompat.checkSelfPermission(MainActivity3.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(MainActivity3.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + UssdCode)));
                    }
                });
    }
}