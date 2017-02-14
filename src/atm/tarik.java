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
public class tarik {
    private int saldo;
    int hasil;
    int jum;
    public tarik(){
       
    }
    
    public void ambil(int t,int sal){
        this.saldo = sal;
        this.jum = t;
        if (this.saldo < jum) {
            JOptionPane.showMessageDialog(null, "Saldo tidak mencukupi", "Gagal",0);
        }else{
            hasil = this.saldo - jum;
            JOptionPane.showMessageDialog(null, "Saldo anda Adalah : RP. " + hasil,"Sukses",1);
            this.saldo = hasil;
        }
    }
    
    public int getsaldo(){
        
        
        return this.saldo;
    }
    
}
