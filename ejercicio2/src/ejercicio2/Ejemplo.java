package ejercicio2;

public class Ejemplo {

	public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();

        String titulo;
        String autor;
        int formato;
        double duracion;

        // Obtener los datos del usuario
        titulo = myScanner.pedirString("título");
        autor = myScanner.pedirString("autor");
        formato = myScanner.pedirInt();
        duracion = myScanner.pedirDouble();

        //imprimir sus detalles
        System.out.println("Pelicula creada:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Formato: " + formato);
        System.out.println("Duración: " + duracion);


	}

}
