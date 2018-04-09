package com.sda.sorting;

public class CountingSort {
    public static void sort(int[] tablica){
        int licznikOperacji = 0;

        //tablica ma 1000 elementów
        //odgórny zakres --> 255
        int[] ilościLiczb = new int[256];
        for (int i = 0; i < tablica.length ; i++) {
            licznikOperacji++;
            int wartoscTablicy = tablica[i];
            ilościLiczb[wartoscTablicy]++;
        }

        int pozycjaWstawiania = 0;
        // n operacji teraz trzeba je wstawic
        for (int j = 0; j < ilościLiczb.length; j++) {
            for (int i = 0; i < ilościLiczb[j]; i++) {
                licznikOperacji++;
                tablica[pozycjaWstawiania] = j;
                pozycjaWstawiania++;
            }
        }
        System.out.println("Licznik: " + licznikOperacji);
    }
}
