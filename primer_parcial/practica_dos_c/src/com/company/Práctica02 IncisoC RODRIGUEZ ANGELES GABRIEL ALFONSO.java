package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int opcion;
    private static ArrayList<Persona>lista=new ArrayList<Persona>();

    public static void main(String[] args) {
        while(true){
            System.out.println("Ingresa la opcion deceada");
            System.out.println("[1] Registrar");
            System.out.println("[2] Editar");
            System.out.println("[3] Imprimir");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1:


                    System.out.println("[1] Ingresar alumno ");
                    System.out.println("[2] Ingresar profesor");
                    int opcion0=new Scanner(System.in).nextInt();

                    switch (opcion0){
                        case 1:
                            System.out.println("Ingresa el nombre");
                            String nombre=new Scanner(System.in).nextLine();
                            System.out.println("Ingresa el apellido");
                            String apellido=new Scanner(System.in).nextLine();
                            System.out.println("Ingresa el grado");
                            String grado=new Scanner(System.in).nextLine();

                            lista.add(new Alumno(nombre,apellido,grado));


                            break;
                        case 2:
                            System.out.println("Ingresa el nombre");
                            String nombre1=new Scanner(System.in).nextLine();
                            System.out.println("Ingresa el apellido");
                            String apellido2=new Scanner(System.in).nextLine();
                            System.out.println("Ingresa la materia");
                            String materia=new Scanner(System.in).nextLine();

                            lista.add(new Profesor(nombre1,apellido2,materia));

                            break;


                    }



                    break;
                case 2:

                    System.out.println("Elige el numero de personas a editar");
                    int x=0;
                    for (Persona c:lista) {

                        System.out.println("["+x+"] "+c.getNombre()+"-"+c.getApellido());
                        x++;

                    }
                    int opcion=new Scanner(System.in).nextInt();

                    Persona aux=lista.get(opcion);


                    System.out.println("Digita la opcion a modificar");
                    System.out.println("[1] nombre: "+aux.getNombre());
                    System.out.println("[2] apellido: "+aux.getApellido());





                    int opcion2=new Scanner(System.in).nextInt();
                    switch (opcion2){
                        case 1:
                            System.out.println("Digita el nombre");
                            aux.setNombre(new Scanner(System.in).nextLine());
                            break;
                        case 2:
                            System.out.println("Digita el apellido");
                            aux.setApellido(new Scanner(System.in).nextLine());

                            break;

                    }
                    System.out.println("Modificado con exito!");





                    break;
                case 3:
                    for (Persona c:lista) {


                        c.saludo();

                    }
                    break;

            }
        }
    }
}

