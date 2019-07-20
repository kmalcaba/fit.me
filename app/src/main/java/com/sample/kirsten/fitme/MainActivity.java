package com.sample.kirsten.fitme;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {
    private Button btnStart;
    private Button scanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.startBtn);
        scanButton = (Button) findViewById(R.id.scanButton);

        final Activity activity = this;

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Catalog.class));
            }
        });

        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrator.setCameraId(0);
                integrator.setOrientationLocked(true);
                integrator.setPrompt("");
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(false);
                integrator.initiateScan();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
        if(result != null){
            if(result.getContents() == null){
                Toast.makeText(this, "Cancel Scanning", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                if(result.getContents().toString().equals("3954-2930-4954-2912")){
                    startActivity(new Intent(MainActivity.this, Img7.class));
                } else if(result.getContents().toString().equals("2154-5210-2351-0293")){
                    startActivity(new Intent(MainActivity.this, Img8.class));
                }
            }
        }
        else{
            super.onActivityResult(requestCode, resultCode, data);
        }

    }
}
