package org.andestech.learning.rfb19.g3;

import java.util.Arrays;

public class App
{
    private static Boolean compareLogins(String s1, String s2)
    {
        return  s1.trim().toUpperCase().
                equals(s2.trim().toUpperCase());

    }

    public static void main( String[] args )
    {
        System.out.println("HGwytДДДhgjhg54654".charAt(5));

        String login = "APetrov";
        String login2 = new String("APetrov");

        String loginFromDB = "APetrov";
        String loginFromUI = " aPetrov";

        if(compareLogins(loginFromDB, loginFromUI))
        {
            System.out.println("Logins are the same!");
        }


        if(login.toUpperCase().contains(" PeTroV".toUpperCase()))
        {
            System.out.println("Ok! Sname is Petrov");
        }

        // slice

        String email = "Василий.В.Кузнецов@aaa.bbb.com";

        System.out.println(email.substring(0,email.length()));
        System.out.println(email.charAt(email.length()-1));

        System.out.println(email.indexOf('@'));

        String user = email.substring(0,email.indexOf('@'));

        System.out.println("User: " + user);

        String domain = email.substring(email.indexOf('@')+1);

        System.out.println("Domain: " + domain);

        String[] fio =
                user.split("\\.");

        System.out.println(Arrays.toString(fio));
        //--------------------
        // data
        String data = "7657;121212;23234 9898,2112,98987";












    }
}
