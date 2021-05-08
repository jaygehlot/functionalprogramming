package switchstatements;

public class SwitchStatements {

    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    public static void main(String[] args) {
        oldStyleSwitch();
        newStyle();
        switchWithEnums();
    }

    private static void switchWithEnums() {
        String season = switch(Season.AUTUMN) {
            case SPRING -> "Sunny";
            case SUMMER -> "Hot";
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
            default ->"Invalid season";
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
