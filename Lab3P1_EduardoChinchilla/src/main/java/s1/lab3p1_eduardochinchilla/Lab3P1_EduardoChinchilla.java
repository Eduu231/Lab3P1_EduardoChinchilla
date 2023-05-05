package s1.lab3p1_eduardochinchilla;

import java.util.Scanner;

public class Lab3P1_EduardoChinchilla {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("Menu");
            System.out.println("1. Serie Euclidiana");
            System.out.println("2. Pokebola");
            System.out.println("3. Ok Boomer");
            System.out.println("4. Salir");

            opcion = read.nextInt();

            switch (opcion) {
                case 1: {

                    System.out.println("Ingrese cuantos puntos desea: ");
                    int puntos = read.nextInt();

                    System.out.println("Ingrese X y Y");

                    double suma = 0;
                    
                    for (int z = 1; z <= puntos; z++) {
                        
                        System.out.println("X: ");
                        double x = read.nextInt();
                        System.out.println("Y: ");
                        double y = read.nextInt();
                        
                        double parte1 = (x - y);
                        double parte2 = Math.pow(parte1, 2);
                        suma += parte2;
                        
                    }

                    System.out.println("La distancia euclidiana es: " + Math.sqrt(suma));

                    break;
                }
                case 2: {
                    
                    System.out.println("Ingrese el tamaño deseado: ");
                    int n = read.nextInt();

                    for (int i = 1; i <= n; i++) {

                        for (int j = 1; j <= n * 2 - 1; j++) {

                            if ((i == (n / 2 + 2) || i == n / 2) && (j >= ((n * 2 + 1) / 3) && j < (2 * (n * 2 + 2) / 3)) || (i == n / 2 + 1 && ((j <= (n * 2 - 1) / 3 || j >= (2 * (n * 2 + 2) / 3)) && ((j > 1) && (j < n * 2 - 1))))) {
                                System.out.print("#");
                                
                            } else {
                                
                                if (i < n / 2 + 1 || i == n || (i >= n / 2 + 1 && ((j == 1) || (j == n * 2 - 1)))) {
                                    System.out.print("*");
                                    
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        }
                        
                        System.out.println(" ");
                    }
                    break;
                }
                case 3: {
                    
                    System.out.println("Ingrese su fecha de nacimiento: ");
                    int fecha = read.nextInt();

                    if (fecha >= 1946 && fecha <= 1959) {
                        System.out.println("Felicidades usted es un Baby boomer! ");
                    } else if (fecha >= 1960 && fecha <= 1974) {
                        System.out.println("Felicidades usted es un Generation X! ");
                    } else if (fecha >= 1975 && fecha <= 1979) {
                        System.out.println("Felicidades usted es un Xennials! ");
                    } else if (fecha >= 1980 && fecha <= 1989) {
                        System.out.println("Felicidades usted es un Millenial! ");
                    } else if (fecha >= 1990 && fecha <= 2012) {
                        System.out.println("Felicidades usted es un Gen Z! ");
                    } else if (fecha >= 2013 && fecha <= 2025) {
                        System.out.println("Felicidades usted es un Gen Alpha");
                    } else {
                        System.out.println("Fecha ingresada no esta dentro de las opciones");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Ha salido del menu");
                    break;
                }

                
                
                
                default:
                    System.out.println("Error vuelva a ingresar: ");
                    
            }// fin switch
        }//fin while
    }//fin main
}//fin class
