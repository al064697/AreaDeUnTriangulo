//area de un triangulo de la forma A = bc/2

import java.util.Scanner;
import java.lang.Math;

//definiendo clase
public class Main {

    //definiendo main
    public static void main(String[] args) {

        //definiendo Scanner
        Scanner input = new Scanner(System.in);

        //definiendo variables
        System.out.print("Ingresa un angulo para el triangulo ");
        double a = input.nextDouble();
        System.out.print("Ingresa un valor para b ");
        double b = input.nextDouble();
        System.out.print("Ingresa un valor para c ");
        double c = input.nextDouble();

        //calculando el area
        double area = ((b * c) / 2) * Math.sin(a);
        System.out.println("area = " + area);
    }
}