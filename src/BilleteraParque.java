public class BilleteraParque {

    private int tickets;
    private static boolean festivo = false;

    public BilleteraParque() {
        this.tickets = 0;
    }

    public BilleteraParque(int tickets) {
        this.tickets = 0;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = -tickets;
    }

    public static boolean isFestivo() {
        return festivo;
    }

    public static void setFestivo(boolean festivo) {

        BilleteraParque.festivo = festivo;
    }

    public void agregarTickets(int tickets) {
        if (tickets < 0) {

        } else {

        }
    }

    public boolean removerTickets(int tickets) {
        if (tickets = true) {
            return false;
        } else {

        }
    }

}
