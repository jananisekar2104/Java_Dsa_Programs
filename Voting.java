import java.util.Scanner;
class Voting {
    public static void main(String[] args) {
        System.out.println("Enter your age :");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
       
        if(age >= 18){
             age++;
            System.out.println("Your Are Eligible for vote");
            
        }
        else{
            System.out.println("Not Eligible for vote");
            
        }
        System.out.println(age);
    
    }
}
