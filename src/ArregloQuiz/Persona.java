/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArregloQuiz;

import java.util.Scanner;

/**
 *
 * @author 1059356842
 */
public class Persona {

    double datos[] = new double[3];
    Scanner in = new Scanner(System.in);

    void registarPersona() {
        double datoRecibido = 0;
        System.out.println("Registrar saldo de las personas");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Digite el saldo");
            datoRecibido = in.nextDouble();
            datos[i] = datoRecibido;
        }
    }

    void listarInformacion() {
        int contador=0;
        System.out.println("Listando saldpos de las personas");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i]+"/");
            contador++;
        }
        
    }

    void impresionRango() {
        int contador=0;
        System.out.println("Impresion de rango");
        for (int i = 0; i < datos.length; i++) {
            if(datos[i]>=1000000&&datos[i]<=2000000){
                System.out.print(datos[i]+" / ");
                contador++;
            }
            
        }
        if(contador>0){
            System.out.println("hay "+contador+" saldos entre 1'000.000 y  2'000.000");
        }else{
            System.out.println("No hay saldos entre 1'000.000 y  2'000.000");
        }
    }

    void menu() {
        int opcion = 0;
        do {
            System.out.println("");
            System.out.println("""
                           ******MENU DE OPCIONES******
                           
                           1.Registrar Saldos
                           2.Listar Saldos
                           3.Saldos entre 1'000.000 y 2'000.000
                           4.Salir
                               
                           Opcion: 
                           """);
        opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    this.registarPersona();
                    break;
                case 2:
                    this.listarInformacion();
                    break;
                case 3:
                    this.impresionRango();
                    break;
            }
        }while(opcion>0 && opcion<4);
    }
}