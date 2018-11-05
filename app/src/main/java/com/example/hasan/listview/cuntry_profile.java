package com.example.hasan.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class cuntry_profile extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuntry_profile);

        imageView = findViewById(R.id.imageView_id);
        textView = findViewById(R.id.textView_id);
        textView2 = findViewById(R.id.textView2_id);


        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String value = bundle.getString("tag");
            showdetils(value);
        }
    }
    void  showdetils (String value){
        if (value.equals("b")){
            imageView.setImageResource(R.drawable.bangladeshi);
            textView.setText(R.string.bangladeshprofile);
            textView2.setText("Bangladesh");
        } if (value.equals("i")){
            imageView.setImageResource(R.drawable.india);
            textView.setText(R.string.indiaprofile);
            textView2.setText("India");
        } if (value.equals("br")){
            imageView.setImageResource(R.drawable.brazil);
            textView.setText(R.string.brazilprofile);
            textView2.setText("brazil");
        }
    }
}
