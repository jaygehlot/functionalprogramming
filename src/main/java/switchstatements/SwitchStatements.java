package switchstatements;

public class SwitchStatements {

    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    public static void main(String[] args) {
        oldStyleSwitch();
        newStyle();
        switchWithEnums(Season.SUMMER);
    }


    private static void switchWithEnums(final Season selectedSeason) {
        String season = switch(selectedSeason) {
            case SPRING, SUMMER -> "Sunny";
            case AUTUMN -> "Blustery";
            case WINTER -> "Cold";
            default ->"Invalid season";
        };
        System.out.println(season);
    }

    //works with Java 12 only
    private static void newStyle() {
        int stage = 2;
        String season = switch(stage) {
            case 1 -> "Spring";
            case 2 -> "Summer";
            case 3 -> "Autumn";
            case 4 -> "Winter";
            default ->"Invalid season"; //default case is needed otherwise code will not compile
        };
        System.out.println(season);
    }

    private static void oldStyleSwitch() {
        int stage = 2;
        String season;
        switch (stage) {
            case 1:
                season = "Spring";
                break;
            case 2:
                season = "Summer";
                break;
            case 3:
                season = "Autumn";
                break;
            case 4:
                season = "Winter";
                break;
            default:
                season = "Invalid season";
        }
        System.out.println(season);
    }
}
