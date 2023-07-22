package edu.EjercicioClase;

import java.util.Scanner;

public class ClsEjercicioClase {

    public void areaCirculo(){
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Área de un círculo");
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo es: " + area); //sout
    }

    public void circunferenciaCirculo(){
        double circun;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Circunferencia de un círculo");
        System.out.print("Ingrese el radio del círculo: ");

        double radio = scanner.nextDouble();

        circun = Math.PI * radio*2;

        System.out.println("La circunferencia del círculo es: " + circun);
    }

    public void volumenCubo(){
        double volumen;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado del cubo: ");

        double lado = scanner.nextDouble();

        volumen = Math.pow(lado, 3);

        System.out.println("El volumne del cubo es: " + volumen);
    }

    public void AreaPiramide(){
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Área de una piramide");
        System.out.print("Ingrese la base de la piramide: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la piramide: ");
        double altura = scanner.nextDouble();

        area = (base*altura)/2;

        System.out.println("El área de la piramide es: " + area);
    }

    public void volumenPiramide(){
        double volumen;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Volumen de una piramide");
        System.out.print("Ingrese la base de la piramide: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la piramide: ");
        double altura = scanner.nextDouble();

        volumen = (Math.pow(base, 2)*altura)/3;
        volumen = (base*altura)/3;

        System.out.println("El volumen de la piramide es: " + volumen);
    }

    public void areaTriangulo(){
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Área de un triangulo");
        System.out.print("Ingrese la base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        double altura = scanner.nextDouble();

        area = (base*altura)/2;

        System.out.println("El área del triangulo es: " + area);
    }

    public void volumenPrisma(){
        double volumen;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Volumen de un prisma rectangular");
        System.out.print("Ingrese el lado cuadrado del prisma: ");
        double lado = scanner.nextDouble();
        System.out.print("Ingrese la altura del prisma: ");
        double altura = scanner.nextDouble();

        volumen = lado*lado*altura;

        System.out.println("El volumen del prisma rectangular es: " + volumen);
    }

    public void areaParalelogramo(){
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Área de un paralelogramo");
        System.out.print("Ingrese la base del paralelogramo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del paralelogramo: ");
        double altura = scanner.nextDouble();

        area = base*altura;

        System.out.println("El área del paralelogramo es: " + area);
    }

    public void volumenCilindro(){
        double volumen;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Volumen de un cilindro");
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        volumen = Math.PI * Math.pow(radio, 2)*altura;

        System.out.println("El volumen del cilindro es: " + volumen);
    }

    public void areaEsfera(){
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Área de una esfera");
        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();

        area = 4*Math.PI * Math.pow(radio, 2);

        System.out.println("El área de la esfera es: " + area);
    }

}
