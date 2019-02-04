package org.andestech.learning.rfb19.g3;

import java.util.ArrayList;

public class AppCollections {

    public static void main(String [] args)

    {
        ArrayList<Double> arrayList =
                new ArrayList<>(10);

        arrayList.add(987.123);
        arrayList.add(6676.223);
        arrayList.add(12312.222222);
        arrayList.add(12312.0);

        ArrayList<Object> arrayList2 =
                new ArrayList<>(10);

        ArrayList arrayList3 =
                new ArrayList(10);

        arrayList2.add("987.123");
        arrayList2.add(6676);
        arrayList2.add(new StringBuffer("qweqwe"));
        arrayList2.add(12312.0);


        System.out.println(arrayList);




    }

}
