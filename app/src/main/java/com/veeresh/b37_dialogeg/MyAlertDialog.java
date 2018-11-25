package com.veeresh.b37_dialogeg;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyAlertDialog extends DialogFragment {
    public MyAlertDialog() {
        // Required empty public constructor
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;
        //WE WILL WRITE ACTUAL CODE FOR DISPLAYING ALERT DIALOG BOX
        AlertDialog.Builder ab = new AlertDialog.Builder(getActivity());
        ab.setIcon(R.mipmap.ic_launcher);
        ab.setTitle("first popup");
        ab.setMessage("Hello, this is our first popup");
        ab.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "OK OK", Toast.LENGTH_SHORT).show();
            }
        });
        ab.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                getActivity().finish();
            }
        });
        d = ab.create(); //MANDATORY STEP
        //END
        return d;
    }
}
