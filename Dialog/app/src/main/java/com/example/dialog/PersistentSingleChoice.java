package com.example.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class PersistentSingleChoice extends DialogFragment {

    private String[] items = {"Ngọc Kim","Văn Linh","Tường Minh"};
    private String selectedItem = "";
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Vui Lòng Chọn!");
        selectedItem = items[0];
        //Gía trị được chọn mặc định là giá trị đầu tiên thứ 0.
        builder.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                selectedItem = items[which]; // truyền giá trị vào selectedItem
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast toast = Toast.makeText(getActivity(), "Đã Chọn : " + selectedItem, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return  builder.create();
    }
}
