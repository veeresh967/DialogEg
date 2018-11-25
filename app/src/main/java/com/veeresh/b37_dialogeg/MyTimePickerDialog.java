package com.veeresh.b37_dialogeg;


import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyTimePickerDialog extends DialogFragment {
    public MyTimePickerDialog() {
        // Required empty public constructor
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;
        //HERE WE WILL CREATE TIME PICKER DIALOG BOX
        //parameteres - this, null, hours, minutes, is it 24 hour format?
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minutes = calendar.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog =
                new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        Toast.makeText(getActivity(), "HOUR : "+i, Toast.LENGTH_SHORT).show();
                        Toast.makeText(getActivity(), "MINUTE : "+i1, Toast.LENGTH_SHORT).show();
                    }
                }, hour, minutes, false);
        d = timePickerDialog;
        return d;
    }
}
