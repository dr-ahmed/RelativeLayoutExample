package com.dev.relativelayoutexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button twitterBtn, fbBtn, gplusBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setListeners();
    }

    private void initViews() {
        twitterBtn = findViewById(R.id.twitterBtn);
        fbBtn = findViewById(R.id.fbBtn);
        gplusBtn = findViewById(R.id.gplusBtn);
    }

    private void setListeners() {
        twitterBtn.setOnClickListener(this);
        fbBtn.setOnClickListener(this);
        gplusBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StringBuilder socialMedia = new StringBuilder("None");
        switch (v.getId()) {
            case R.id.twitterBtn:
                socialMedia = new StringBuilder("Twitter");
                break;
            case R.id.fbBtn:
                socialMedia = new StringBuilder("Facebook");
                break;
            case R.id.gplusBtn:
                socialMedia = new StringBuilder("Google+");
        }
        Toast.makeText(this, "Bienvenue sur " + socialMedia, Toast.LENGTH_SHORT).show();
    }
}
