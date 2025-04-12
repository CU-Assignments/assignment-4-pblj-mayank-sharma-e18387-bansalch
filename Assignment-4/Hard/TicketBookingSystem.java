
class TicketCounter {
    private int availableSeats = 10;

    public synchronized void bookTicket(String name, int seats) {
        if (seats <= availableSeats) {
            System.out.println(name + " booking " + seats + " seats.");
            availableSeats -= seats;
            System.out.println("Seats booked. Remaining: " + availableSeats);
        } else {
            System.out.println("Not enough seats for " + name);
        }
    }
}

class BookingThread extends Thread {
    private TicketCounter counter;
    private String name;
    private int seats;

    BookingThread(TicketCounter counter, String name, int seats, int priority) {
        this.counter = counter;
        this.name = name;
        this.seats = seats;
        this.setPriority(priority);
    }

    public void run() {
        counter.bookTicket(name, seats);
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        BookingThread t1 = new BookingThread(counter, "VIP_1", 2, Thread.MAX_PRIORITY);
        BookingThread t2 = new BookingThread(counter, "VIP_2", 3, Thread.MAX_PRIORITY);
        BookingThread t3 = new BookingThread(counter, "Regular_1", 4, Thread.MIN_PRIORITY);
        BookingThread t4 = new BookingThread(counter, "Regular_2", 3, Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
