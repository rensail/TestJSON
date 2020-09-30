package com.example.testjson;

/**
 * @author Sail 2020-09-30
 * 模拟JSON数据文本
 */
public class JSONContent {

    private  String  JSONString1 = "{\"student\":[{\"id\":1,\"name\":小明,\"age\":18}," +
                                                 "{\"id\":1,\"name\":小红,\"age\":17} ]}";

    private  String  JSONString2 =" {\"translation\":[\"车\"],\n" +
            "          \"basic\":\n" +
            "            {\n" +
            "              \"phonetic\":\"kɑː\",\n" +
            "              \"explains\":[\"n. 汽车；车厢\",\"n. (Car)人名；(土)贾尔；(法、西)卡尔；(塞)察尔\"]},\n" +
            "          \"query\":\"car\",\n" +
            "          \"errorCode\":0,\n" +
            "          \"web\":[{\"value\":[\"汽车\",\"车子\",\"小汽车\"],\"key\":\"Car\"},\n" +
            "                 {\"value\":[\"概念车\",\"概念车\",\"概念汽车\"],\"key\":\"concept car\"},\n" +
            "                 {\"value\":[\"碰碰车\",\"碰撞用汽车\",\"碰碰汽车\"],\"key\":\"bumper car\"}]\n" +
            "        }";

    public  String getJSONString1(){
        return  JSONString1;
    }

    public  String getJSONString2(){
        return  JSONString2;
    }

}
