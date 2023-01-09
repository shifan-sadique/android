package com.example.sample;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;
public class MyAndroidAppActivity extends AppCompatActivity {
   Button button;
   ImageView image;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      addListenerOnButton();
   }
   public void addListenerOnButton() {
      image=(ImageView) findViewById(R.id.imageView1);
      button=(Button) findViewById(R.id.btnChangeImage);
      button.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(View arg0) {
            image.setImageResource(R.drawable.ic_launcher_background);
         }
      });
   }
}
