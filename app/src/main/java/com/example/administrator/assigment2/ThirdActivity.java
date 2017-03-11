package com.example.administrator.assigment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/11.
 */

public class ThirdActivity extends Activity {
    String[] myStringArray = new String[] { "China", "American","Japan","Korea","Italian" ,"Russian",};
    private ListView myListView;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        myListView=new ListView(this);
        myListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,
                myStringArray));
        setContentView(myListView);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Do something based on user clicked
                switch (position) {
                    case 0:
                        showToast(position, ((TextView) view).getText());

                        break;
                    case 1:
                        showToast(position, ((TextView) view).getText());

                        break;
                    case 2:
                        showToast(position, ((TextView) view).getText());

                        break;
                    case 3:
                        showToast(position, ((TextView) view).getText());

                        break;
                    case 4:
                        showToast(position, ((TextView) view).getText());

                        break;
                    case 5:
                        showToast(position, ((TextView) view).getText());

                        break;

                    default:
                        break;
                }
            }

            private void showToast(int position, CharSequence charSequence) {
                // Toast
                Intent intent = new Intent(getBaseContext(),FourActivity.class);
                startActivity(intent);

            }
        });

    }

}
