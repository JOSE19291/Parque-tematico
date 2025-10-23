public class BilleteraParque {

    private int tickets;
    private static boolean festivo = false;

    public BilleteraParque() {
        this.tickets = 0;
    }

    public BilleteraParque(int tickets, boolean festivo) {
        this.tickets = tickets;
        this.festivo = festivo;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int cantidad) {
        this.tickets = cantidad;
    }

    public static boolean getFestivo() {
        return festivo;
    }

    public static void setFestivo() {

        if (festivo == false) {
            festivo = true;
        } else {
            festivo = false;
        }
    }

    public void agregarTickets(int cantidad) {
        this.tickets += cantidad;
    }

    public boolean removerTickets(int cantidad) {
        if (this.tickets >= tickets) {
            this.tickets -= cantidad;
            return true;
        } else {
            return false;
        }

    }
}
