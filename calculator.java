import java.util.*;
public class calculator {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int x=sc.nextInt();
         System.out.print("Enter the second value: ");
        int y=sc.nextInt();
        System.out.print("Enter the operator:");
        char operation=sc.next().charAt(0);
        double ans=0;
        switch(operation){
            case '+':
            ans=x+y;
            System.out.println("SUm: " + ans);
            break;

            case '-':
            ans=x-y;
            System.out.println("SUm: " + ans);
            break;

            case '*':
            ans=x*y;
            System.out.println("SUm: " + ans);
            break;

            case '/':
            ans=x/y;
            System.out.println("SUm: " + ans);
            break;

            case '^':
            ans=Math.pow(x,y);
            System.out.println("SUm: " + ans);
            break;

            default:
            System.out.println("Invalid operator");
        }
    }
}
