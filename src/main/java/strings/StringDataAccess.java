package strings;

public class StringDataAccess {

    public static void main(String[] args) {
        String apples = "Apples";
        //index------>   012345

        //to access char at given index
        char c = apples.charAt(3);
        System.out.println("Starting with zero index, expect to see 4th from beginning. : " + c);

        System.out.println(apples.indexOf('e'));
        System.out.println(apples.substring(2, 4));
        System.out.println(apples.toCharArray()[4]);
    }
}
