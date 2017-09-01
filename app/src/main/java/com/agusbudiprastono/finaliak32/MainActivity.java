package com.agusbudiprastono.finaliak32;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ImageButton ib1 =(ImageButton) findViewById(R.id.ib1);

        ImageButton ib2 =(ImageButton) findViewById(R.id.ib2);

        ib1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent pindah = new Intent(MainActivity.this,KuisActivity.class);
                startActivity(pindah);


            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                moveTaskToBack(true);



            }
        });


    }


}
