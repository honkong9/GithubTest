package com.example.user.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrintStarActivity extends AppCompatActivity {
    private EditText num = null;
    private Button check = null;
    private TextView view = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);
        getSupportActionBar().setTitle("별찍기");

        num = findViewById(R.id.num);
        check = findViewById(R.id.check);
        view = findViewById(R.id.view);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = num.getText().toString();
                int no = checkInteger(value);

                if(no>0){
                    String result = "";
                    for(int i=1; i<=no; i++){
                    for(int j=0;j<i;j++){
                        result +="*";
                    }
                    result += "\n";
                }
                view.setText(result);
            }
            }
        });
    }
    private int checkInteger(String v){
        int result = 0;
        try{
            result = Integer.parseInt(v);
        }catch(Exception e){}
        return result;
    }



}
