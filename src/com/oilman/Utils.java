package com.oilman;

public class Utils {
    static String input;
    //////////////////
    static String getResponses(String input){
        Utils.input =input;
        String output;
        StringBuffer tempOutput=new StringBuffer();

        Responses responses=new Responses(input);
        Setting setting=new Setting();
        int finalNumber,positiveOrNegative;


        if (Math.random()>=0.5) positiveOrNegative=1;
        else positiveOrNegative=-1;

        finalNumber=setting.responseNumber+(positiveOrNegative*setting.randomness);

        for(int i =0;i<finalNumber;i++){
            tempOutput.append(responses.getResponses(input).get((int)(Math.random()*responses.getResponses(input).size())));
        }

        output=tempOutput.toString();

        return output;
    }
}
