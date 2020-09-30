package com.example.testjson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OrgAnalysis {
    private  JSONContent jsonContent=new JSONContent();

    public  String AnalyisisByOrg() throws JSONException {

        String res="";

        JSONObject  rootObject=new JSONObject(jsonContent.getJSONString1());
        JSONArray   jsonArray=rootObject.getJSONArray("student");
        StringBuilder result_builder=new StringBuilder();
        for(int i=0;i<jsonArray.length();i++){
               JSONObject  object=jsonArray.getJSONObject(i);
               result_builder.append("编号："+object.getInt("id"));
               result_builder.append(" 姓名："+object.getString("name"));
               result_builder.append(" 年龄："+object.getInt("age"));
               result_builder.append("\n");
        }
        res=result_builder.toString();

        return res;
    }
}
