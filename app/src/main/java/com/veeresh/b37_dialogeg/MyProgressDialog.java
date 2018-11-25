package com.veeresh.b37_dialogeg;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyProgressDialog extends DialogFragment {
    ProgressDialog progressDialog;

    public MyProgressDialog() {
        // Required empty public constructor
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;
        //WE WILL WRITE CODE FOR DISPLAYING PROGRESS POP UP WINDOW
        progressDialog = new ProgressDialog(getActivity()); //android O
        progressDialog.setTitle("Progressing!"); //this is title
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setMessage("3 of 10"); //this is message of the body
        d = progressDialog; //MANDATORY STEP
        return d;
    }
    @Override
    public void onResume() {
        super.onResume();
        progressDialog.setProgress(30); //this is how much progress bar should move
    }
}
