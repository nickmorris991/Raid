package com.example.nickm.raidnumberone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ImageButton doctorImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doctorImageButton = (ImageButton) findViewById(R.id.imageButton4);
        doctorImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }

}
