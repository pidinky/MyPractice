import java.util.Scanner;

public class arrayExample {
    public static void main(String[] args) {

        int daysOfMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month;
        String monthName;

        Scanner sc = new Scanner(System.in);


        System.out.println("Input the month: ");
        if(!sc.hasNextInt()){
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        month = sc.nextInt();
        if (month > 12) {
            System.out.println("Invalid month");
            sc.close();
            return;
        }

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month.";
                break;
        }

        System.out.print("You input month " + monthName + ". ");
        System.out.println("Your month has " + daysOfMonth[month - 1] + " days.");

        sc.close();

    }
}
