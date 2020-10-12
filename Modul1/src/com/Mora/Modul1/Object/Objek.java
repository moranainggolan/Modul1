package com.Mora.Modul1.Object;

public class Objek {
    public static void main(String[] args) {

        //Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();
        mahasiswaTanpa.setNama("Mora");
        mahasiswaTanpa.setNim(19104066);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

        //Deklarasi object dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 121991);

        //Output
        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t: " + mahasiswa.getNim());
        }
    }
