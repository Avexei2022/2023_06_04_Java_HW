import java.util.Scanner;

public class task_04 {
    public static void task_part_04() {
        System.out.println("\nЗадача 4.\n");
        String equation = get_equation("Введите уравнение (например 2? + ?5 = 69): ");
        equation = equation.replaceAll(" ", "");
        String[] eq_array = equation.split("[\\+\\=]", 0);
        if (eq_array.length != 3) {
            System.out.println("Введенное уравнение не соотвествует условиям задачи.\n");
        } else {
            Integer[] num_array = get_num_array(eq_array);
            print_result(num_array);
            System.out.println("\nКонец задачи 4.\n");
        }
    }

    public static String get_equation(String message) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(message);
        String equation = iScanner.nextLine();
        iScanner.close();
        return equation;
    }

    public static Integer[] get_num_array(String[] eq_array) {
        String[] eq_array_tmp = eq_array.clone();
        Integer[] num_array = new Integer[4];
        Integer[] tmp = new Integer[4];
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                String i_string = Integer.toString(i);
                eq_array_tmp[j] = eq_array[j].replaceAll("\\?", i_string);
                tmp[j] = Integer.parseInt(eq_array_tmp[j]);
            }
            if (tmp[0] + tmp[1] == tmp[2]) {
                num_array = tmp.clone();
                num_array[3] = 1;
                flag = true;
            }
        }
        if (!flag) {
            tmp[3] = 0;
            return tmp;
        } else {
            return num_array;
        }
    }

    public static void print_result(Integer[] num_array) {
        if (num_array[3] == 1) {
            System.out.printf("Результат: %d + %d = %d", num_array[0], num_array[1], num_array[2]);
            System.out.println();
        } else {
            System.out.println("У введенного уравнения решения нет");
            System.out.println();
        }
    }

}
