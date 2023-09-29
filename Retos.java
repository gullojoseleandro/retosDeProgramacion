import java.lang.*;
import java.util.*;
import java.net.*;

public class Retos {
  
  /*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
  public static void fibonacci(long cantVeces){
    long num1 = 0;
    long num2 = 1;
    long num3 = num1 + num2;
    System.out.print(num1 + " " + num2 + " " + num3 + " ");
    for(int i = 0; i <= cantVeces ; i++){
      num1 = num2;
      num2 = num3;
      num3 = num1 + num2;
      System.out.print(num3 + " ");
    }
  }
  
  /*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
  public static void esPrimo(int numero){
    if(numero <= 1){
      System.out.println(numero + ": No es número primo");
      return;
    }
    
    int numPrimos[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
    double raizCuadrada = Math.sqrt(numero);

    for(int i = 0 ; i < numPrimos.length ; i++){
      if(numPrimos[i] <= raizCuadrada && numero % numPrimos[i] == 0){
        System.out.println(numero + ": No es número primo");
        break;
      }
      else{
        System.out.println(numero + ": Es un número primo");
        break;
      }
    }
  }

  /*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
  public static void calcularAreaPoligono(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el poligono deseado en minúscula y sin acentos: (triángulo / cuadrado / rectángulo)");
    String poligono = sc.nextLine();
    
    if(poligono.equals("triangulo")){
      System.out.println("Introduzca la base del triángulo: ");
      double base = sc.nextInt();
      System.out.println("Introduzca la altura del triángulo: ");
      double altura = sc.nextInt();
      double areaTriangulo = (base * altura) / 2;
      System.out.println("El área del triángulo es: " + areaTriangulo);
    }

    if(poligono.equals("rectangulo")){
      System.out.println("Introduzca el lado del cuadrado");
      double lado = sc.nextInt();
      double areaCuadrado = Math.pow(lado, 2);
      System.out.println("El área del cuadrado es: " + areaCuadrado);
    }

    if(poligono.equals("rectangulo")){
      System.out.println("Introduzca la base del rectángulo: ");
      double base = sc.nextInt();
      System.out.println("Introduzca la altura del rectángulo: ");
      double altura = sc.nextInt();
      double areaRectangulo = base * altura;
      System.out.println("El área del rectángulo es: " + areaRectangulo);
    }
  }

  /*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/
 *   mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */
  public static void calculaAspectRatioImagen(URLConnection enlace){
    String finalizar = "Finalizar función :)";
  }
  
}