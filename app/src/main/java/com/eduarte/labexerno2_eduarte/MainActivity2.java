package com.eduarte.labexerno2_eduarte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText etCourse1, etCourse2, etCourse3, etCourse4, etCourse5, etCourse6, etCourse7, etCourse8, etCheckCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etCheckCourse = findViewById(R.id.editText9);
    }

    public void validate (View v){
        SharedPreferences sp = getSharedPreferences("coursesData", MODE_PRIVATE);
        String course1SP = sp.getString("course1", null);
        String course2SP = sp.getString("course2", null);
        String course3SP = sp.getString("course3", null);
        String course4SP = sp.getString("course4", null);
        String course5SP = sp.getString("course5", null);
        String course6SP = sp.getString("course6", null);
        String course7SP = sp.getString("course7", null);
        String course8SP = sp.getString("course8", null);
        String checkCourse = etCheckCourse.getText().toString();
        if(checkCourse.equals(course1SP) || checkCourse.equals(course2SP) || checkCourse.equals(course3SP) || checkCourse.equals(course4SP) || checkCourse.equals(course5SP) || checkCourse.equals(course6SP) || checkCourse.equals(course7SP) || checkCourse.equals(course8SP)){
            Toast.makeText(this, "The course is offered in UST", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "The course is not offered in UST", Toast.LENGTH_LONG).show();

        }
    }

    public void previousData(View v){
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }
}
