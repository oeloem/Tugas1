package com.example.oeloem.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtText;
    private EditText edtText2;
    private EditText edtText3;
    private EditText edtText4;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI() {
        edtText = findViewById(R.id.edtText);
        edtText2 = findViewById(R.id.edtText2);
        edtText3 = findViewById(R.id.edtText3);
        edtText4 = findViewById(R.id.edtText4);
        btnHitung = findViewById(R.id.btnHasil);

    }

    private void initEvent() {
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hitung();

            }
        });

        }

    private void Hitung() {
        int sisi1 = Integer.parseInt(edtText.getText().toString());
        int sisi2 = Integer.parseInt(edtText2.getText().toString());
        int sisi3 = Integer.parseInt(edtText3.getText().toString());
        int volume = sisi1 * sisi2 * sisi3;
        edtText4.setText(volume + " ");
    }

}



