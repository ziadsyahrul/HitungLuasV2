package com.ziadsyahrul.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegiPanjangActivity extends AppCompatActivity {

    //TODO 1 Luas persegi panjang membuat variable global
    EditText edtPanjang;
    EditText edtLebar;
    TextView txtHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);

        //TODO 2 menginisiasikan objek widget
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        //TODO 3 membuat method onClick untuk mendeteksi click dari user
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO 4 memasukkan input edit text dari user
                Integer Panjang = Integer.valueOf(edtPanjang.getText().toString());
                Integer Lebar = Integer.valueOf(edtLebar.getText().toString());


                //TODO 5 memanggil function hitungLuasPersegiPanjang
                hitungLuasPersegiPanjang(Panjang, Lebar);
            }
        });
    }

    //TODO 6 membuat method hitungLuasPersegiPanjang
    private void hitungLuasPersegiPanjang(Integer panjang, Integer lebar) {

        //TODO 7 menghitung luas persegi panjang
        int hasil = panjang * lebar;

        //TODO 8 mencetak hasil
        txtHasil.setText(String.valueOf(hasil));
    }


}
