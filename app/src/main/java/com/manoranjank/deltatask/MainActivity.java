package com.manoranjank.deltatask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int mStone[]={R.drawable.stone1,R.drawable.stone2,R.drawable.stone3,R.drawable.stone4,R.drawable.stone5,R.drawable.stone6};
    int mStoneName[]={R.string.stone1,R.string.stone2,R.string.stone3,R.string.stone4,R.string.stone5,R.string.stone6};
    int mBackground[]={R.drawable.green,R.drawable.red,R.drawable.blue,R.drawable.violet,R.drawable.orange,R.drawable.yellow};
    RelativeLayout mRelativeLayout;

     int x;

    ImageView mImageView;
    TextView mTextView;
    ImageButton mPressButton;
    ImageButton mListButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mRelativeLayout=(RelativeLayout) findViewById(R.id.bg);
         mPressButton=(ImageButton) findViewById(R.id.press);
         mTextView=(TextView) findViewById(R.id.stonename);
         mImageView=(ImageView) findViewById(R.id.st);
         mListButton=(ImageButton) findViewById(R.id.List);





        mPressButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Random mRandom=new Random();
                 x= mRandom.nextInt(6);
                 mImageView.setImageResource(mStone[x]);
                 mTextView.setText(mStoneName[x]);
                 mRelativeLayout.setBackgroundResource(mBackground[x]);
                 if (x == 0) {
                     stone.x1 += 1;
                 } else if (x == 1) {
                    stone.x2 += 1;
                 } else if (x == 2) {
                     stone.x3 += 1;
                 } else if (x == 3) {
                     stone.x4 += 1;
                 } else if (x == 4) {
                     stone.x5 += 1;
                 } else if (x == 5) {
                     stone.x6 += 1;
                 }


             }
         });

        mListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(MainActivity.this,stone.class);
                startActivity(myIntent);

            }
        });


    }
}
