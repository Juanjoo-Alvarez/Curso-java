public class Switch {
    public static void main(String[] args) {
        int opcion = 5;

        switch(opcion){
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            default:
                System.out.println("No hay numero en el switch");
                break;
        }
    }
}
