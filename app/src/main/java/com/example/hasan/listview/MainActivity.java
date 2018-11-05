package com.example.hasan.listview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView_id);

        final String[] cuntryName = getResources().getStringArray(R.array.cuntry_name);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.sample,R.id.textView_id,cuntryName);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = cuntryName[position];
                int p = position+1;
                if (p==5){
                    Intent intent = new Intent(MainActivity.this,cuntry_profile.class);
                    intent.putExtra("tag","b");
                    startActivity(intent);

                }
                if (p==15){
                    Intent intent = new Intent(MainActivity.this,cuntry_profile.class);
                    intent.putExtra("tag","i");
                    startActivity(intent);

                }
                if (p==6){
                    Intent intent = new Intent(MainActivity.this,cuntry_profile.class);
                    intent.putExtra("tag","br");
                    startActivity(intent);

                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBilder;
        alertDialogBilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBilder.setTitle("Hello");
        alertDialogBilder.setMessage("Do you want to exit?");
        alertDialogBilder.setIcon(R.drawable.bangladesh_icon);
        alertDialogBilder.setCancelable(false);

        alertDialogBilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertDialogBilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBilder.create();
        alertDialog.show();
    }
}
