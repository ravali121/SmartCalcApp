package com.student.smartcalcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button b_teacher ;
    private Button b_student ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_trail);
        b_teacher = (Button)findViewById(R.id.b_teacher);
        b_student = (Button)findViewById(R.id.b_student);
        b_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b_teacher.setEnabled(true);
                b_student.setEnabled(false);
            }
        });
    }
}
