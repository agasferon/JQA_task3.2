import java.util.Scanner;
public class task_32 {
    public static void main(String[] args) {
        int amount = 100;
        System.out.println("Your amount " + amount);
        Scanner in = new Scanner(System.in);
        System.out.print("Input a recharge amount: ");
        int refill = in.nextInt();

        if (refill > 1000){
            int bonus = refill / 100;
            amount = amount + refill + bonus;
            System.out.println("Your bonus " + bonus);
            System.out.println("Your amount now " + amount);
        } else {
            amount = amount + refill;
            System.out.println("Your amount now " + amount);
        }
    }
}