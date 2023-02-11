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
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Clase cuenta bancaria
        CuentaBancaria cuenta1=new CuentaBancaria("1",40000000,"Carlos Slim");
        
        /*
        cuenta1.setCliente("Carlos Slim");
        cuenta1.setSaldo(40000000);
        cuenta1.setNumeroDeCuenta("1");
                */
        
        
        System.out.println("Datos del cliente");
        
        String nombre=cuenta1.getCliente();
        
        System.out.println(nombre);
        System.out.println(cuenta1.getNumeroDeCuenta());
        System.out.println(cuenta1.getSaldo());
        
        
        //cuenta 2
        
        CuentaBancaria cuenta2=new CuentaBancaria("2", 100, "Juan");
        
        System.out.println(cuenta2.getCliente());
        System.out.println(cuenta2.getNumeroDeCuenta());
        System.out.println(cuenta2.getSaldo());
        
        
        //cuenta 3
        
        CuentaBancaria cuenta3=new CuentaBancaria();
        
        System.out.println(cuenta3.getCliente());
        System.out.println(cuenta3.getNumeroDeCuenta());
        System.out.println(cuenta3.getSaldo());
        
        
        //constructores
        //metodo
        //todas las clases tienen 1
        //inicializar los atributos de un obejeto
        //se ejecuta primero
        
        
        
        
    }
    
}
