import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any digit above 9: ");
        int num = input.nextInt();
        //134
        int sum=0;
        while(num>0){
            int n = num%10;
            sum = (sum*10)+n;
            num /= 10;
        }
        System.out.println("The reversed number is : "+sum);
    }
}
