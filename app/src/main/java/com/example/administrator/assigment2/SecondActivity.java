package com.example.administrator.assigment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2017/3/11.
 */

public class SecondActivity extends Activity {
    RadioGroup radiogroup;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        // Connect the radioGroup
       radiogroup = (RadioGroup) findViewById(R.id.radioGroup);

        // Connect the button
        Button btn = (Button) findViewById(R.id.btn);
        // Adding a listener
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // retrieve the radio button that was selected
                int radioSelected = radiogroup.getCheckedRadioButtonId();

                // get the text associated with that radioId
                RadioButton selected = (RadioButton) findViewById(radioSelected);
                // Show a toast
                /**
                 * See the differences between the two toast below and try to
                 * understand
                 **/
                // Toast.makeText(getBaseContext(), selected+"",
                // Toast.LENGTH_SHORT).show();

                Toast.makeText(getBaseContext(), selected.getText(),
                        Toast.LENGTH_SHORT).show();
                save(selected.getText().toString());
                //save();
                Intent intent = new Intent(getBaseContext(),ThirdActivity.class);
                startActivity(intent);

            }
        });

    }
    private void save(String context){
        try{
            FileOutputStream fos=openFileOutput("Data.txt",getApplicationContext().MODE_APPEND);
            OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
            osw.write(context);
            fos.close();
            Toast.makeText(this,"保存成功",Toast.LENGTH_LONG).show();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   /* private void initData() {
        String filePath = "/sdcard/Test/";
       String fileName = "DDD.txt";
        writeTxtToFile("txt content", filePath, fileName);
    }
    public void writeTxtToFile(String strcontent, String filePath, String fileName) {
        //生成文件夹之后，再生成文件，不然会出错
        makeFilePath(filePath, fileName);

        String strFilePath = filePath + fileName;
        // 每次写入时，都换行写
        String strContent = strcontent + "\r\n";
        try {
            File file = new File(strFilePath);
            if (!file.exists()) {
                Log.d("TestFile", "Create the file:" + strFilePath);
            }
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        RandomAccessFile raf = new RandomAccessFile(file, "rwd");
            raf.seek(file.length());
        try {
            raf.write(strContent.getBytes());
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            raf.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }catch (Exception e) {
            Log.e("TestFile", "Error on write File:" + e);
        }
    } catch (Exception e) {
            Log.e("TestFile", "Error on write File:" + e);
            }
    }

    public File makeFilePath(String filePath, String fileName) {
      File file = null;
        makeRootDirectory(filePath);
        try {
            file = new File(filePath + fileName);
            if (!file.exists()) {
                file.createNewFile();
                }
            } catch (Exception e) {
            e.printStackTrace();
            }
        return file;
        }


    // 生成文件夹
    public static void makeRootDirectory(String filePath) {
      File file = null;
     try {
           file = new File(filePath);
            if (!file.exists()) {
             file.mkdir();
                }
            } catch (Exception e) {
          Log.i("error:", e+"");
            }
    }*/
  /*public void save(String filename,String context){
      File file=new File(Environment.getExternalStorageDirectory(),filename);
      try {
          FileOutputStream fos=new FileOutputStream(file);
          byte[] bytes=context.getBytes();
          fos.write(bytes);
          fos.close();
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }


  }*/
}
