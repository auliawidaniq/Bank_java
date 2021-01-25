/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author Aulia
 */
import java.util.Scanner;
public class BankT {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        Bank coba = new Bank (100000);
        
        System.out.print("Account ini milik : "); 
        String account = scan.nextLine();
        System.out.print("Transaksi Terakhir : Rp. "); 
        int transaksi = scan.nextInt();
        coba.transaksiUang(transaksi);
        System.out.println("Saldo saat ini : Rp. " + coba.getSaldo());
    }
}
