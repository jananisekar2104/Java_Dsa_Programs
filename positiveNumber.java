import java.util.Scanner;
class positiveNumber {
    public static void main(String[]args){
        System.out.println("Enter the number :");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a>0){
            if(a%2 == 0){
                System.out.println("Even and positive number");
            } else{
                System.out.println("odd and positive number");
            }
        } else{
                System.out.println("Not a positive number");
            }
        }
    }
    

