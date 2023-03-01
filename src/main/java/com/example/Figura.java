package com.example;

import java.util.Scanner;

public class Figura {

    double area;
    double perimetro;

    public static void main(String[] args) {
        int opcion;
        double base, altura, radio, lado1, lado2;

        Scanner Sc = new Scanner(System.in);

        do {
            System.out.println("Selecciona la figura para que calcule el area y el perimetro");
            System.out.println("1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Salir");
            opcion = Sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese la base del Triangulo");
                    base = Sc.nextDouble();
                    System.out.println("Ingresa la altura del Triangulo");
                    altura = Sc.nextDouble();
                    System.out.println("Ingrese el lado derecho");
                    lado1 = Sc.nextDouble();
                    System.out.println("Ingrese el lado izquierdo");
                    lado2 = Sc.nextDouble();

                    //Aqui va el codigo

                    System.out.println("El area del Triangulo es: ");
                    System.out.println("El perimetro del Triangulo es: ");
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    System.out.println("Ingrese la base del rectángulo");
                    base = Sc.nextDouble();
                    System.out.println("Ingresa la altura del rectángulo");
                    altura = Sc.nextDouble();

                    //Aqui va el codigo

                    System.out.println("El area del rectángulo es: ");
                    System.out.println("El perimetro del rectángulo es: ");
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    System.out.println("Ingrese el radio del círculo");
                    radio = Sc.nextDouble();


                    //Aqui va el codigo

                    System.out.println("El area del círculo es: ");
                    System.out.println("El perimetro del círculo es: ");
                    System.out.println("-----------------------------");
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;

                default:
                    System.out.println("Opción invalida");
                    break;

            }

        }while (opcion != 4);

    }
}
