package com.veeresh.b37_dialogeg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showPopUp(View view){
        switch (view.getId()){
            case R.id.button1:
                //IF CONTROL COMES HERE, THAT MEANS USER WANT ALERT DIALOG POP UP
                MyAlertDialog myAlertDialog = new MyAlertDialog();
                myAlertDialog.show(getSupportFragmentManager(), null);
                break;
            case R.id.button2:
                //USER WANT TO PROGRESS DIALOG
                MyProgressDialog myProgressDialog = new MyProgressDialog();
                myProgressDialog.show(getSupportFragmentManager(), null);
                break;
            case R.id.button3:
                MyDatePickerDialog myDatePickerDialog = new MyDatePickerDialog();
                myDatePickerDialog.show(getSupportFragmentManager(), null);
                break;
            case R.id.button4:
                MyTimePickerDialog myTimePickerDialog = new MyTimePickerDialog();
                myTimePickerDialog.show(getSupportFragmentManager(), null);
                break;
            case R.id.button5:
                MyCustomDialog myCustomDialog = new MyCustomDialog();
                myCustomDialog.show(getSupportFragmentManager(), null);
                break;
        }
    }
}
