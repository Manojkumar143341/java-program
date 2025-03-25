import java.util.Scanner;






public class primenumber {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int a = scanner.nextInt(); 
if (a>0){


    
    System.out.println("number is positive");
}else if (a<0){
      System.out.println("number is negative");
}else {
            System.out.println("Number is zero");
        }
  scanner.close();




    }
}
