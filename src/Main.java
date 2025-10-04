import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        // Целочисленный массив, заполненный цифрами 1,2,3 с помощью ключевого слова new
        System.out.println("Task 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        //Массив с числами — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        System.out.println("Дробный массив");
        double[] c = {1.57, 7.654, 9.986};
        // Произвольный массив.
        System.out.println("Произвольный массив");
        String[] e = {"apple", "banana", "cherry"};

        // Задача 2:
        // Вывод массивов в прямом порядке
        System.out.println("Task 2");
        // Вывод целочисленного массива
        System.out.println(Arrays.toString(a));
        // Вывод массива дробных чисел
        System.out.println(Arrays.toString(c));
        // Вывод произвольного массива
        System.out.println(Arrays.toString(e));

        // Задача 3:
        // Вывод массивов в обратном порядке
        System.out.println("Task 3");
        // Вывод целочисленных
        for (int b = a.length - 1; b >= 0; b--) {
            System.out.print(a[b]);
            if (b > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Вывод дробных
      for (int d = c.length - 1; d >= 0; d--) {
          System.out.print(c[d]);
          if (d > 0) {
              System.out.print(", ");
            }
        }
        System.out.println();

        // Вывод произвольных
        for (int f = e.length - 1; f >= 0; f--) {
            System.out.print(e[f]);
            if (f > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача 4:
        // Меняем нечетные на четные
        System.out.println("Task 4");
        for (int g = 0; g < a.length; g++) {
            if (a[g] % 2 != 0) {
                a[g]++;
            }
        }
        System.out.println("Четный массив" + Arrays.toString(a));
    }
}
