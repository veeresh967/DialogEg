package com.veeresh.b37_dialogeg;


import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyCustomDialog extends DialogFragment {
    EditText et1, et2;
    Button b1, b2;
    Dialog d = null;

    public MyCustomDialog() {
        // Required empty public constructor
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //HERE WILL WRITE CODE FOR DISPLAYING CUSTOM DIALOG
        AlertDialog.Builder ab = new AlertDialog.Builder(getActivity());
        //BELOW LINE LOADS OUR CUSTOM DIALOG XML
        View v = getActivity().getLayoutInflater().inflate(R.layout.fragment_my_custom_dialog, null);
        //BELOW WE ARE INITIALIZING ALL COMPONENTS OF OUR CUSTOM DIALOG XML
        et1 = v.findViewById(R.id.editText1);
        et2 = v.findViewById(R.id.editText2);
        b1 = v.findViewById(R.id.button1);
        b2 = v.findViewById(R.id.button2);
        //IMPLEMENT BUTTON CLICK LISTENERS
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "LOG OUT", Toast.LENGTH_SHORT).show();
                d.dismiss();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "LOG IN", Toast.LENGTH_SHORT).show();
                //WE CAN ALSO READ EDIT TEXT VALUES BY USING ET1.GETTEXT.... METHOD
                d.dismiss();
            }
        });
        ab.setView(v);
        d = ab.create();
        return d;
    }
}
