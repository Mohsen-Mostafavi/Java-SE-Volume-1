package session08.syntax;

import java.util.ArrayList;

public class testArray {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("ABC");

        ArrayList<String> stringList = new ArrayList<String>();

        stringList.add("MOHSEN");
        stringList.add("MAJID");
//        System.out.println(stringList.get(1));

//        ArrayList<Integer> intList = new ArrayList<>();
//        intList.add(10);
//        intList.add(20);

//        System.out.println(intList.get(1));
//
//        String[] stringArray = new String[2];
//
//        stringArray[0] = "NEJAT";
//        stringArray[1] = "HELAL";
//
//        System.out.println(stringArray[1]);
//
        String[] arrayByValue = {"Mohsen","Majid","Mohammad"};

        String s0 = arrayByValue[0];
        String s1 = arrayByValue[1];
        String s2 = arrayByValue[2];





    }
}
