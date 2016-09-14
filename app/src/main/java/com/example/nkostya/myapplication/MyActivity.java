package com.example.nkostya.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {

//    private TextView mHelloTextView;
//    private EditText mNamedEditText;
    private Button mCountCrows;
    private int mCount = 0;
    private TextView mTextHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
//        mHelloTextView = (TextView) findViewById(R.id.textView);
//        mNamedEditText = (EditText) findViewById(R.id.editText);
        mCountCrows = (Button) findViewById(R.id.buttonCrowsCounter);
        mTextHello = (TextView) findViewById(R.id.textView);
        mCountCrows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextHello.setText("Насчитано " + ++mCount + " ворон.");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*public void onPressedButton(View view) {
        if(mNamedEditText.getText().length() == 0) {
            mHelloTextView.setText("Hello Kitty!!!");
        } else {
            mHelloTextView.setText("Hello, " + mNamedEditText.getText());
        }
    }*/

    public void sayHello(View view) {
        TextView hello = (TextView) findViewById(R.id.textView);
        hello.setText("Хватит здороваться с котами! Давай пили уже прогу с гибернейтом и БД");
    }
}
