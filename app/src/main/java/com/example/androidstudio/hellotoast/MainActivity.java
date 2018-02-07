package com.example.androidstudio.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view){
      mCount ++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void showToast (View view) {
       Toast toast = Toast.makeText(this, "Toaster1", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showPoke (View view) {

        Toast poke= Toast.makeText(this, R.string.Poke_message, Toast.LENGTH_LONG);
        poke.show();
        // What hapenned when user clicks on the button_toast Button goes here.
    }
}
