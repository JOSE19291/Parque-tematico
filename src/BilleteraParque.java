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

    public void setTickets(int tickets) {
        this.tickets = tickets;
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

    public void agregarTickets(int tickets) {
        if (festivo == true) {
            setTickets(tickets);
        } else {

        }
    }

    public boolean removerTickets(int tickets) {
        if (festivo == true) {
            removerTickets(tickets);
            return true;
        } else {
            return false;
        }
    }

}
