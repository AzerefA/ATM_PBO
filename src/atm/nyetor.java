/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javax.swing.JOptionPane;

/**
 *
 * @author Akito
 */
public class nyetor {
    private int saldo;
    private int jum;
    int hasil;
    public nyetor(){
        
    }
    
    public void tambah(int s,int sal){
        this.jum = s;
        this.saldo = sal;
       
        
        if(jum < 50000){
            JOptionPane.showMessageDialog(null, "Minimal seto harus Rp.50000/nSilahkan Ulangi lagi","Peringatan",0);
        }else{
            hasil = jum + sal;
            JOptionPane.showMessageDialog(null, "Saldo anda Sekarang : Rp. " + hasil,"Sukses",1);
            this.saldo = hasil;
           
        }
        
        
    }
    
    public int getsaldo(){
        return this.saldo;
    }
}
