public class Cadenas {
    public static void main(String[] args) {
        
        String texto = "hola";
        System.out.println(texto.toUpperCase()); //todo mayuscula
        System.out.println(texto.toLowerCase()); //todo minuscula
        System.out.println(texto.contains("o")); //verifica si contiene en el texto 
        System.out.println(texto.charAt(1)); //devuelve la letra que esta en la posicion que le pongamos
        System.out.println(texto.concat(" mundo")); //concatena lo que le pongamos a nuestra variable/texto

    }
}
