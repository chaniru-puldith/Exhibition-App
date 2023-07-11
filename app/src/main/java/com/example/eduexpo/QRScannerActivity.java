package com.example.eduexpo;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanOptions;

public class QRScannerActivity extends AppCompatActivity {

    private Button btnScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrscanner);

        btnScan = findViewById(R.id.btnScan);

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Scanner();

            }
        });
    }

    private void Scanner(){
        ScanOptions options = new ScanOptions();
        options.setPrompt("Volume up to Flash on");
        options.setBeepEnabled(true);
        options.setOrientationLocked(true);
        options.setCaptureActivity(StartScan.class);
        launcher.launch(options);
    }

    ActivityResultLauncher<ScanOptions> launcher = registerForActivityResult(new ScanContract(), result -> {
        if (result.getContents() !=null){
            AlertDialog.Builder builder = new AlertDialog.Builder(QRScannerActivity.this);
            builder.setTitle("QR-SCANNER RESULT");
            builder.setMessage(result.getContents());
            builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    dialog.dismiss();

                }
            }).show();
        }

    });
}