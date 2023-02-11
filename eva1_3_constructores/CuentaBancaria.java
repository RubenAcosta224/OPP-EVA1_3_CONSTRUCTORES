/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_constructores;

/**
 *
 * @author invitado
 */
public class CuentaBancaria {
    //atributos
    private String numCuenta;
    private double saldo;
    private String cliente;
    
    //constructores
    //default y con argumentos
    //se llama igual que la clase
    public CuentaBancaria(){//constructor default
        numCuenta="---";
        saldo=0;
        cliente="---";
    }
    
    
    public CuentaBancaria(String nCuenta, double nSaldo, String nCliente){
        numCuenta=nCuenta;
        saldo=nSaldo;
        cliente=nCliente;
    }
    
    
    
    public void setNumeroDeCuenta(String a){
        numCuenta=a;
    }
    public String getNumeroDeCuenta(){
        return numCuenta;
    }
    
    
    public void setSaldo(double a){
        saldo=a;
    }
    public double getSaldo(){
        return saldo;
    }
    
    
    public void setCliente(String a){
        cliente=a;
    }
    public String getCliente(){
        return cliente;
    }
    
}
