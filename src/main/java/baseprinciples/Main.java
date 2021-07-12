package baseprinciples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        UserTableManager userTableManager = new UserTableManager();

        UserData userData = new UserData("Jay Gehlot", "gehlotj@gmail.com");
        userTableManager.putItem(userData);

        NonNegativeArrayList nonNegativeArrayList = new NonNegativeArrayList(-10, 2, 3, -2, 0);
        System.out.println(nonNegativeArrayList);

        nonNegativeArrayList.add(-1);
        nonNegativeArrayList.add(9);
        nonNegativeArrayList.addAll(List.of(-11, 12, 4));

        ListIterator<Integer> integerListIterator = nonNegativeArrayList.listIterator();
        integerListIterator.next();
        integerListIterator.set(-19);

        nonNegativeArrayList.replaceAll(n -> n-1);
        System.out.println(nonNegativeArrayList);

        HashSet<Integer> hashSet = new HashSet<>() {{
            add(1);
            add(-3);
            add(10);
            add(0);
        }};

        ArrayList<Integer> arrayList = new ArrayList<>() {{
           add(-17);
           add(11) ;
           add(48) ;
           add(-8) ;
           add(-5) ;
        }};

        //compile time polymorphism - method overloading
        List<Integer> hashNonNegativeList = new NonNegativeArrayList(hashSet);
        List<Integer> arrayNonNegativeList = new NonNegativeArrayList(arrayList);
        List<Integer> nonNegativeList = new NonNegativeArrayList(-10, 2,3, -2, 0);

        System.out.println(hashNonNegativeList);
        System.out.println(arrayNonNegativeList);
        System.out.println(nonNegativeList);
    }
}
