package com.example.sound;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer = new MediaPlayer();

    private EditText address;

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        address = findViewById(R.id.address);
        button = findViewById(R.id.button);
    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view) throws IOException {
        address.getText();
        // запись файла в mediaPlayer, задаются параметры (путь файла, смещение относительно начала файла, длина аудио в файле)
        mediaPlayer =MediaPlayer.create(this, (Uri) address.getText());
        mediaPlayer.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}