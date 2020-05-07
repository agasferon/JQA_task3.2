# Задача №2 - "Получи рубль за каждые 100!"

## Исходный код TaskBonusForRefill.class
```java
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
```

Работа написана в следующем окружении:
* Windows 10 1903 18362.778
* openjdk version "11.0.7" 2020-04-14
* OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.7+10)
* OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.7+10, mixed mode)