package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ntd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

    }
    private void findViews(){
        ntd = findViewById(R.id.ntd);

    }

    public void transfer(View view){
        try {
            String s = ntd.getText().toString();
            float ntd = Float.parseFloat(s);
            float usd = ntd/30.9f;
            new AlertDialog.Builder(this)
                    .setTitle(R.string.result)
                    .setMessage(getString(R.string.usd_is)+usd)
                    .setPositiveButton(R.string.ok,null)
                    .show();

        }catch(Exception e){
            new AlertDialog.Builder(this)
                    .setTitle(R.string.problem)
                    .setMessage(R.string.please_enter_your_ntd_amount)
                    .setPositiveButton(R.string.ok,null)
                    .show();
        }

    }




}
