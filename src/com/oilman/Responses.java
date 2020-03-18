package com.oilman;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Responses {
    static String input;

    public Responses(String input) {
        this.input = input;
    }



    public List<String> getResponses(String input) {
        //回复部分
        //一般回复
        String[] responses={
                "你妈死了。",
                "你上辈子一定是个塑料袋 那么会装。",
                "如果思考是生存的证明，我真难判断你是不是一具尸体。",
                "你和你妈打电话一定要你先挂电话，不然你妈就会挂掉。"
        };

        //定制回复
        String[] customResponses={
                "知道为什么你叫做"+input+"吗？因为你爸爸我姓",
        };





        ////操作部分
        this.input=input;
        List<String> tempList=new ArrayList<>();
        tempList.addAll(Arrays.asList(responses));
        if(input!=""){
            tempList.addAll(Arrays.asList(customResponses));
        }
        return tempList;
    }
}
