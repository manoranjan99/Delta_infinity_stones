package com.manoranjank.deltatask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class stone extends AppCompatActivity {
        TextView mStone1,mStone2,mStone3,mStone4,mStone5,mStone6;
   public static int x1=0,x2=0,x3=0,x4=0,x5=0,x6=0;

    Button mButtonReset;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        mStone1 = (TextView) findViewById(R.id.stone1);
        mStone2 = (TextView) findViewById(R.id.stone2);
        mStone3 = (TextView) findViewById(R.id.stone3);
        mStone4 = (TextView) findViewById(R.id.stone4);
        mStone5 = (TextView) findViewById(R.id.stone5);
        mStone6 = (TextView) findViewById(R.id.stone6);

        mButtonReset=(Button) findViewById(R.id.buttonreset);


        mStone1.setText(String.valueOf(x1));
        mStone2.setText(String.valueOf(x2));
        mStone3.setText(String.valueOf(x3));
        mStone4.setText(String.valueOf(x4));
        mStone5.setText(String.valueOf(x5));
        mStone6.setText(String.valueOf(x6));

        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x1=0;x2=0;x3=0;x4=0;x5=0;x6=0;
                mStone1.setText(String.valueOf(x1));
                mStone2.setText(String.valueOf(x2));
                mStone3.setText(String.valueOf(x3));
                mStone4.setText(String.valueOf(x4));
                mStone5.setText(String.valueOf(x5));
                mStone6.setText(String.valueOf(x6));

            }
        });



        ImageButton mBackButton;
        mBackButton = (ImageButton) findViewById(R.id.backButton);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    }


