package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void radioHandler(View view)
    {
     boolean selected=((RadioButton)view).isChecked();
     switch (view.getId())
     {
         case R.id.male:
             if(selected)
                 Toast.makeText(this,"Male Selected",Toast.LENGTH_SHORT).show();
             break;
         case R.id.female:
             if(selected)
                 Toast.makeText(this,"Female Selected",Toast.LENGTH_SHORT).show();
             break;
     }
    }
}
