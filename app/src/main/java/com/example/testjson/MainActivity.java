package com.example.testjson;

/**
 * @author Sail 2020-09-30
 * JSON数据文件的三种解析方式
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button Org_Button,Gson_Button,Jackson_Button;
    TextView Before_TextView,After_TextView;


    JSONContent jsonContent=new JSONContent();
    OrgAnalysis orgAnalysis=new OrgAnalysis();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Org_Button=(Button)findViewById(R.id.org_button);
        Gson_Button=(Button)findViewById(R.id.gson_button);
        Jackson_Button=(Button)findViewById(R.id.jackson_button);
        Before_TextView=(TextView)findViewById(R.id.before_textview);
        After_TextView=(TextView)findViewById(R.id.after_textview);


        Org_Button.setOnClickListener(this);
        Gson_Button.setOnClickListener(this);
        Jackson_Button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case  R.id.org_button:
                Before_TextView.setText(jsonContent.getJSONString1());
                try {
                    After_TextView.setText(orgAnalysis.AnalyisisByOrg());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;

            case  R.id.gson_button:
                Before_TextView.setText(jsonContent.getJSONString2());
                break;

            case  R.id.jackson_button:
                break;

            default:
                break;


        }
    }
}