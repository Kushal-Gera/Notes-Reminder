package com.example.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.opengl.ETC1;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SetReminder extends AppCompatActivity {
    private static final String TAG = "SetReminder";
    public static final String SHARED_PREF = "shared_preference";
    private static final String ITEM_ID = "item_id";
    private static boolean IS_DARK = false;

    Button save, alarm;
    EditText note;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //change this to shared preference.......
        getSharedPrefData();
        if (IS_DARK)
            setTheme(R.style.DarkTheme);
        else
            setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_set_reminder);

        save = findViewById(R.id.save);
        alarm = findViewById(R.id.alarm);
        note = findViewById(R.id.note);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String note_string = note.getText().toString().trim();

                if (!TextUtils.isEmpty(note_string)){

                    //do something
                }else Toast.makeText(SetReminder.this,"Please Fill The Fields", Toast.LENGTH_SHORT).show();

            }
        });




    }

    private void getSharedPrefData() {

        SharedPreferences preferences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
        IS_DARK = preferences.getBoolean(ITEM_ID, false);
    }





}
