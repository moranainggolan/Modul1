package com.Mora.Modul1.Class;

public class Kelas {

    private static String nama = "Paimon";

    private static int setMinute(){
        int minute = 18;
        return minute;
    }

    public static void main(String[] args) {
        System.out.println("Nama\t: " + nama);
        System.out.println("Minute\t: " + setMinute());
    }
}
