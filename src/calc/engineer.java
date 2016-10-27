package calc;
/**
 * Created by ty39p_000 on 27.10.2016.
 */
public class engineer {


    public static void engineer(int n1, int n2, String op){
        int res = 0;
        boolean changed = false;
        switch(op)
        {
            case "+": res = n1 + n2; changed=true;
                break;
            case "-": res = n1 - n2; changed=true;
                break;
            case "*": res = n1 * n2; changed=true;
                break;
            case "/": if(n2==0){System.out.print("Нельзя делить на ноль");}else{ res = n1 / n2; changed=true;}
                break;
            default: System.out.print("Ошибка");

        }
        if(changed)
            System.out.print("Ответ: "+res);
    }
    public static void standart(int n1, int n2, String op){
        int res = 0;
        boolean changed=false;
        switch(op)
        {
            case "+": res = n1 + n2; changed=true;
                break;
            case "-": res = n1 - n2; changed=true;
                break;

            default: System.out.print("Данный калькулятор не поддерживает выбранную операцию");

        }
        if(changed)
            System.out.print("Ответ: "+res);
    }

}
