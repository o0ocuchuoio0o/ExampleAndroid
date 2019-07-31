package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    Button btnDialogBasic,btnTraditionnalSingleChoice,btnPresistentSingleChoice,
            btnMultiChoiceList,btnCustomDialog;
    private  void isstallcontro()
    {
        btnDialogBasic=(Button)findViewById(R.id.btnDialogBasic);
        btnTraditionnalSingleChoice=(Button)findViewById(R.id.btnTraditionnalSingleChoice);
        btnPresistentSingleChoice=(Button)findViewById(R.id.btnPresistentSingleChoice);
        btnMultiChoiceList=(Button)findViewById(R.id.btnMultiChoiceList);
        btnCustomDialog=(Button)findViewById(R.id.btnCustomDialog);

        btnDialogBasic.setOnClickListener(this);
        btnTraditionnalSingleChoice.setOnClickListener(this);
        btnPresistentSingleChoice.setOnClickListener(this);
        btnMultiChoiceList.setOnClickListener(this);
        btnCustomDialog.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isstallcontro();
    }
    @Override
    public void onClick(View v) {
        if (v == btnDialogBasic) {
           // Toast toast=Toast.makeText(MainActivity.this, "tsasf",   Toast.LENGTH_SHORT);
           // toast.show();
            DialogBasic dialogFragment = new DialogBasic();
            FragmentManager fm=getSupportFragmentManager();
             dialogFragment.show(fm," DialogBasic");
        }
        if (v == btnTraditionnalSingleChoice) {
            TraditionalSingleChoiceDialog dialogFragment = new TraditionalSingleChoiceDialog();
            FragmentManager fm=getSupportFragmentManager();
            dialogFragment.show(fm," TraditionalSingleChoiceDialog");
        }
        if (v == btnPresistentSingleChoice) {
            PersistentSingleChoice dialogFragment = new PersistentSingleChoice();
            FragmentManager fm=getSupportFragmentManager();
            dialogFragment.show(fm," PersistentSingleChoice");
        }
        if (v == btnMultiChoiceList) {
            MultiChoiceListDialog dialogFragment = new MultiChoiceListDialog();
            FragmentManager fm=getSupportFragmentManager();
            dialogFragment.show(fm," MultiChoiceListDialog");
        }
        if (v == btnCustomDialog) {
            CustomDialog dialogFragment = new CustomDialog();
            FragmentManager fm=getSupportFragmentManager();
            dialogFragment.show(fm," CustomDialog");
        }
    }
}
