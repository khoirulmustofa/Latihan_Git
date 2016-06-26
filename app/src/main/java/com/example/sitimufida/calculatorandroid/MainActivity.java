package com.example.sitimufida.calculatorandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtAngkaPertama, txtAngkaKedua;
    TextView lblHasil;
    Button btnJumlah, btnKurang, btnKali, btnBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        try {
            initComponent();
        } catch (Exception ex) {
            Toast.makeText(getBaseContext(), "MASALAH NYA ADALAH : " + ex.toString(),
                    Toast.LENGTH_SHORT).show();
        }
        setListener();
    }


    private void setListener() {
        // Ini untuk TAMBAH
        btnJumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angkaPertama = Double.parseDouble(String.valueOf(txtAngkaPertama.getText()));
                double angkaKedua = Double.parseDouble(String.valueOf(txtAngkaKedua.getText()));
                double hasil = 0;
                hasil = angkaPertama + angkaKedua;
                lblHasil.setText(String.valueOf("Hasil Penjumlahan " + angkaPertama + " + " + angkaKedua + " Adalah :" + hasil));
            }
        });

        // Ini Untuk Kurang
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double angkaPertama = Double.parseDouble(String.valueOf(txtAngkaPertama.getText()));
                double angkaKedua = Double.parseDouble(String.valueOf(txtAngkaKedua.getText()));
                double hasil = 0;
                hasil = angkaPertama - angkaKedua;
                lblHasil.setText(String.valueOf("Hasil Pengurangan " + angkaPertama + " - " + angkaKedua + " Adalah :" + hasil));
            }
        });

        // Ini Untuk Kali
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double angkaPertama = Double.parseDouble(String.valueOf(txtAngkaPertama.getText()));
                double angkaKedua = Double.parseDouble(String.valueOf(txtAngkaKedua.getText()));
                double hasil = 0;
                hasil = angkaPertama * angkaKedua;
                lblHasil.setText(String.valueOf("Hasil Pengalian " + angkaPertama + " x " + angkaKedua + " Adalah : " + hasil));
            }
        });

        // Ini Untuk Bagi
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double angkaPertama = Double.parseDouble(String.valueOf(txtAngkaPertama.getText()));
                double angkaKedua = Double.parseDouble(String.valueOf(txtAngkaKedua.getText()));
                double hasil = 0;
                hasil = angkaPertama / angkaKedua;
                lblHasil.setText(String.valueOf("Hasil Pembagian " + angkaPertama + " / " + angkaKedua + " Adalah :" + hasil));
            }
        });
    }

    private void initComponent() {
        txtAngkaPertama = (EditText) findViewById(R.id.txtAngkaPertama);
        txtAngkaKedua = (EditText) findViewById(R.id.txtAngkaKedua);
        lblHasil = (TextView) findViewById(R.id.lblHasil);
        btnJumlah = (Button) findViewById(R.id.btnJumlah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
    }

}
