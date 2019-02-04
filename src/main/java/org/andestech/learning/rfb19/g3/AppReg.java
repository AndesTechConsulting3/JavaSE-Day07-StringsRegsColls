package org.andestech.learning.rfb19.g3;


import java.util.regex.*;

public class AppReg {

    public static void main(String[] args)
    {
        String strPattern = "^.*[a-zA-Z]{2,4}[0-9].*$";
        String dataStr = "l3kasjlkj6fsa";

        // [0-9] = \\d

        strPattern = "^\\+\\d{1,3}\\(\\d{3}\\)\\d{4}-\\d{3}";
        dataStr = "+007(234)5678-345";


       // strPattern = "[а-яА-Я]+";
       // dataStr = "Petrov";


        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(dataStr);

        System.out.println(matcher.matches());


        dataStr = "asjhgdjhg62735kjashdkjh87987(*(*&...76576kjhH9845";

        pattern = Pattern.compile("\\d+");
        matcher = pattern.matcher(dataStr);

        while (matcher.find())
        {
            System.out.println("data: "+ matcher.group() + ", start:" +
                    matcher.start() + ", end:" + matcher.end());

        }



    }
}
