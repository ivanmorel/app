package com.example.ivan.samplesd3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setClick(R.id.linearLayoutVertical, LinearLayoutVerticalActivity.class);
        setClick(R.id.linearLayoutHorizontal, LinearLayoutHorizontalActivity.class);
        setClick(R.id.relativeLayout, RelativeLayout.class);
        setClick(R.id.tableLayout, TableLayout.class);
        setClick(R.id.frameLayout, FrameLayout.class);
        setClick(R.id.listview, ListViewActivity.class);
        setClick(R.id.gridView, GridViewActivity.class);
    }

    public void setClick(int id, final Class layout){
        findViewById(id).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, layout);
                startActivity(intent);
            }
        });
    }
}
