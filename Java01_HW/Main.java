import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Для запуска конкретной задачи введите её номер (1-4).");
        System.out.printf("Для запуска последовательно всех задач введите любой символ: ");
        String task_num = iScanner.next();
        switch (task_num) {
            case "1":
                task_01.task_part_01();
                break;
            case "2":
                task_02.task_part_02();
                break;
            case "3":
                task_03.task_part_03();
                break;
            case "4":
                task_04.task_part_04();
                break;
            default:
                task_01.task_part_01();
                task_02.task_part_02();
                task_03.task_part_03();
                task_04.task_part_04();
                break;
        }
        iScanner.close();
    }
    
}