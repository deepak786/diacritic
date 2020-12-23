package com.sample.diacritic;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.library.diacritic.Diacritic;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1 = findViewById(R.id.text1);
        String s1 = "árvíztűrő";
        t1.setText(String.format("%s = %s", s1, Diacritic.removeDiacritics(s1)));

        TextView t2 = findViewById(R.id.text2);
        String s2 = "ÀÁâäæãåāa!@#$%^&`";
        t2.setText(String.format("%s = %s", s2, Diacritic.removeDiacritics(s2)));

        TextView t3 = findViewById(R.id.text3);
        String s3 = "árvíztűrő tükörfúrógép";
        t3.setText(String.format("%s = %s", s3, Diacritic.removeDiacritics(s3)));
    }
}