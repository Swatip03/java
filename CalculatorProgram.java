import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st Number :: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd Number :: ");
        int num2 = sc.nextInt();

        int ans = 0;

        while (true) {
             
            System.out.println("Enter the Operator :: ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-'|| op == '*'|| op == '/'|| op == '%') {

                if (op == '+') {

                    ans = num1 + num2;
                    
                }
                if (op == '-') {

                    ans = num1 - num2;
                    
                }
                if (op == '*') {

                    ans = num1 * num2;
                    
                }
                if (op == '%') {

                    ans = num1 % num2;
                    
                }
                if (op == '/') {

                    if (num2 != 0) {

                        ans = num1 / num2;
                        
                    }
                    
                }


                System.out.println(ans);
                
            }

            else if (op == 'x' || op == 'X') {

                break;
                    
                }

            else{

                System.out.println("Invalid Operation!!!");

             }

            
            
        }

        sc.close();

    }
    
}
