import java.util.Scanner;
import java.lang.System;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestra veterinaria");

        //Crear el primero objeto mascota.
        pet dog = new pet("Perro", "Rintintin", 4);
        double[] foodSent = new double[4];

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<foodSent.length; i++){
            System.out.println("Ingrese el peso del paquete que comprará:");
            foodSent[i] = scanner.nextDouble();
        }

        System.out. println("El número de paquetes necesario para alimentar a su perro es: " + dog.showQtyFoodPackeges(foodSent));

    }
}