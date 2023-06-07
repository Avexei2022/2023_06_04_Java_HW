import java.util.Scanner;

public class task_03 {

    public static Scanner iScanner = new Scanner(System.in);

    public static void task_part_03() {
        System.out.println("\nЗадача 3.\n");
        float num_A = getNum("Введите первое число А: ");
        String sign_in = getOper("Введите знак (+ - * /): ");
        float num_B = getNum("Введите второе число B: ");
        float result = getResult(num_A, num_B, sign_in); 
        System.out.printf("Результат: %f %s %f = %f", num_A, sign_in, num_B, result);
        System.out.println("\nКонец задачи 3.\n");
    }

    public static float getNum(String string) {
        System.out.printf(string);
        float number = 0;
        try {
            number = iScanner.nextFloat();
            // iScanner.close();
        } catch (Exception e) {
            System.out.println("Вы не захотели вводить число, будем считать что вы ввели цифру 0.");
            number = 0;
        }
        return number;
    }

    private static String getOper(String string) {
        String[] signes = new String[] { "+", "-", "*", "/" };
        System.out.printf(string);
        String sign_input = iScanner.next();
        // iScanner.close();
        boolean flag = true;
        for (int i = 0; i < signes.length; i++) {
            if (signes[i].equals(sign_input)) {
                flag = false;
            }
        }
        if (flag){
            sign_input = getOper(string);
        }
        return sign_input;
    }

    private static float getResult(Float num_A, Float num_B, String sign_in) {
        float result = 0;
        switch (sign_in) {
            case "+":
                result = num_A + num_B;
                break;
            case "-":
                result = num_A - num_B;
                break;
            case "*":
                result = num_A * num_B;
                break;
            case "/":
                if (num_B == 0) {
                    System.out.println("Делить на 0 нельзя!");
                    result = 999999;
                } else {
                    result = num_A / num_B;
                }
                break;
        }
        return result;
    }


}
