package edu.ejercicios;
import edu.EjercicioClase.ClsEjercicioClase;
import edu.ejemplo.clsEjemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {  //static es un metodo que no es necesesario instanciar para usarlo
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("MENU EJERCICIOS CLASE SEMANA 2");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        System.out.print("Elija una opcion: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ejercicio 1");
                ClsEjercicioClase ej = new ClsEjercicioClase();
                ej.areaCirculo();
                break;
            case 2:
                System.out.println("Ejercicio 2");
                ClsEjercicioClase ej2 = new ClsEjercicioClase();
                ej2.circunferenciaCirculo();
                break;


            case 3:
                System.out.println("Ejercicio 3");
                ClsEjercicioClase ej3 = new ClsEjercicioClase();
                ej3.volumenCubo();
                break;
            case 4:
                System.out.println("Ejercicio 4");
                ClsEjercicioClase ej4 = new ClsEjercicioClase();
                ej4.AreaPiramide();
                break;
            case 5:
                System.out.println("Ejercicio 5");
                ClsEjercicioClase ej5 = new ClsEjercicioClase();
                ej5.volumenPiramide();
                break;
            case 6:
                System.out.println("Ejercicio 6");
                ClsEjercicioClase ej6 = new ClsEjercicioClase();
                ej6.areaTriangulo();
                break;
            case 7:
                System.out.println("Ejercicio 7");
                ClsEjercicioClase ej7 = new ClsEjercicioClase();
                ej7.volumenPrisma();
                break;
            case 8:
                System.out.println("Ejercicio 8");
                ClsEjercicioClase ej8 = new ClsEjercicioClase();
                ej8.areaParalelogramo();
                break;
            case 9:
                System.out.println("Ejercicio 9");
                ClsEjercicioClase ej9 = new ClsEjercicioClase();
                ej9.volumenCilindro();
                break;
                case 10:
                System.out.println("Ejercicio 10");
                ClsEjercicioClase ej10 = new ClsEjercicioClase();
                ej10.areaEsfera();
                break;
        }
        }
        }




        /*int VarA, VarB;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese el valor de A: ");
        String a = br.readLine();
        VarA = Integer.parseInt(a);
        System.out.println("Ingrese el valor de B: ");
        VarB = Integer.parseInt(br.readLine());

        /*VarA=900;
        VarB=400;

        clsEjemplo ej = new clsEjemplo();
        ej.calculo(VarA, VarB);*/

