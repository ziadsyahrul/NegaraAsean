package com.ziadsyahrul.negaraasean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        //TODO Mengubah textView dan imageView dengan data dari halaman sebelumnya
        txtTitle.setText(getIntent().getStringExtra("nn"));
        txtDetail.setText(getIntent().getStringExtra("dn"));
        Glide.with(this).load(getIntent().getIntExtra("gn",0)).into(imgLogo);
    }
}

