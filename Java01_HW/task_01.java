import java.util.Scanner;
public class task_01 {
    public static void task_part_01() {
        System.out.println("Задача 1.\n");
        int num_n = getInt("Введите число n в диапазоне от 2 до 16: ", 2, 16);
        int result_sum = getSum(num_n);
        printResult("Сумма чисел от 1 до ", num_n, result_sum);
        int result_mult = getMult(num_n);
        printResult("Произведение чисел от 1 до ", num_n, result_mult);
        System.out.println("\nКонец задачи 1.\n");
        
    }
    private static Integer getInt(String message, int n_min, int n_max) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(message);
        int number = 0;
        if (iScanner.hasNextInt()) {
            number = iScanner.nextInt();
        } else {
            number = 0;
        }
        if (number < n_min || number > n_max) {
            number = getInt(message, n_min, n_max);
        }
        return number;
    }

    public static Integer getSum(int n) {
        return (n + 1) * n / 2;
    }

    private static int getMult(int n) {
        int result_mult = 1;
        for (int i = 2; i <= n; i++) {
            result_mult *= i;
        }
        return result_mult;
    }

    public static void printResult(String message, int num_n, int result_num) {
        System.out.println(message + num_n + " -> " + result_num);
    }
}
