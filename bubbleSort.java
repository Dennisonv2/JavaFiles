import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Неотсортированный массив:");
        System.out.println(Arrays.toString(arr));

        BubbleSort(arr);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr));
    }
/*
Основной код сортировки находится в методе BubbleSort, который принимает на вход массив arr.

В начале метода определяется длина массива и сохраняется в переменную n.

Затем, внешний цикл for проходит от 0 до n-1. Он определяет, сколько раз нужно выполнить внутренний цикл for.

Внутренний цикл for проходит от 0 до n-i-1, где i - текущая итерация внешнего цикла. Он служит для сравнения двух
соседних элементов массива и их возможного обмена местами.

Внутри внутреннего цикла if-условие проверяет, является ли текущий элемент arr[j] большим,
чем следующий элемент arr[j+1]. Если это условие выполняется, то значения этих
двух элементов меняются местами с использованием временной переменной temp.
 */
    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен значениями
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
