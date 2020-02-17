package com.example.aplikasi_input_nama;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel
    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //panggil variabel berdasarkan id
        TextNama = (EditText) findViewById(R.id.TxtNama);
        Hasil = (TextView) findViewById(R.id.Lbl_Nama);


    }

    //Buat method TampilNama sesuai property OneClick pada Button
    public void TampilNama(View v){
        Hasil.setText("Nama anda : " + TextNama.getText());
    }


}
