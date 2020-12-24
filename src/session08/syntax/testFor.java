package session08.syntax;

public class testFor {
    public static void main(String[] args) {

//        int j = 5;
//        j = j++;

//        for (int i=0; i<10;i++){
//            System.out.println(i);
//        }

//        String s = "ABCDEF";
//
//        for (int i = 0; i<s.length();i++){
//            System.out.println(s.charAt(i));
//        }

//        String[] array = {"MOHSEN","MAJID","MOHAMMAD"};
//
//        for (int i = 0;i<array.length;i++){
//            System.out.println(array[i]);
//        }



        String[] arrayByValue = {"Mohsen","Majid","Mohammad"};

        for (String s:arrayByValue){
            System.out.println(s);
        }
    }
}
