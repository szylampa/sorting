package com.sda.sorting;

public class InsertionSort {
    public static void sort(int[] tablica) {
        int n = tablica.length;
        int licznik = 0;

        //rozpoczynamy od drugiego elementu
        for (int i = 1; i < n; i++) {
            int klucz = tablica[i];
            int j = i - 1;
            while (j >= 0 && tablica[j] > klucz) {
                licznik++;
                tablica[j + 1] = tablica[j];
                j--;
            }
            tablica[j + 1] = klucz;
        }
        System.out.println("Licznik: " + licznik);
    }
}
