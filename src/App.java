import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int opcion;
        BilleteraParque bille1 = new BilleteraParque(100, false);
        bille1.agregarTickets(10);
        System.out.println(bille1.getTickets());

        Scanner scan1 = new Scanner(System.in);
        opcion = scan1.nextInt();

        bille1.agregarTickets(10);
        System.out.println(bille1.getTickets());

        switch (opcion) {
            case 1:

                break;

            default:
                break;
        }
    }
}
