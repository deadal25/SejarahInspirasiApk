package com.example.sejarahinspirasi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SejarahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        TextView mSejarahName = findViewById(R.id.text_sejarah);
        TextView mLatarBelakang = findViewById(R.id.latarbelakang);
        TextView mPencapaian = findViewById(R.id.pencapaian);
        TextView mIsiPencapaian = findViewById(R.id.isiPencapaian);

        Intent intent = getIntent();
        String Sejarah = intent.getExtras().getString("Sejarah");
        String LatarBelakang = intent.getExtras().getString("LatarBelakang");
        String Pencapaian = intent.getExtras().getString("Pencapaian");
        String IsiPencapaian = intent.getExtras().getString("IsiPencapaian");

        mSejarahName.setText(Sejarah);
        mLatarBelakang.setText(LatarBelakang);
        mPencapaian.setText(Pencapaian);
        mIsiPencapaian.setText(IsiPencapaian);

    }
}