package com.example.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class TraditionalSingleChoiceDialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] Colors ={"Red","Blue","Black"};
        AlertDialog.Builder dialogList = new AlertDialog.Builder(getActivity());
        //Set title
        dialogList.setTitle("Color");
        //Truyền danh sách colors vào, cài đặt sự kiện khi click vào Item
        dialogList.setItems(Colors, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                String selectedText = Colors[item].toString();  //Lấy giá trị của Item
                Toast.makeText(getActivity(), selectedText, Toast.LENGTH_SHORT).show();
            }
        });
        return  dialogList.create();
    }
}