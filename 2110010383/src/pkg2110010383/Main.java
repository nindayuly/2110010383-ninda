/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010383;

import PenjualanSembako.*;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Overload Method");
        Karyawan objku = new Karyawan();
    System.out.println("Data Karywan: " +objku.dataKaryawan("001 ", "Ninda ", "kapuas ", "kapuas ", "01"));
    
        Penjualan objku2 = new Penjualan();
    System.out.println("Data Penjualan: " +objku2.dataPenjualan("01 ", " kamis 02-01-2023 ", "Rp.100000 ", "001 ", "01"));
    
        Detail_Transaksi objku3 = new Detail_Transaksi();
    System.out.println("Data Detail_Transaksi: " +objku3.dataDetail_Transaksi("10 ", "005 ", "100000 "));
    
        Sembako objku4 = new Sembako();
    System.out.println("Data Sembako: " +objku4.dataSembako("006 ", "beras ", "60000 ", "1 kg ", "50"));
    
        User objku5 = new User();
    System.out.println("Data User: " +objku5.dataUser("001 ", "ninda ", "123"));
    
        Piutang objku6 = new Piutang();
    System.out.println("Data Piutang: " +objku6.dataPiutang("11 ", "19/jumat/2023 ", "150000 "));
    
    
        Pembayaran objku7 = new Pembayaran();
    System.out.println("Data Pembayaran: " +objku7.dataPembayaran("0013 ", "1", "ninda ", "ninda ", "ninda"));
    
    System.out.println("");
    
    System.out.println("Overload Constructor");
    
    Karyawan objku8 = new Karyawan("001 ", "Ninda ", "kapuas ", "kapuas ", "01");
    System.out.println("Data Karywan: " +objku8.dataKaryawan());
    
        Penjualan objku9 = new Penjualan("01 ", " kamis 02-01-2023 ", "Rp.100000 ", "001 ", "01");
    System.out.println("Data Penjualan: " +objku9.dataPenjualan());
    
        Detail_Transaksi objku10 = new Detail_Transaksi("10 ", "005 ", "100000 ");
    System.out.println("Data Detail_Transaksi: " +objku10.dataDetail_Transaksi());
    
        Sembako objku11 = new Sembako("001 ", "ninda ", "123 ", "vv", "ee");
    System.out.println("Data Sembako: " +objku11.dataSembako());
    
        User objku12 = new User("001 ", "ninda ", "123 ");
    System.out.println("Data User: " +objku12.dataUser());
    
        Piutang objku13 = new Piutang("01 ", "19-jumat-2023 ", "150000 ");
    System.out.println("Data Piutang: " +objku13.dataPiutang());
    
        Pembayaran objku14 = new Pembayaran("0013 ", "1", "ninda ", "ninda ", "ninda");
    System.out.println("Data Pembayaran: " +objku14.dataPembayaran());
    
    }
    
}
