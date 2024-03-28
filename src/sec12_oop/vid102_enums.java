package sec12_oop;

public class vid102_enums {
    public static void main(String[] args) {
//        whichSeason(-5);
        whichSeason(Month.MARCH);
        whichSeason(Month.FEBRUARY);
        whichSeason(Month.JULY);
        whichSeason(Month.DECEMBER);
        whichSeason(Month.OCTOBER);
        whichSeason(Month.APRIL);
        whichSeason(Month.SEPTEMBER);
    }

//    public static void whichSeason(Month month) {
//        switch (month) {
//            case JANUARY:
//                System.out.printf("%s is in summer.\n", month);
//                break;
//            case FEBRUARY:
//                System.out.printf("%s is in summer.\n", month);
//                break;
//            case MARCH:
//                System.out.printf("%s is in autumn.\n", month);
//                break;
//            case APRIL:
//                System.out.printf("%s is in autumn.\n", month);
//                break;
//            case MAY:
//                System.out.printf("%s is in autumn.\n", month);
//                break;
//            case JUNE:
//                System.out.printf("%s is in winter.\n", month);
//                break;
//            case JULY:
//                System.out.printf("%s is in winter.\n", month);
//                break;
//            case AUGUST:
//                System.out.printf("%s is in winter.\n", month);
//                break;
//            case SEPTEMBER:
//                System.out.printf("%s is in spring.\n", month);
//                break;
//            case OCTOBER:
//                System.out.printf("%s is in spring.\n", month);
//                break;
//            case NOVEMBER:
//                System.out.printf("%s is in spring.\n", month);
//                break;
//            case DECEMBER:
//                System.out.printf("%s is in summer.\n", month);
//                break;
//        }
//
//    }

//    public static void whichSeason(Month month) {
//        switch (month) {
//            case DECEMBER:
//            case JANUARY:
//            case FEBRUARY:
//                System.out.printf("%s is in summer.\n", month);
//                break;
//            case MARCH:
//            case APRIL:
//            case MAY:
//                System.out.printf("%s is in autumn.\n", month);
//                break;
//            case JUNE:
//            case JULY:
//            case AUGUST:
//                System.out.printf("%s is in winter.\n", month);
//                break;
//            case SEPTEMBER:
//            case OCTOBER:
//            case NOVEMBER:
//                System.out.printf("%s is in spring.\n", month);
//                break;
//        }
//    }

//    public static void whichSeason(Month month) {
//        switch (month) {
//            case DECEMBER, JANUARY, FEBRUARY:
//                System.out.printf("%s is in summer.\n", month);
//                break;
//            case MARCH, APRIL, MAY:
//                System.out.printf("%s is in autumn.\n", month);
//                break;
//            case JUNE, JULY, AUGUST:
//                System.out.printf("%s is in winter.\n", month);
//                break;
//            case SEPTEMBER, OCTOBER, NOVEMBER:
//                System.out.printf("%s is in spring.\n", month);
//                break;
//        }
//    }

    public static void whichSeason(Month month) {
        System.out.println(
                month.name() + " is in " +  switch (month) {
                    case DECEMBER, JANUARY, FEBRUARY -> "summer";
                    case MARCH, APRIL, MAY -> "autumn";
                    case JUNE, JULY, AUGUST -> "winter";
                    case SEPTEMBER, OCTOBER, NOVEMBER -> "spring";
                    default -> throw new IllegalStateException("Invalid month: " + month);
                }
        );
    }

//    public static void whichSeason(int month) {
//        switch (month) {
//            case 1:
//                System.out.println("January is in summer.");
//                break;
//            case 2:
//                System.out.println("February is in summer.");
//                break;
//            case 3:
//                System.out.println("March is in autumn.");
//                break;
//            case 4:
//                System.out.println("April is in autumn.");
//                break;
//            case 5:
//                System.out.println("May is in autumn.");
//                break;
//            case 6:
//                System.out.println("June is in winter.");
//                break;
//            case 7:
//                System.out.println("July is in winter.");
//                break;
//            case 8:
//                System.out.println("August is in winter.");
//                break;
//            case 9:
//                System.out.println("September is in spring.");
//                break;
//            case 10:
//                System.out.println("October is in spring.");
//                break;
//            case 11:
//                System.out.println("November is in spring.");
//                break;
//            case 12:
//                System.out.println("December is in summer.");
//                break;
//            default:
//                System.out.printf("%d is an invalid month.", month);
//                break;
//        }
//    }
}
