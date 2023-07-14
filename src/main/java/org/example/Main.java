package org.example;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        //Declarando los datos de entrada del problema
        String ubicacionUsuario;
        String destino;
        String nombreUsuario;
        String telefonoUsuario;

        //Declarar un Dato ESPECIAL para capturar informacion desde el teclado
        Scanner teclado=new Scanner(System.in);

        //Para inicializar las VARIABLES
        System.out.println("\u001B[36m PaOndeVas APP  \u001B[0m");

        System.out.print ("Digite su ubicacion: ");
        ubicacionUsuario=teclado.nextLine();

        System.out.print("Digite su Destino: ");
        destino=teclado.nextLine();

        System.out.print("Digite su nombre: ");
        nombreUsuario=teclado.nextLine();

        System.out.print("Digite su telefono: ");
        telefonoUsuario=teclado.nextLine();

        //PROCESO DEL PROBLEMA
        String distancia="20";//ESTO ES UN TEXTO
        //DEBO HACER PARSEO DE LA VARIABLE distanci
        //PARSERO=CAMBIAR O MODIFICAR EN TIPO DE DATO DE UNA VARIABLE
        Integer distanciaEnEntero=Integer.parseInt(distancia);

        Integer costoPorKilometro=6800;
        Integer cobroTotal=distanciaEnEntero*costoPorKilometro;

        //Salidas del problema
        System.out.print("\u001B[33m Señor Usuario \u001B[0m");
        System.out.print("\u001B[33m " +nombreUsuario+ "\u001B[0m");
        System.out.println("\u001B[33m El costo de su viaje es: $" +cobroTotal+ " pesos\u001B[0m");



    }
}