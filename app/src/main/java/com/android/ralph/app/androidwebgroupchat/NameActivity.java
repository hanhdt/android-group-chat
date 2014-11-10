package com.android.ralph.app.androidwebgroupchat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * We take the user input from EditText and send it to other activity
 */
public class NameActivity extends Activity {

    private Button joinBtn;
    private EditText nameTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        joinBtn = (Button) findViewById(R.id.btnJoin);
        nameTxt = (EditText) findViewById(R.id.name);
        // Hiding action bar
        getActionBar().hide();

        joinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nameTxt.getText().toString().trim().length() > 0) {

                    String name = nameTxt.getText().toString().trim();

                    Intent intent = new Intent(NameActivity.this, MainActivity.class);
                    intent.putExtra("name", name);

                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Please enter your name!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_name, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
