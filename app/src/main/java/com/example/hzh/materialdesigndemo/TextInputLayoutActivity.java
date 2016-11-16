package com.example.hzh.materialdesigndemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by hzh on 2016/11/15.
 */

public class TextInputLayoutActivity extends AppCompatActivity {
    private TextInputLayout usernameTil, passwordTil;
    private Button button;
    private View rootView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);
        rootView = findViewById(R.id.root_layout);
        usernameTil = (TextInputLayout) findViewById(R.id.til_username);
        passwordTil = (TextInputLayout) findViewById(R.id.til_Password);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int textSize = usernameTil.getEditText().getText().toString().length();
                if (textSize > 6) {
                    usernameTil.setErrorEnabled(false);
                    Snackbar.make(rootView, "Login success", Snackbar.LENGTH_SHORT)
                            .setAction("OK", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(TextInputLayoutActivity.this,"Snackbar click OK",Toast.LENGTH_SHORT).show();
                                }
                            }).show();
                } else {
                    usernameTil.setError("error");
                }
            }
        });
    }
}
