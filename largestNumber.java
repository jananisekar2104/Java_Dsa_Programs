import java.util.Scanner;
class largestNumber{
    public static void main(String[]args){
        System.out.println("Enter the input ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>=b && a>=c){
             System.out.println(" A is the largest number");
        }else if(b>=a && b>=c){
            System.out.println(" B is the largest number");
        }else{
            System.out.println(" C is the largest number");
        }
    }
}
