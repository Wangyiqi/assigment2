package com.example.administrator.assigment2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/12.
 */

public class ThirteenActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirteen_layout);

        //Connect the button
        Button btnSend = (Button)findViewById(R.id.btn01);
        //Connect the Edittext
        final EditText userInput =(EditText)findViewById(R.id.eTuserInput);

        //Set the onclick listener
        btnSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Get the user input from the edit text
                String theUserInput = userInput.getText().toString();

                // Display a toast when the button is pressed
                //Toast to be display should not be the same
                //if the user did not write her name
                if(theUserInput.isEmpty()){
                    Toast.makeText(getBaseContext(), "The user did not input anything",	 Toast.LENGTH_LONG).show();
                }else{
                    //if the user wrote her name.
                    Toast.makeText(getBaseContext(), "The user`s name is : \n   "+theUserInput,	 Toast.LENGTH_LONG).show();
                }




            }
        });
    }
}
