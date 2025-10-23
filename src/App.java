import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int PRECIO_CAMISETA = 150;
        int PRECIO_SOMBRERO = 350;
        int PRECIO_TENIS = 600;
        int opcion = 0;

        BilleteraParque bille1 = new BilleteraParque(100);

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("\n==Administrador de billeteras para parques temáticos==");
            System.out.println("Tu billetera tiene " + bille1.getTickets() + " tickets");
            System.out.println("Actualmente es festivo: " + BilleteraParque.getFestivo());
            System.out.println("1. Agregar tickets");
            System.out.println("2. Establecer tickets");
            System.out.println("3. Comprar premio");
            System.out.println("4. Establecer festivo");
            System.out.println("5. Salir");

            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos boletos se agregan? ");
                    if (scanner.hasNextInt()) {
                        int cantidadAgregar = scanner.nextInt();
                        bille1.agregarTickets(cantidadAgregar);
                    }
                    scanner.nextLine();
                    break;

                case 2:
                    System.out.print("Establecer saldo de tickets en: ");
                    if (scanner.hasNextInt()) {
                        int cantidadEstablecer = scanner.nextInt();
                        bille1.setTickets(cantidadEstablecer);
                    }
                    scanner.nextLine();
                    break;

                case 3:

                    double factorDescuento = BilleteraParque.getFestivo() ? 0.5 : 1.0;
                    int precioCamiseta = (int) (PRECIO_CAMISETA * factorDescuento);
                    int precioSombrero = (int) (PRECIO_SOMBRERO * factorDescuento);
                    int precioTenis = (int) (PRECIO_TENIS * factorDescuento);

                    if (BilleteraParque.getFestivo()) {
                        System.out.println("¡Precios de vacaciones!");
                    }
                    System.out.println("1. Camiseta (" + precioCamiseta + " tickets)");
                    System.out.println("2. Sombrero (" + precioSombrero + " tickets)");
                    System.out.println("3. Tenis (" + precioTenis + " tickets)");
                    System.out.print("¿Qué premio desea comprar? ");

                    if (scanner.hasNextInt()) {
                        int premioElegido = scanner.nextInt();
                        int costo = 0;
                        String nombrePremio = "";

                        switch (premioElegido) {
                            case 1:
                                costo = precioCamiseta;
                                nombrePremio = "una camiseta";
                                break;
                            case 2:
                                costo = precioSombrero;
                                nombrePremio = "un sombrero";
                                break;
                            case 3:
                                costo = precioTenis;
                                nombrePremio = "unos tenis";
                                break;
                            default:
                                System.out.println("Opción de premio no válida.");
                                continue;
                        }

                        if (bille1.removerTickets(costo)) {
                            System.out.println(
                                    "¡Compra realizada! Compraste " + nombrePremio + " por " + costo + " tickets.");
                        } else {
                            System.out.println("No hay suficientes boletos para comprar " + nombrePremio + ".");
                        }
                    }
                    scanner.nextLine();
                    break;

                case 4:
                    BilleteraParque.setFestivo();
                    if (BilleteraParque.getFestivo()) {
                        System.out.println("Ahora es un día festivo.");
                    } else {
                        System.out.println("Ya no es un día festivo.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 5.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}