package com.example.yaredbezu.cupsconverterinxml;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button teaspoonButton=(Button)findViewById(R.id.teaspoon_Button);
        teaspoonButton.setOnClickListener(teaspoonClicked);
        Button tableSpoonButton=(Button)findViewById(R.id.tablespoon_Button);
        tableSpoonButton.setOnClickListener(tablespoonClicked);


    }
    private View.OnClickListener teaspoonClicked = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            EditText cupsText=(EditText)findViewById(R.id.cups_text);
            TextView answerteaspoon=(TextView)findViewById(R.id.answerTeaspoon);
            String cupsString = cupsText.getText().toString();
            double cup = Double.parseDouble(cupsString);
            double result = cup * 48;
            String resultString = String.valueOf(result);
            answerteaspoon.setText(resultString);
        }
    };

    private View.OnClickListener tablespoonClicked = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            EditText cupsText=(EditText)findViewById(R.id.cups_text);
            TextView answertablespoon=(TextView)findViewById(R.id.answerTablespoon);
            String cupsString = cupsText.getText().toString();
            double cup = Double.parseDouble(cupsString);
            double result = cup * 16;
            String resultString = String.valueOf(result);
            answertablespoon.setText(resultString);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
