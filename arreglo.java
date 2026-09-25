import java.util.Scanner;

public class arreglo {

    static Scanner sc = new Scanner(System.in);
    static String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
    static String[] areas={
            "Ropa", "Deportes", "Jugueteria"
        };
    static double[][] ventas= new double[12][3];
        
    public static void main(String[] args) {
        
        //Reemplaza valores nulos por 0
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] =0;
            }
        }
        int opcion;
        do{
        
        //menu
        System.out.println("=========== Menu Sistema de Ventas de Productos=========== ");
            System.out.println("1) Mostrar tabla de ventas \n" + 
                                "2) Ingresar venta \n" + 
                                "3) Eliminar venta \n" + 
                                "4) Buscar venta \n"+
                                "5) finalizar programa");
            System.out.print("Seleccione unaf opción: ");
            opcion=sc.nextInt();

            
            switch (opcion) {
                case 1:
                    tablaDeVentas();
                    break;
                case 2:
                    ingresarVenta();
                    break;
                case 3:
                    eliminarVenta();
                    break;
                case 4:
                    buscarVenta();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error, opcion inesxistente");;
            }
        }while(opcion !=5);
        }
            //Tabla de ventas
    public static void tablaDeVentas() {
        System.out.println("\n========================== Tabla De Ventas ==========================");
        System.out.printf("%-12s | %-12s | %-12s | %-12s%n", "Mes", areas[0], areas[1], areas[2]);
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%-12s | $%-11.2f | $%-11.2f | $%-11.2f%n", 
            meses[i], ventas[i][0], ventas[i][1], ventas[i][2]);
    }
    
}
        //ingresar venta
    public static void ingresarVenta() {
            System.out.println("\n=== Ingresar Venta ===");
        System.out.print("Ingrese el número de mes: ");
        int mes = sc.nextInt() - 1;
        
        System.out.print("Ingrese el numero de área: ");
        int area = sc.nextInt() - 1;
            if (mes >= 0 && mes < 12 && area >= 0 && area < 3) {
            System.out.print("Ingrese el monto de la venta para " + meses[mes] + " en el área de " + areas[area] + ": $");
            ventas[mes][area] = sc.nextDouble();
            System.out.println("¡Venta ingresada correctamente!");
        } else {
            System.out.println("Mes o área no válidos.");
        }
        System.out.println("¡Ventas ingresadas correctamente!");
    }

    //eliminar venta
    public static void eliminarVenta() {
        System.out.println("\n=== Eliminar Venta ===");
        System.out.print("Ingrese el número de mes: ");
        int mes = sc.nextInt() - 1;
        
        System.out.print("Ingrese el numero de área: ");
        int area = sc.nextInt() - 1;

        if (mes >= 0 && mes < 12 && area >= 0 && area < 3) {
            ventas[mes][area] = 0;
            System.out.println("Venta eliminada.");
        } else {
            System.out.println("Mes o área no válidos.");
        }
    }

    //buscar venta
    public static void buscarVenta() {
        System.out.println("\n=== Buscar Venta ===");
        System.out.print("Ingrese el número de mes: ");
        int mes = sc.nextInt() - 1;

        System.out.print("Ingrese el numero de área: ");
        int area = sc.nextInt() - 1;

        if (mes >= 0 && mes < 12 && area >= 0 && area < 3) {
            System.out.println("La venta en " + meses[mes] + " para el área " + areas[area] + " es: $" + ventas[mes][area]);
        } else {
            System.out.println("Mes o área no válidos.");
        }
    }
}

