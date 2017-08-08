package com.maiacademy.lesson1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 08.08.2017.
 */
public class MyForthClass {
    public static void main(String[] arg) {

        //new list

        Collection<String> myColl =new ArrayList<>();
        myColl.add("aaaaaa");
        myColl.add("bbbbbbb");
        myColl.add("ccccccc");
        System.out.println(myColl);
        int sizeOfColl = myColl.size();
        System.out.println(sizeOfColl);
        myColl.clear();
        System.out.println(myColl);

        //new list 2
        myColl.add("hihihi");
        myColl.add("byebye");
        myColl.add("hellohello");
        System.out.println(myColl);
        System.out.println (myColl.remove("byebye"));
        System.out.println (myColl.remove("hihihi"));
        System.out.println(myColl);
        System.out.println(myColl.contains("byebye"));
        System.out.println(myColl.contains("hellohello"));


        //new list 3

        Collection<String> myColl1 =new ArrayList<>();
        Collection<String> myColl2 =new ArrayList<>();
        myColl1.add("cat"); myColl1.add("dog");
        myColl1.add("life");
        myColl2.add("cat"); myColl2.add("dog");
        System.out.println(myColl1.containsAll(myColl2));
        System.out.println(myColl1.removeAll(myColl2));
        System.out.println(myColl1);

        //new list 4

        Collection<String> myCol =new ArrayList<>();
        myColl1.add("cat"); myColl1.add("dog");
        myColl1.add("life");
        myColl2.add("cat"); myColl2.add("dog");
        System.out.println(myColl1.containsAll(myColl2));
        System.out.println(myColl1.removeAll(myColl2));
        System.out.println(myColl1);


        //new lisnked List

       List<String> lst = new LinkedList<String>();
       lst.add("my");
       lst.add("her");
       lst.add("his");
        System.out.println(lst);
        String str = lst.get(0);
        System.out.println(str);
        lst.add(1, "test");
        System.out.println(lst);
    }
}
