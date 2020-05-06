# Задача №2 - "Получи рубль за каждые 100!"

## Исходный код task_32.class
```java
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
```

Работа написана в следующем окружении:
* Windows 10 1903 18362.778
* openjdk version "11.0.7" 2020-04-14
* OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.7+10)
* OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.7+10, mixed mode)