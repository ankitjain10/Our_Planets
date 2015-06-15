package com.example.dell.ourplanets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by dell on 6/14/2015.
 */
public class Neptune extends Activity implements ImageButton.OnClickListener {
    ImageButton btnImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neptune);
        btnImage=(ImageButton)findViewById(R.id.btnImage);
        btnImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Neptune.this,NeptuneFullSize.class);
        startActivity(intent);

    }
}
