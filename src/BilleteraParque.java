public class BilleteraParque {

    private int tickets;
    private static boolean festivo = false;

    public BilleteraParque() {
        this.tickets = 0; //
    }

    public BilleteraParque(int tickets) {
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public static boolean getFestivo() {
        return festivo;
    }

    public void setTickets(int cantidad) {

        if (cantidad >= 0) {
            this.tickets = cantidad;
        }
    }

    public static void setFestivo() {
        festivo = !festivo;
    }

    public void agregarTickets(int cantidad) {
        if (cantidad >= 0) {
            this.tickets += cantidad;
        }
    }

    public boolean removerTickets(int cantidad) {

        if (cantidad >= 0 && this.tickets >= cantidad) {
            this.tickets -= cantidad;
            return true;
        } else {
            return false;
        }
    }
}