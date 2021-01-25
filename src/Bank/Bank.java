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
public class Bank {
    int saldo;
    
    public Bank (int saldo){
        this.saldo = saldo;
    }
    public void transaksiUang(int value){
        saldo -=value;
    }
    public int getSaldo(){
        return saldo;
    }

}
