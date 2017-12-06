package com.fx.progressdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fx.progressdialog.ProgressDialog.LoadingDialog;
import com.fx.progressdialog.ProgressDialog.PDialog;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadingDialog.showDialogForLoading(MainActivity.this,"登录中...",true);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PDialog.showDialogForLoading(MainActivity.this,"登录中...",true);
            }
        });
    }
}
