package com.astasio.siminfo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;

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
        TextToSpeech t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override

            public void onInit(int status) {
                // if (status != TextToSpeech.ERROR) {
                //   t1.setLanguage(Locale.ITALIAN);
                // Voice v=new Voice("it-IT-x-sfg#male_1-local",new Locale("it","IT"),400,200,true,null);
                // t1.setVoice(v);
            }
        });

        button.setOnClickListener(
                v -> {
                    t1.speak(button.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                    //codice USSD
                    String UssdCode = "*111" + Uri.encode("#");
                    if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + UssdCode)));
                    }
                    });
        button2.setOnClickListener(
                v -> {
                    t1.speak(button2.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                    String UssdCode = "*123" + Uri.encode("#");
                    if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + UssdCode)));
                    }
                });
        button3.setOnClickListener(
                v -> {
                    t1.speak(button3.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                    //404040
                    String UssdCode = "404040";
                    if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + UssdCode)));
                    }
                });
        button4.setOnClickListener(
                v -> {
                    t1.speak(button4.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                    //406040
                    String UssdCode = "406040";
                    if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + UssdCode)));
                    }
                });
        button5.setOnClickListener(
                v -> {
                    t1.speak(button5.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                    startActivity(new Intent(MainActivity.this,
                            MainActivity3.class));

                });
    }
}

