

public class task_02 {
    public static void task_part_02() {
        boolean flag = true;
        System.out.println("Задача 2.\n");
        System.out.println("Простые числа в диапазоне от 1 до 1000:");
        System.out.println(1);
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
            flag = true;
        }
        System.out.println("Конец задачи 2.\n");
    }
}
