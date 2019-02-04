package org.andestech.learning.rfb19.g3;

import java.util.ArrayList;
import java.util.Arrays;

public class AppCollections {

    public static void main(String [] args)

    {
        ArrayList<Double> arrayList =
                new ArrayList<>(4);

        arrayList.add(987.123);
        arrayList.add(6676.223);
        arrayList.add(12312.222222);
        arrayList.add(12.0);
        arrayList.add(312.0);
        arrayList.add(12.0);

        arrayList.remove(new Double(12));

        arrayList.add(1, 77.00);
        arrayList.set(1,88.0);



        System.out.println(arrayList.size());

        ArrayList<Object> arrayList2 =
                new ArrayList<>(10);

        ArrayList arrayList3 =
                new ArrayList(10);

        arrayList2.add("987.123");
        arrayList2.add(6676);
        arrayList2.add(new StringBuffer("qweqwe"));
        arrayList2.add(12312.0);



        System.out.println(arrayList);

        Double[] datas = new Double[arrayList.size()];
        arrayList.toArray(datas);

        System.out.println(Arrays.toString(datas));


        ArrayList<Double> arrayList4 =
                new ArrayList<>(arrayList);
        arrayList4.add(88888.888);
        System.out.println(arrayList4);




    }

}
