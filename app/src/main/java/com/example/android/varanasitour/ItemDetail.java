package com.example.android.varanasitour;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class ItemDetail extends AppCompatActivity {

    private boolean palyOrPause = false;
    private TextToSpeech textToSpeech;
    private FloatingActionButton floatingActionButton;
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }


        // Set The TextToSpeech
        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = textToSpeech.setLanguage(Locale.ENGLISH);
                    if (result == TextToSpeech.LANG_NOT_SUPPORTED || result == TextToSpeech.LANG_MISSING_DATA) {
                        Toast.makeText(ItemDetail.this, "Language not supported", Toast.LENGTH_SHORT).show();
                    } else {
                        textToSpeech.setPitch(0.6f);
                        textToSpeech.setSpeechRate(1f);
                    }

                }

            }
        });

        final FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {
                if (palyOrPause ==false)
                {
                    floatingActionButton.setImageResource(R.drawable.baseline_pause_white_18dp1);
                speak();
                palyOrPause = true;
            }else{
                    palyOrPause=false;
                    textToSpeech.stop();
                 floatingActionButton.setImageResource(R.drawable.baseline_play_arrow_white_18dp);
                }

            }
        });


        Bundle extra = getIntent().getExtras();
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapseToolbarLayoutItem);
        collapsingToolbarLayout.setTitle(extra.getString("name"));
        ImageView imageView = (ImageView) findViewById(R.id.imageViewOfItem);
        imageView.setImageResource(extra.getInt("rId"));
        textView = (TextView) findViewById(R.id.aboutOfItem);
        textView.setText(extra.getString("about"));

    }

    private void speak() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textToSpeech.speak(textView.getText().toString(), TextToSpeech.QUEUE_FLUSH, null, null);
        } else {
            textToSpeech.speak(textView.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
        }
    }

    @Override
    protected void onDestroy() {
        if (textToSpeech != null){
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
    }
}
