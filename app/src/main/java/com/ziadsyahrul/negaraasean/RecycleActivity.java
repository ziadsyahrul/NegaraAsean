package com.ziadsyahrul.negaraasean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    //TODO 1 mengenerate butterknife untuk recycleview
    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    //TODO 2 membuat variable array untuk menampung data nama,detail dan gambar dari String Array pada
    String[] namaNegara;
    String[] detailNegara;
    int[] gambarNegara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        //TODO 3 Mengisi variable array dari folder -> Strings,drawable
        namaNegara = getResources().getStringArray(R.array.negara_name);
        detailNegara = getResources().getStringArray(R.array.detail_negara);
        gambarNegara = new int[]{R.drawable.indonesia,R.drawable.malaysia,R.drawable.thailand, R.drawable.filipina,R.drawable.singapura,R.drawable.brunei_darussalam,R.drawable.vietnam,R.drawable.laos,R.drawable.myanmar,R.drawable.kamboja};

        //TODO 4 Membuat object adpater dan mengirim data nama,detail dan gambar ke adapter
        Adapter adapter = new Adapter(RecycleActivity.this,gambarNegara,namaNegara,detailNegara);
        //TODO 5 Mensetting recyclerview dan mengeset recycleview dengan adapter
        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter(adapter);

    }
}