import java.util.Scanner;
public class TaskBonusForRefill {
    public static void main(String[] args) {
        int amount = 100;
        int bonus = 0;
        System.out.println("Your amount " + amount);
        Scanner in = new Scanner(System.in);
        System.out.print("Input a recharge amount: ");
        int refill = in.nextInt();

        amount = amount + refill;

        if (refill > 1000){
            bonus = refill / 100;
            amount = amount + bonus;
            System.out.println("Your bonus " + bonus);
        }

        System.out.println("Your amount now " + amount);
    }
}