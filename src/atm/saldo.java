/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Akito
 */
public class saldo {
    private int saldo = 500000;
    
    public void saldo(int hasil)
    {
        this.saldo += hasil;
    }
    
    public int getsaldo()
    {
        return this.saldo;
    }

    
    
}
