import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String input = scaner.nextLine();
    System.out.println(calc(input));
    }
    public static String calc(String input) {
        String[] input1 =input.split(" ");
        int a = Integer.parseInt(input1[0]);
        String oper = input1[1];
        int b = Integer.parseInt(input1[2]);
        int result=0;
        if (a<0 || a>10 || b<0 || b>10) return "На вход подавать числа от 1 до 10";
        if (oper.equals("+")) result=a+b;
        if (oper.equals("-")) result=a-b;
        if (oper.equals("/")) result=a/b;
        if (oper.equals("*")) result=a*b;
        return String.valueOf(result);
    }
}