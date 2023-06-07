/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cuentas;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Main {

    
    
    /**
     * Metodo que realiza la creacion de una cuenta.
     * 
     * @param args
     * 
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        
        operativa_cuenta(cuenta1, 50);
/*
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
  */
        }
    
    
    
     /**
     * Metodo que realiza las operaciones con el objeto cuenta1.
     * 
     * @param cuenta nombre de la cuenta que se va a editar
     * @param cantidad cantidad a ingresar o retirar
     * 
     * 
     */

    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eliga que quiere realizar");
        System.out.println("1.Ingresar");
        System.out.println("2.Retirar");
        int opc = sc.nextInt();
        
        switch (opc) {
            case 1:
                try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
                break;
                
            case 2:
                try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
                break;
        }
        
        
    }
}