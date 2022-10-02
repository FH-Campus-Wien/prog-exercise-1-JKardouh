package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a  ='Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        System.out.println((int) a + b + c + (int) d + (int) e + (int) f + (int) g + (int) h);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int result =  numA + numB;
        System.out.println(result);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int oldA = scanner.nextInt(); //5
        int oldB = scanner.nextInt(); //7
        int difference = oldA - oldB;
        int newA = oldA - difference;
        int newB = oldB + difference;
        //corner case: if difference is negative we can multiply with -1 so its positive again
        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");
        System.out.println("After Swap:");
        System.out.println("x: "+ newA);
        System.out.println("y: "+ newB);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        int num1 = scanner.nextInt();
        System.out.print("n2: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) System.out.println("n1 > n2");
        if(num1 < num2) System.out.println("n2 > n1");
        if(num1 == num2) System.out.println("n1 == n2");
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = scanner.nextInt();
        if(revenue < 0 || revenue >= 100000) System.out.println("Invalid Revenue");
        else if (revenue < 20000) System.out.println("Poor Sales Revenue");
        else if (revenue < 50000) System.out.println("Average Sales Revenue");
        else if (revenue < 80000) System.out.println("Good Sales Revenue");
        else System.out.println("Excellent Sales Revenue");
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        double commission;
        int commissionClass = scanner.nextInt();

        switch (commissionClass){
            case 1: commission = 0.01; break;
            case 2: commission = 0.02; break;
            case 3: commission = 0.03; break;
            case 4: commission = 0.04; break;
            default: commission = 0.00;
        }
        System.out.println("Your Commission Rate was set to " + commission);

    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
            System.out.println("Leapyear");
        }
        else System.out.println("Not a Leapyear");
    }

    //todo Task 10
    public void transposedNumbers(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        int reverse = 0;
        while (number!= 0){
            int rest = number %10;
            reverse = (reverse * 10) + rest;
            number = number/10;
        }

        System.out.println(reverse);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
