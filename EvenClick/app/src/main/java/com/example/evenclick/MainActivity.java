package com.example.evenclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPhepCong, btnPhepTru,btnPhepChia,btnPhepNhan;
    EditText mNhapSoA,mNhapSoB;
    TextView mKetQua;
    private void addControls() {
        btnPhepCong = (Button) findViewById(R.id.btnCong);
        btnPhepChia = (Button) findViewById(R.id.btnChia);
        btnPhepTru = (Button) findViewById(R.id.btnTru);
        btnPhepNhan = (Button) findViewById(R.id.btnNhan);
        mNhapSoA = (EditText) findViewById(R.id.edtNhapSoA);
        mNhapSoB = (EditText) findViewById(R.id.edtNhapSoB);
        mKetQua = (TextView) findViewById(R.id.tvKetQua);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        //SỰ KIỆN CLICK
        // Variable listenner
        btnPhepNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ketqua = Double.parseDouble(mNhapSoA.getText().toString()) * Double.parseDouble(mNhapSoB.getText().toString());
                mKetQua.setText("Kết Quả: " + mNhapSoA.getText().toString() + "*"
                        + mNhapSoB.getText().toString() + "=" + ketqua);
            }
        });
        // Anonymous listenner. phuong thuc nay su dung implimen view click
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btnPhepChia) {
                    double ketqua = Double.parseDouble(mNhapSoA.getText().toString()) / Double.parseDouble(mNhapSoB.getText().toString());
                    mKetQua.setText("Kết Quả: " + mNhapSoA.getText().toString() + "/"
                            + mNhapSoB.getText().toString() + "=" + ketqua);
                }
            }
        };
        btnPhepChia.setOnClickListener(listener);
        btnPhepTru.setOnClickListener(this);
    }
    // Khai báo trong XML
    public void PhepCong (View v){
        double ketqua = Double.parseDouble(mNhapSoA.getText().toString()) + Double.parseDouble(mNhapSoB.getText().toString());
        mKetQua.setText("Kết Quả: " + mNhapSoA.getText().toString() + "+"
                + mNhapSoB.getText().toString() + "=" + ketqua);
    }
    //Activity listenner  (Khuyến khích sử dụng)  implements View.OnClickListener
    @Override
    public void onClick(View v) {
        if (v == btnPhepTru) {
            double ketqua = Double.parseDouble(mNhapSoA.getText().toString()) - Double.parseDouble(mNhapSoB.getText().toString());
            mKetQua.setText("Kết Quả: " + mNhapSoA.getText().toString() + "-"
                    + mNhapSoB.getText().toString() + "=" + ketqua);
        }
    }
}
