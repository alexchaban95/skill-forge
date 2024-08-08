package org.example.behavioral.strategy.sort;

public class SelectionSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = numbers[minIdx];
            numbers[minIdx] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println("Sorted using Selection Sort");
    }
}