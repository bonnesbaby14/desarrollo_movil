package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int opcion;
    private static ArrayList<HerramientaMecanica>lista=new ArrayList<HerramientaMecanica>();

    public static void main(String[] args) {
        while(true){
            System.out.println("Ingresa la opcion deceada");
            System.out.println("[1] Registrar");
            System.out.println("[2] Editar");
            System.out.println("[3] Imprimir");
            opcion = new Scanner(System.in).next();
            switch (opcion) {
                case 1:
                    String marca, modelo,codigo,costo,peso, tamano, dimensines;
                    System.out.println("Digita la marca");
                    marca=new Scanner(System.in).nextLine();
                    System.out.println("Digita el modelo");
                    modelo=new Scanner(System.in).nextLine();

                    System.out.println("Digita el codigo");
                    codigo=new Scanner(System.in).nextLine();

                    System.out.println("Digita el costo");
                    costo=new Scanner(System.in).nextLine();
                    System.out.println("Digita el peso");
                    peso=new Scanner(System.in).nextLine();
                    System.out.println("Digita el tamaño");
                    tamano=new Scanner(System.in).nextLine();
                    System.out.println("Digita las dimensiones");
                    dimensines=new Scanner(System.in).nextLine();


                    lista.add(new HerramientaMecanica(marca,modelo,codigo,costo,peso,tamano,dimensines));
                    System.out.println("Agregado con existo");



                    break;
                case 2:

                    System.out.println("Elige el numero de herramienta a editar");
                    int x=0;
                    for (HerramientaMecanica c:lista) {

                        System.out.println("["+x+"] "+c.getMarca()+"-"+c.getModelo()+"-"+c.getCodigo());
                        x++;

                    }
                    int opcion=new Scanner(System.in).nextInt();

                    HerramientaMecanica aux=lista.get(opcion);


                    System.out.println("Digita la opcion a modificar");
                    System.out.println("[1] marca: "+aux.getMarca());
                    System.out.println("[2] modelo: "+aux.getModelo());
                    System.out.println("[3] codigo: "+aux.getCodigo());
                    System.out.println("[4] costo: "+aux.getCosto());
                    System.out.println("[5] peso: "+aux.getPeso());
                    System.out.println("[6] tamaño: "+aux.getTamano());
                    System.out.println("[7] dimensiones: "+aux.getDimensiones());




                    int opcion2=new Scanner(System.in).nextInt();
                    switch (opcion2){
                        case 1:
                        System.out.println("Digita la marca");
                        aux.setMarca(new Scanner(System.in).nextLine());
                        break;
                        case 2:
                        System.out.println("Digita el modelo");
                        aux.setModelo(new Scanner(System.in).nextLine());

                        break;
                        case 3:
                        System.out.println("Digita el codigo");
                        aux.setCodigo(new Scanner(System.in).nextLine());

                        break;
                        case 4:
                        System.out.println("Digita el costo");
                        aux.setCosto(new Scanner(System.in).nextLine());
                        break;
                        case 5:
                        System.out.println("Digita el peso");
                        aux.setPeso(new Scanner(System.in).nextLine());
                        break;

                        case 6:
                        System.out.println("Digita el tamaño");
                        aux.setTamano(new Scanner(System.in).nextLine());
                        break;
                        case 7:
                        System.out.println("Digita las dimensiones");
                        aux.setDimensiones(new Scanner(System.in).nextLine());
                        break;
                    }
                    System.out.println("Modificado con exito!");





                    break;
                case 3:
                    for (HerramientaMecanica c:lista) {

                        System.out.println("los datos registrados son:");
                        System.out.println(c.getMarca()+" - "+c.getModelo()+" - "+c.getCodigo()+" - "+c.getCosto()+" - "+c.getPeso()+" - "+c.getTamano()+" - "+c.getDimensiones());


                    }
                    break;

            }
        }
    }
}

