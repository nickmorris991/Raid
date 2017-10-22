package com.example.nickm.raidnumberone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            /**
             * Get the button
             */
            Button docRegButton = (Button) findViewById(R.id.docRegButton);
            /**
             * use submit button
             */
            docRegButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Submit successful. Application being reviewed.", Toast.LENGTH_LONG)
                                .show();

                }
            });

        }
    }

