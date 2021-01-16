package com.example.framedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView img,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageviewid);
        img1 = findViewById(R.id.imageviewid1);
        img2 = findViewById(R.id.imageviewid2);
        img3 = findViewById(R.id.imageviewid3);
        img4 = findViewById(R.id.imageviewid4);
        img5 = findViewById(R.id.imageviewid5);
        img6 = findViewById(R.id.imageviewid6);
        img7 = findViewById(R.id.imageviewid7);
        img8 = findViewById(R.id.imageviewid8);
        img9 = findViewById(R.id.imageviewid9);
        img10 = findViewById(R.id.imageviewid10);
        img11 = findViewById(R.id.imageviewid11);
        img12 = findViewById(R.id.imageviewid12);

        img.setOnClickListener(this);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
        img10.setOnClickListener(this);
        img11.setOnClickListener(this);
        img12.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.imageviewid)
        {
            img.setVisibility(View.GONE);
            img1.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid1)
        {
            img1.setVisibility(View.GONE);
            img2.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid2)
        {
            img2.setVisibility(View.GONE);
            img3.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid3)
        {
            img3.setVisibility(View.GONE);
            img4.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid4)
        {
            img4.setVisibility(View.GONE);
            img5.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid5)
        {
            img5.setVisibility(View.GONE);
            img6.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid6)
        {
            img6.setVisibility(View.GONE);
            img7.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid7)
        {
            img7.setVisibility(View.GONE);
            img8.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid8)
        {
            img8.setVisibility(View.GONE);
            img9.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid9)
        {
            img9.setVisibility(View.GONE);
            img10.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid10)
        {
            img10.setVisibility(View.GONE);
            img11.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid11)
        {
            img11.setVisibility(View.GONE);
            img12.setVisibility(View.VISIBLE);
        }
       else if (v.getId()==R.id.imageviewid12)
        {
            img12.setVisibility(View.GONE);
            img.setVisibility(View.VISIBLE);
        }


    }
}
