package HomeWork1;/*Task_2.
Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа.
Выведите на экран результат умножения построчно.
 Sample Input:
        4
        1
        2
        3
        5
        2
 Sample Output:
        2
        4
        6
        10 */
import java.util.Scanner;
public class HW_task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Введите множитель: ");
        int multiplyBy = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i] * multiplyBy);
        }
    }
}