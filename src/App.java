import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int opcion;
        BilleteraParque bille1 = new BilleteraParque(100, false);
        System.out.println(" ===  Administridador de billeteras para parques tematicos  ===");
        System.out.println("1.  Agregar tickets     2. Establecer tickets");
        System.out.println("3.  Comprar premio      4. Establecer festivo   5. Salir");
        System.out.println("Tu billetera tiene: " + bille1.getTickets() + " boletos");
        System.out.println("Ingrese una opcion: ");

        Scanner scan1 = new Scanner(System.in);
        opcion = scan1.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Cuantos boletos se agregan a tu billetera? ");
                bille1.agregarTickets(10);
                System.out.println("Tu billetera tiene ahora: " + bille1.getTickets());

                break;

            default:
                break;
        }
    }
}
