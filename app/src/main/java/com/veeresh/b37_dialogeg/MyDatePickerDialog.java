package com.veeresh.b37_dialogeg;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDatePickerDialog extends DialogFragment {
    public MyDatePickerDialog() {
        // Required empty public constructor
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;
        //HERE WE WILL WRITE CODE FOR DATE PICKER DIALOG
        //parameters - this, null, year, month, day
        Calendar calendar = Calendar.getInstance(); //should be from java.util package
        int year = calendar.get(Calendar.YEAR); //THIS GIVES CURRENT YEAR AUTOMATICALLY
        int month = calendar.get(Calendar.MONTH); //THIS GIVES CURRENT MONTH AUTOMATICALLY
        int day = calendar.get(Calendar.DAY_OF_MONTH); //THIS GIVES CURRENT DATE AUTOMATICALLY

        DatePickerDialog datePickerDialog =
                new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        Toast.makeText(getActivity(), "YEAR : "+i, Toast.LENGTH_SHORT).show();
                        Toast.makeText(getActivity(), "MONTH : "+(i1+1), Toast.LENGTH_SHORT).show();
                        Toast.makeText(getActivity(), "DAY : "+i2, Toast.LENGTH_SHORT).show();
                    }
                }, year, month, day);
        d = datePickerDialog;
        return d;
    }
}
