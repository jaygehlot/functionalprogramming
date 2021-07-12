package strings;

public class StringEquality {
    public static void main(String[] args) {
        String literalA = "abc";  //these two allow the compiler to optimize and store the values in the same place in
        String literalB = "abc";    //memory

        String literalC = "c";

        String objectA = new String("abc"); // these two objects are stored in two different places
        String objectB = new String("abc");

        String objectC = new String("c");

        System.out.println(literalA == objectA);  //checks the data string pool memory references
        System.out.println(literalA == objectB);
        System.out.println(literalA == literalB);
        System.out.println(objectB == objectB);

        System.out.println("========");


        System.out.println(literalA.equals(objectA)); //checks the contents
        System.out.println(literalA.equals(objectB));
        System.out.println(literalA.equals(literalB));
        System.out.println(objectA.equals(objectB));

        System.out.println("============");

        System.out.println(literalC.equals(objectC));
        System.out.println(literalA.equals(literalC));
    }
}
