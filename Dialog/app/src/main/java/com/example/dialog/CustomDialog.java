package com.example.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class CustomDialog extends DialogFragment {
    EditText edt1,edt2;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View customLayout = inflater.inflate(R.layout.custom_layout, null);
        builder.setView(customLayout);
        builder.setTitle("Đăng nhập");

        edt1 =(EditText) customLayout.findViewById(R.id.username);
        edt2 =(EditText) customLayout.findViewById(R.id.password);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String use= edt1.getText().toString();
                String pa= edt2.getText().toString();
                Toast.makeText(getActivity(),"User:   " + use +"    Pass:   "+ pa ,Toast.LENGTH_SHORT).show();
            }
        });
        return builder.create();
    }
}
