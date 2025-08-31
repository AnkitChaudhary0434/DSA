package work;

import java.util.Scanner;

public class fruites {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("falo ka raja");
//            case "Apple" -> System.out.println("lal mitha fal");
//            case "Orange" -> System.out.println("one of my fav");
//            case "Grapes" -> System.out.println("small and sweet");
//            case "Banana" -> System.out.println("land jesa tagatwar fal");
//            default -> System.out.println("please enter valid fruites");
//        }

        String day = in.next();

        switch (day) {
            case "1" -> System.out.println("Monday");
            case "2" -> System.out.println("Tuesday");
            case "3" -> System.out.println("Wednesday");
            case "4" -> System.out.println("Thursday");
            case "5" -> System.out.println("Friday");
            case "6" -> System.out.println("Saturday");
            case "7" -> System.out.println("Sunday");
        }
    }
}
