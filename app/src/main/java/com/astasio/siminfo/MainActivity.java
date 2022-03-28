package com.astasio.siminfo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button_num);
        Button button2 = findViewById(R.id.button_credit);
        Button button3 = findViewById(R.id.button_services);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        CheckBox check = findViewById(R.id.check_voice);
        setupHyperlink();
        TextToSpeech t1 = new TextToSpeech(getApplicationContext(), status -> {
        });

        button.setOnClickListener(
                v -> {
                    if (check.isChecked()) {
                        t1.speak(button.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                    }
                    /* code USSD */
                    String UssdCode = "*111" + Uri.encode("#");
                    if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + UssdCode)));
                    }
                });
        button2.setOnClickListener(
                v -> {
                    if (check.isChecked()) {
                        t1.speak(button2.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                    }
                    String UssdCode = "*123" + Uri.encode("#");
                    if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + UssdCode)));
                    }
                });
        button3.setOnClickListener(
                v -> {
                    if (check.isChecked()) {
                        t1.speak(button3.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                    }                    //404040
                    String UssdCode = "404040";
                    if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + UssdCode)));
                    }
                });
        button4.setOnClickListener(
                v -> {
                    if (check.isChecked()) {
                        t1.speak(button4.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                    }                    //406040
                    String UssdCode = "406040";
                    if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + UssdCode)));
                    }
                });
        button6.setOnClickListener(
                v -> {
                    if (check.isChecked()) {
                        t1.speak(button6.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                    }
                    startActivity(new Intent(MainActivity.this,
                            MainActivity3.class));

                });
        button5.setOnClickListener(
                v -> {
                    if (check.isChecked()) {
                        t1.speak(button5.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                    }
                    startActivity(new Intent(MainActivity.this,
                            MainActivity2.class));

                });
    }

    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.activity_main_link);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

