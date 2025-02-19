import java.util.Scanner;
class week {
    public static void main(String[]args){
        System.out.println("Enter you number:");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        switch(day*2){
            case 2:
            System.out.println("Sunday");
            break;
            case 4:
            System.out.println("Monday");
            break;
            case 6:
            System.out.println("Thursday");
            break;
            case 8:
            System.out.println("Wednesday");
            break;
            default:
            System.out.println("Invalid input");
            break;
        }
    }
    
}
