package com.example.truncationdemo;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);

    TextView textView1 = findViewById(R.id.text_1);
    TextView textView2 = findViewById(R.id.text_2);
    TextView textView3 = findViewById(R.id.text_3);
    applyColorSpan(textView1, 0, 37);
    applyColorSpan(textView2, 0, 37);
    applyColorSpan(textView3, 0, 37);
  }

  private static void applyColorSpan(TextView textView, int start, int end) {
    SpannableString spannable = new SpannableString(textView.getText());
    spannable
        .setSpan(new ForegroundColorSpan(Color.BLUE), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
    textView.setText(spannable);
  }
}
