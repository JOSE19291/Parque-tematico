import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion;
        BilleteraParque bille1 = new BilleteraParque(100);
        Scanner scan1 = new Scanner(System.in);
        opcion = scan1.nextInt();

        System.out.println(bille1.getTickets() + "Tienes");

        switch (opcion) {
            case 1:

                break;

            default:
                break;
        }
    }
}
