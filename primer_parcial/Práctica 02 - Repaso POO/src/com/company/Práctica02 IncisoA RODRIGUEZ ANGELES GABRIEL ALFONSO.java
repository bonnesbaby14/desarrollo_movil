package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int opcion;
    private static ArrayList<Cita>lista=new ArrayList<Cita>();

    public static void main(String[] args) {
        while(true){
            System.out.println("Ingresa la opcion deceada");
            System.out.println("[1] Registrar");
            System.out.println("[2] Editar");
            System.out.println("[3] Imprimir");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1:
                    String fecha, hora,lugar;
                    System.out.println("Digita la fecha");
                    fecha=new Scanner(System.in).nextLine();
                    System.out.println("Digita la hora");
                    hora=new Scanner(System.in).nextLine();
                    System.out.println("Digita el lugar");
                    lugar=new Scanner(System.in).nextLine();
                    lista.add(new Cita(fecha,hora,lugar));
                    System.out.println("Agregado con existo");





                    break;
                case 2:

                    System.out.println("Elige el numero de cita a editar");
                    int x=0;
                    for (Cita c:lista) {

                        System.out.println("["+x+"] "+c.getLugar()+"-"+c.getHora()+"-"+c.getFecha());
                        x++;

                    }
                    int opcion=new Scanner(System.in).nextInt();

                    Cita aux=lista.get(opcion);


                    System.out.println("Digita la opcion a modificar");
                    System.out.println("[1] fecha: "+aux.getFecha());
                    System.out.println("[2] hora: "+aux.getHora());
                    System.out.println("[3] lugar: "+aux.getLugar());
                    int opcion2=new Scanner(System.in).nextInt();
                    switch (opcion2){
                        case 1:
                            System.out.println("Digita la fecha");
                            aux.setFecha(new Scanner(System.in).nextLine());
                            break;
                        case 2:
                            System.out.println("Digita la hora");
                            aux.setHora(new Scanner(System.in).nextLine());
                            break;

                        case 3:
                            System.out.println("Digita el lugar");
                            aux.setLugar(new Scanner(System.in).nextLine());
                            break;
                    }
                    System.out.println("Modificado con exito!");





                    break;
                case 3:
                    for (Cita c:lista) {

                        System.out.println("los datos registrados son:");
                        System.out.println(c.getLugar()+" - "+c.getHora()+" - "+c.getFecha());


                    }
                    break;

            }
        }
    }
    }

