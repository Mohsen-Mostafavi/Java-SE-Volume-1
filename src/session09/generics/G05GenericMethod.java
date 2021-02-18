package session09.generics;

import session07.bankaccounts.CurrentAccount;

import java.util.ArrayList;
import java.util.List;

public class G05GenericMethod {

    public <T> void makeArrayList(T t) { // take an object of an unknown type and use a "T" to represent the type

       List<T> list = new ArrayList<T>(); // now we can create the list using "T"
       list.add(t);

    }

    public static void main(String[] args) {

        new G05GenericMethod().makeArrayList( new CurrentAccount(1234,"ACM",1000) );

    }

//        the method will behave as though it looked like this
//        public void m(CurrentAccount t) {
//            List<CurrentAccount> list = new ArrayList<CurrentAccount>();
//            list.add(t);
//        }

}
