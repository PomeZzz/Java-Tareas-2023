package Cabañas;

import java.util.Scanner;

public class Actividad_Cabañas {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            double precioCabana = 0;
            int cantidadDias = 0;

        
            InformacionDelUsuario(scanner);

            
            precioCabana = SeleccionDeCabana(scanner);

           
            System.out.print("Ingrese la cantidad de días de alquiler: ");
            cantidadDias = scanner.nextInt();

            
            double precioTotal = precioCabana * cantidadDias;

            
            MostrarInformacion(precioCabana, cantidadDias, precioTotal);
        }

        public static void InformacionDelUsuario(Scanner scanner) {
            System.out.println("Bienvenido al sistema de alquiler de cabañas");
            System.out.print("Ingrese su nombre: ");
            String nombreUsuario = scanner.nextLine();
            System.out.print("Ingrese su dirección de correo electrónico: ");
            String correoUsuario = scanner.nextLine();
           
        }

        public static double SeleccionDeCabana(Scanner scanner) {
            System.out.println("Cabañas disponibles:");
            System.out.println("1. Cabaña de lujo - $200 por día");
            System.out.println("2. Cabaña mid - $150 por día");
            System.out.println("3. Cabaña estándar - $100 por día");
            System.out.print("Seleccione una cabaña (1,2 o 3): ");
            int seleccionCabana = scanner.nextInt();
            double precioCabana = 0;

            switch (seleccionCabana) {
                case 1:
                    precioCabana = 200.0;
                    break;
                case 2:
                    precioCabana = 150.0;
                    break;
                case 3:
                    precioCabana = 100.0;
                default:
                    System.out.println("Selección no válida. Automaticamnte selecionamos la cabaña mid");
                    precioCabana = 150.0;
                    break;
            }

            return precioCabana;
        }

        public static void MostrarInformacion(double precioCabana, int cantidadDias, double precioTotal) {
            System.out.println("\nResumen de la reserva:");
            System.out.println("Precio de la cabaña por día: $" + precioCabana);
            System.out.println("Cantidad de días de alquiler: " + cantidadDias + " días");
            System.out.println("Precio total: $" + precioTotal);
            System.out.println("¡Gracias por contratar cabañas Pome!");
        }
    }
