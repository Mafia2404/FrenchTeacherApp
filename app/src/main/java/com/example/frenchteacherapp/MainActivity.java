package com.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button black,yellow,green,purple,red;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //write code here
        black=findViewById(R.id.button6);
        yellow=findViewById(R.id.button10);
        green=findViewById(R.id.button7);
        purple=findViewById(R.id.button8);
        red=findViewById(R.id.button9);

        black.setOnClickListener(this);
        yellow.setOnClickListener(this);
        green.setOnClickListener(this);
        purple.setOnClickListener(this);
        red.setOnClickListener(this);



        //adding sound
        // use 'getApplicationContext()' to get context of application (access raw folder)
        // or 'this' any one to

        /*
        black.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.black);
            mediaPlayer.start();
        });
        yellow.setOnClickListener(v-> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.yellow);
            mediaPlayer.start();
        });
        green.setOnClickListener(v-> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.green);
            mediaPlayer.start();
        });
        purple.setOnClickListener(v-> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.purple);
            mediaPlayer.start();
        });
        red.setOnClickListener(v-> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.red);
            mediaPlayer.start();
        });
*/
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void playsound(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, id);
        mediaPlayer.start();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button6)
        playsound(R.raw.black);
        else if(v.getId()==R.id.button7)
        playsound(R.raw.green);
        else if(v.getId()==R.id.button8)
        playsound(R.raw.purple);
        else if(v.getId()==R.id.button9)
        playsound(R.raw.red);
        else if(v.getId()==R.id.button10)
        playsound(R.raw.yellow);
        else
            return;

    }
}