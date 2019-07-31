package com.example.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class MultiChoiceListDialog extends DialogFragment {
    String choose = "";
    String[] countries_array = {"Albania","Algeria","American","Antarctica"};
    boolean[] selecitem = {true, false, true, false};
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Set the dialog title
        builder.setTitle("Danh sách Countries")
                // Lấy Arraylist từ values- listtest
                .setMultiChoiceItems(countries_array, selecitem, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        if(isChecked)
                            selecitem[which] = true;
                        else
                            selecitem[which] = false;
                    }
                })
                // Cài đặt button OKE
                .setPositiveButton("OKE", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                        for (int i = 0; i<selecitem.length; i++) {
                            if (selecitem[i] == true) {
                                choose += countries_array[i] + "           ";
                            }

                        }
                        Toast.makeText(getActivity(), choose, Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
        return builder.create();
    }
}
