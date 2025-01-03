public class FirstClass {
    /*
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long round = Math.round(kilometersPerHour /= 1.609);
            return round;
        }
    }
    public static double printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h.");
        }
    }
////
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == false || hourOfDay < 0 || hourOfDay > 23 || hourOfDay > 7 && hourOfDay < 23) {
            return false;
        } else {
            return true;
        }
    }
////
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }
////
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
            return true;
        }
        return false;
    }
////
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if (num3 == num1 + num2) {
            return true;
        }
        return false;
    }
////
    public static boolean hasTeen(int num1 , int num2 , int num3){
        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }
    public static boolean isTeen(int check){
        return  (check > 13 && check < 19);
    }
////
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int n1 = (int) (num1 * 1000);
        int n2 = (int) (num2 * 1000);
        if (n1 == n2){
            return true;
        }
        return false;
    }
////
    public static double convertToCentimeters(int heightInInches){
        double heightInCentimeters = heightInInches * 2.54;
        return heightInCentimeters;
    }
    public static double convertToCentimeters (int heightInFeet, int heightInInches){
        return (heightInFeet * 30.48) + convertToCentimeters(heightInInches);
    }
////
    public static String getDurationString(int seconds) {
    int minutes = 0;
        if (seconds >= 59){
        minutes = seconds / 60;
        seconds %= 60;
        getDurationString(minutes,seconds);
    }else if (seconds < 59 && seconds != 0 && seconds > 0){
        System.out.println(seconds + "s");
    }else {
            System.out.println("PLS insert a valid number!");
        }
    return null;
    }
    public static String getDurationString(int minutes , int seconds) {
        int hour = 0;
        if (minutes > 59) {
            hour = minutes / 60;
            minutes %= 60;
        }
        System.out.println(hour + "h " + minutes + "m " + seconds + "s ");
        return null;
    }
////
    public static double area(double radius){
        if (radius < 0){
            return -1.0;
        }
        return radius * radius *Math.PI;
    }
    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        }
        return x * y;
    }
////
    public static void printYearsAndDays(long minutes){
        int day = 0;
        int year = 0;
        if (minutes >= 0){
            day = (int) minutes / 1440;
            year = day / 365;
            day %= 365;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }else {
            System.out.println("Invalid Value");
        }
    }
////
    public static void printEqual(int x, int y, int z){
        if (x < 0 || y<0 || z< 0){
            System.out.println("Invalid Value");
        } else if (x == y && y == z) {
            System.out.println("All numbers are equal");
        } else if (x != y && y != z && z != x) {
            System.out.println("All numbers are different");
        } else{
            System.out.println("Neither all are equal or different");
        }
    }
////
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer){
            return temperature >= 25 && temperature <= 45;
        }
            return temperature >= 25 && temperature <= 35;
    }
////
        public static void nato(char Latter){
                switch (Latter){
                        case 'A':
                                System.out.println("Able");
                                break;
                        case 'B':
                                System.out.println("Baker");
                                break;
                        case 'C':
                                System.out.println("Charlie");
                                break;
                        case 'D':
                                System.out.println("Dog");
                                break;
                        case 'E':
                                System.out.println("Easy");
                                break;
                        default:
                                System.out.println("Try Again");
                }
        }
        public static void printDayOfWeek(int day){
        String DayOfTheWeek = switch (day){
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "thursday";
                case 3 -> "Wednesday";
                case 4 -> "tuesday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "NoGood";
        };
                System.out.println(day + " is " + DayOfTheWeek);

        }
        public static void PPP(int day){
                String dayName;
                if (day == 0){
                        dayName = "sunday";
                } else if (day == 1){
                        dayName = "monday";
                } else if (day == 2){
                dayName = "thursday";
                } else if (day == 3){
                        dayName = "Wednesday";
                } else if (day == 4){
                        dayName = "tuesday";
                } else if (day == 5){
                        dayName = "Friday";
                } else if (day == 6){
                        dayName = "Saturday";
                }else {
                        dayName = "No Good";
                }
                System.out.println(day + " is " + dayName);
        }
        }
    public static void printNumberInWord(int num){
        String word = switch (num){
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Other";
            };
        System.out.println(word);;
        }
        public static boolean isLeapYear(int year){
            if (year < 1 || year > 9999){
                return false;
            }
            else if (year %4 == 0 && year %100 != 0 || year %400 == 0){
                return true;
            }
            return false;
        }
        public static int getDaysInMonth(int mounth, int year) {
            if (mounth < 1 || mounth > 12 || year < 1 || year > 9999) {
                return -1;
            } else if (isLeapYear(year) && mounth == 2) {
                return 29;
            } else {
                switch (mounth) {
                    case 1:
                    case 12:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                        return 31;
                    case 2:
                        return 28;
                    default:
                        return 30;
                }
            }
        }
    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
            return true;
    }
    public static void primeCounter(){
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
        if (isPrime(i)) {
            System.out.println(i);
            count++;
            if (count == 3){
                break;
            }
        }
        }
    }

    public static void divideShit(){
        int sum =0;
        int count =0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (count < 5) {
                    sum += i;
                    System.out.println(i);
                    count++;
                } else {
                    System.out.println(sum);
                    break;
                }
            }
            }

        }

    public static boolean isOdd(int number) {
        if (number < 0){
            return false;
        }else if (number %2 != 0){
            return true;
        }else {
            return false;
        }
    }
    public static void sumOdd(int start , int end){
        int sum = 0;
        if (end >= start && end > 0 && start > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }else {
            System.out.println("-1");
        }
        System.out.println(sum);
        }
*/
    public static boolean isEvenNumber(int num){
        if (num %2 == 0){
            return true;
        }else {
            return false;
        }
    }
    public static void testEvenNumbers(){
        int a = 5;
        int b = 50 ;
        int count = 0;
        do {
            if (isEvenNumber(a)) {
                System.out.println(a + ",");
                count++;
                System.out.println(count);

            }
            a++;

        }while (count<5 );

    }

    public static void main (String[]args){
        /*
        toMilesPerHour(1.5);
        printConversion(1.5);
        shouldWakeUp(true, 22);
        boolean D = areEqualByThreeDecimalPlaces(1.321,1.323);
        System.out.println(D);
        double N = convertToCentimeters(6,1);
        System.out.println(N);
        getDurationString(3600);
        printYearsAndDays(525600);
            boolean s;
            s = isCatPlaying(false, 45);
            System.out.println(s);
                nato("Z");
                printDayOfWeek(5);
        PPP(1);
            printNumberInWord(5);

        int i = getDaysInMonth(1,2020);
        System.out.println(i);
        primeCounter();

        divideShit();


        sumOdd(100,1000);
         */
        testEvenNumbers();
        
        }


}
