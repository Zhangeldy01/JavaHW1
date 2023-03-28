/*Task_1.
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона.
Используя данные из массива найдите их кубы.
 Sample Input:
 8
 11
 Sample Output:
 512
 1331*/

import java.util.Scanner;

public class HW_task1 {
    public static void main(String[] args) {
        int[] cubes = new int[1000];
        for (int i = 1; i <= 1000; i++) {
            cubes[i - 1] = i * i * i;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.printf("a: ");
        int a = scanner.nextInt();
        System.out.printf("b: ");
        int b = scanner.nextInt();
        int cubes1 = cubes[a - 1];
        int cubes2 = cubes[b - 1];
        System.out.println(cubes1);
        System.out.println(cubes2);
    }
}