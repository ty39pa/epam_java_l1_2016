package calc;
import java.util.Scanner;
import static calc.engineer.engineer;
import static calc.engineer.standart;
/**
 * Created by ty39p_000 on 27.10.2016.
 */
public class maincalc {
    public static void main(String[] args)
    {
        int res = 0;
        boolean changed = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Если вам нужен обычный калькулятор введите 1, если инженерный, введите 2");
        int type = sc.nextInt();


        System.out.println("Введите первое число:");
        int n1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int n2 = sc.nextInt();
        System.out.println("Введите знак операции:");
        String op = sc.next();
        sc.close();

        switch(type)
        {
            case 2: engineer(n1,n2,op);
                break;
            case 1: standart(n1,n2,op);
                break;
            default: System.out.println("Неверный тип калькулятора");
        }

    }
}
