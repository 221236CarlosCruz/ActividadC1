package com.upchiapas.actividadc1;

import java.util.Scanner;

public class Main {

    private static Scanner teclado = new Scanner(System.in);

    static void AltaVehiculos() {

        System.out.println("");
        System.out.println("CUANTOS VEHICULOS DESEA REGISTRAR: ");
        byte cantidadVehiculos = teclado.nextByte();

        short[] arregloModelo = new short [cantidadVehiculos];
        String[] arregloPlaca = new String [cantidadVehiculos];
        String[] arregloColor = new String [cantidadVehiculos];
        String[] arregloMarca = new String [cantidadVehiculos];

        //placa

        byte auxiliar1=2;
        for(int i=0; i<cantidadVehiculos; i++) {

            String placa;

            System.out.println("");

            System.out.println("INGRESE LA PLACA: ");
            if (auxiliar1==2) {
                teclado.nextLine();
                auxiliar1= 4;
            }
            else {

            }

            arregloPlaca[i] = placa = teclado.nextLine();

        }

        for(int i=0; i<cantidadVehiculos; i++ ) {
            System.out.println(arregloPlaca[i]);
        }

        //modelo
        for(int i=0; i<cantidadVehiculos; i++) {

            short modelo;

            System.out.println("");
            System.out.println("INGRESE EL MODELO: ");
            arregloModelo[i] = modelo = teclado.nextShort();

        }

        for(int i=0; i<cantidadVehiculos; i++ ) {
            System.out.println(arregloModelo[i]);
        }

        //color

        byte auxiliar2=2;
        for(int i=0; i<cantidadVehiculos; i++) {

            String color;

            System.out.println("");

            System.out.println("INGRESE EL COLOR: ");
            if (auxiliar2==2) {
                teclado.nextLine();
                auxiliar2= 4;
            }
            else {

            }

            arregloColor[i] = color = teclado.nextLine();

        }

        for(int i=0; i<cantidadVehiculos; i++ ) {
            System.out.println(arregloColor[i]);
        }

        // marca

        byte auxiliar3=4;
        for(int i=0; i<cantidadVehiculos; i++) {

            String marca;

            System.out.println("");

            System.out.println("INGRESE LA MARCA: ");
            if (auxiliar3==2) {
                teclado.nextLine();
                auxiliar3= 2;
            }
            else {

            }

            arregloMarca[i] = marca = teclado.nextLine();

        }

        for(int i=0; i<cantidadVehiculos; i++ ) {
            System.out.println(arregloMarca[i]);
        }
    }

    static void altaChoferes() {

        System.out.println("");
        System.out.println("CUANTOS CHOFERES DESEAS REGISTRAR: ");
        byte cantidadChoferes = teclado.nextByte();

        String[] arregloNombreChofer = new String [cantidadChoferes];
        int[] arregloIdChofer = new int [cantidadChoferes];
        int[] auxIdChofer = new int [cantidadChoferes];

        //nombre - apellido

        byte auxiliar4=2;
        for(int i=0; i<cantidadChoferes; i++) {

            String nombreChofer;

            System.out.println("");

            System.out.println("INGRESE EL NOMBRE COMPLETO DEL CHOFER: ");
            if (auxiliar4==2) {
                teclado.nextLine();
                auxiliar4= 4;
            }
            else {

            }

            arregloNombreChofer[i] = nombreChofer = teclado.nextLine();

        }

        for(int i=0; i<cantidadChoferes; i++ ) {
            System.out.println(arregloNombreChofer[i]);
        }

        //ID
        int idChofer;
        byte auxiliar5=2;
        for(int i=0; i<cantidadChoferes; i++) {

            System.out.println("");

            System.out.println("INGRESE EL ID DEL CHOFER: ");

            if (auxiliar4==2) {
                teclado.nextLine();
                auxiliar4= 4;
            }
            else {

            }

            arregloIdChofer[i] = idChofer = teclado.nextInt();

        }

        for(int i=0; i<cantidadChoferes; i++ ) {
            System.out.println(arregloIdChofer[i]);
            auxIdChofer[i]=arregloIdChofer[i];
        }

    }

    //Asignacion de Choferes a Vehiculos
    static void ChoferesAVehiculos(int arregloIdChofer,int auxIdChofer,byte cantidadChoferes, byte cantidadVehiculos, int idChofer1, String nombreChofer, String apellidosChofer, String marca, short modelo, String color,String placa,int opcionId,String opcionPlaca) {

        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("CHOFERES DISPONIBLES: ");

        System.out.println("*" + idChofer1 + " - " + nombreChofer + " - " + apellidosChofer);

        System.out.println("");
        System.out.println("VEHICULOS DISPONIBLES: ");
        System.out.println("*" + placa + " - " + marca + " - " + modelo + " - " + color);

        System.out.println("");
        System.out.println("SELECCIONE AL CHOFER INTRODUCIENDO SU ID Y SELECCIONE EL VEHICULO INTRODUCIENDO LA PLACA");

        System.out.println("");
        System.out.println("CHOFER A ELEGIR: ");
        opcionId = teclado.nextInt();

        System.out.println("");
        teclado.nextLine();
        System.out.println("VEHICULO A ELEGIR: ");
        opcionPlaca = teclado.nextLine();
    }

    static void listaUnidades(int opcionId, String opcionPlaca, int idChofer, String nombreChofer, String apellidosChofer,String marca, short modelo,String placa ) {
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("- La Unidad 1 = EL AUTO MARCA: "+ marca + " CON MODELO " + modelo + " Y PLACA " + placa + " " + "ES CONDUCIDO POR " + idChofer + " " + nombreChofer + " " + apellidosChofer);
    }


    static int pagoGenerado(byte condicionPago,int cobro, int suma) {

        do {
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("");
            System.out.println("Ingrese la cantidad del cobro del servicio: ");
            cobro = teclado.nextInt();
            suma = cobro + suma;
            System.out.println("Desea continuar: ");
            System.out.println("Escriba 1 (Si desea continuar) / o de lo contrario 0 (Si no desea continuar): ");
            condicionPago = teclado.nextByte();

        }while(condicionPago==1);
        return suma;
    }

    public static void main (String[]args) {

        byte opcion = 0;
        byte condicionPago = 0;
        byte cantidadVehiculos;
        String placa = null;
        short modelo = 0;
        int cobro = 0;
        int suma = 0;
        String color = null;
        String marca = null;
        String nombreChofer= null;
        String apellidosChofer = null;
        int idChofer = 0;
        byte opcion2=0;
        int opcionId=0;
        String opcionPlaca = null;


        while(opcion!=7){

            System.out.println("/////////.SITIO DE TAXIS//////////");
            System.out.println("");

            System.out.println("1.ALTA DEL VEHICULO");
            System.out.println("2.ALTA DE CHOFER");
            System.out.println("3.ASIGNACION DE CHOFER A VEHICULO");
            System.out.println("4.REGISTRAR PAGO GENERADO POR EL SERVICIOS GENERADO");
            System.out.println("5.IMPRIMIR LISTA DE UNIDADES CON LOS CHOFERES ASIGNADOS AL MOMENTO DEL REGISTRO");
            System.out.println("6.IMPRIMIR LA GANACIA TOTAL GENERADA ");
            System.out.println("7 SALIR");
            System.out.println("CUAL SERIA SU OPCION: ");
            opcion = teclado.nextByte();

            switch(opcion) {
                case 1:
                    AltaVehiculos();
                    break;
                case 2:
                    altaChoferes();
                    break;
                case 3:
                    int arregloIdChoferes = 0;
                    ChoferesAVehiculos(arregloIdChoferes,opcion2, opcion2, opcion2, arregloIdChoferes, nombreChofer, apellidosChofer, placa, modelo, marca, color, opcionId, opcionPlaca);
                    break;
                case 4:
                    pagoGenerado(condicionPago, cobro, suma);
                    break;
                case 5:
                    listaUnidades(opcionId, opcionPlaca, idChofer, nombreChofer, apellidosChofer,marca, modelo,placa);
                    break;
                case 6:
                    System.out.println("Las ganancias generadas son: "+ suma);
                    break;
                default:
            }


        }
        System.out.println("PROGRAMA TERMINADO");
    }

}
