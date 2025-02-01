
public class Sitema {
     public static void main(String[] args) {
        String[] nombres = {"Carlos", "Daniel", "Robert"};
        double[][] calificaciones = {
            {6.5, 9.5, 8.6},
            {7.5, 8.2, 9.8},
            {9.0, 8.5, 8.0}
        };
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }
        int contEstu = 1;
        double promedio = calcularPromedio(calificaciones,contEstu );
        System.out.println("\nEl promedio de " + nombres[contEstu] + " es: " + promedio);
    }

    public static double calcularPromedio(double[][] calificaciones, int cont) {
        double suma = 0;
        for (double calificacion : calificaciones[cont]) {
            suma += calificacion;
        }
        return suma / calificaciones[cont].length;
    }
}

}
